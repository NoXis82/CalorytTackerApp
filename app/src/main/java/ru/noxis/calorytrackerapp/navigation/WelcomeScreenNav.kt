package ru.noxis.calorytrackerapp.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ru.noxis.core.navigation.Route
import ru.noxis.onboarding_presentation.welcome.WelcomeScreen

fun NavGraphBuilder.welcomeScreen(navController: NavController, innerPadding: PaddingValues) {
    composable<Route.Welcome> {
        WelcomeScreen(
            modifier = Modifier.padding(innerPadding),
            onNavigate = { navController.navigate(Route.Gender) }
        )
    }
}
