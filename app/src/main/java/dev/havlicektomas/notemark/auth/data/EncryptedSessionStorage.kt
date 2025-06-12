package dev.havlicektomas.notemark.auth.data

import android.content.Context
import dev.havlicektomas.notemark.auth.domain.AuthInfo
import dev.havlicektomas.notemark.auth.domain.SessionStorage
import dev.havlicektomas.notemark.core.data.preferences.authDataStore
import kotlinx.coroutines.flow.firstOrNull

class EncryptedSessionStorage(
    private val context: Context
): SessionStorage {
    override suspend fun get(): AuthInfo? {
        return context.authDataStore.data.firstOrNull()
    }

    override suspend fun set(info: AuthInfo?) {
        info?.let {
            context.authDataStore.updateData { it }
        }
    }
}