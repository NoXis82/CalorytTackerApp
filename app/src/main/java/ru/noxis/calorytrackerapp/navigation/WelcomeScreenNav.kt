package ru.noxis.calorytrackerapp.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ru.noxis.core.navigation.Route
import ru.noxis.onboarding_presentation.welcome.WelcomeScreen

fun NavGraphBuilder.welcomeScreen(navController: NavController) {
    composable<Route.Welcome> {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            WelcomeScreen(
                modifier = Modifier.padding(innerPadding),
                onNavigate = navController::navigate
            )
        }
    }
}