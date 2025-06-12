package dev.havlicektomas.notemark.auth.domain

data class AuthInfo(
    val accessToken: String? = null,
    val refreshToken: String? = null
)
