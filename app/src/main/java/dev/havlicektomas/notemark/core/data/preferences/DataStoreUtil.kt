package dev.havlicektomas.notemark.core.data.preferences

import android.content.Context
import androidx.datastore.core.Serializer
import androidx.datastore.dataStore
import dev.havlicektomas.notemark.auth.domain.AuthInfo
import dev.havlicektomas.notemark.core.data.crypto.Crypto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import java.io.InputStream
import java.io.OutputStream
import java.util.Base64

val Context.authDataStore by dataStore(
    fileName = "encrypted_user_preferences",
    serializer = EncryptedAuthInfoSerializer
)

object EncryptedAuthInfoSerializer: Serializer<AuthInfo> {
    override val defaultValue: AuthInfo
        get() = AuthInfo()

    override suspend fun readFrom(input: InputStream): AuthInfo {
        val encryptedBytes = withContext(Dispatchers.IO) {
            input.use { it.readBytes() }
        }
        val encryptedBytesDecoded = Base64.getDecoder().decode(encryptedBytes)
        val decryptedBytes = Crypto.decrypt(encryptedBytesDecoded)
        val decodedJsonString = decryptedBytes.decodeToString()
        return Json.decodeFromString(decodedJsonString)
    }

    override suspend fun writeTo(t: AuthInfo, output: OutputStream) {
        val json = Json.encodeToString(t)
        val bytes = json.toByteArray()
        val encryptedBytes = Crypto.encrypt(bytes)
        val encryptedBytesBase64 = Base64.getEncoder().encode(encryptedBytes)
        withContext(Dispatchers.IO) {
            output.use {
                it.write(encryptedBytesBase64)
            }
        }
    }
}