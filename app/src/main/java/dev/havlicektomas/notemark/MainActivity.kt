package dev.havlicektomas.notemark

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import dev.havlicektomas.notemark.core.presentation.designsystem.theme.NoteMarkTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModel<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                viewModel.state.isCheckingAuth
            }
        }
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NoteMarkTheme {
                if (!viewModel.state.isCheckingAuth){
                    val navController = rememberNavController()
                    NavigationRoot(
                        navController = navController,
                        isLoggedIn = viewModel.state.isLoggedIn
                    )
                }
            }
        }
    }
}
