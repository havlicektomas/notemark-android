package dev.havlicektomas.notemark

data class MainState(
    val isLoggedIn: Boolean = false,
    val isCheckingAuth: Boolean = false
)
