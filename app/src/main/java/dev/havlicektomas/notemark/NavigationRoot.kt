package dev.havlicektomas.notemark

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import dev.havlicektomas.notemark.auth.presentation.intro.IntroScreenRoot
import dev.havlicektomas.notemark.auth.presentation.login.LoginScreenRoot
import dev.havlicektomas.notemark.auth.presentation.register.RegisterScreenRoot

@Composable
fun NavigationRoot(
    navController: NavHostController,
    isLoggedIn: Boolean
) {
    NavHost(
        navController = navController,
        startDestination = Route.Auth
    ) {
        authGraph(navController)
    }
}

private fun NavGraphBuilder.authGraph(navController: NavHostController) {
    navigation<Route.Auth>(
        startDestination = AuthRoute.Intro
    ) {
        composable<AuthRoute.Intro> {
            IntroScreenRoot()
        }
        composable<AuthRoute.Login> {
            LoginScreenRoot()
        }
        composable<AuthRoute.Register> {
            RegisterScreenRoot ()
        }
    }
}