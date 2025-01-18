package ru.noxis.calorytrackerapp.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ru.noxis.core.navigation.Route
import ru.noxis.onboarding_presentation.goal.GoalScreen
import ru.noxis.onboarding_presentation.welcome.WelcomeScreen

fun NavGraphBuilder.goalScreen(navController: NavController, innerPadding: PaddingValues) {
    composable<Route.Goal> {
        GoalScreen(
            modifier = Modifier.padding(innerPadding),
            onNextClick = {}
        )
    }
}