package ru.noxis.calorytrackerapp.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.SnackbarHostState
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ru.noxis.core.navigation.Route
import ru.noxis.onboarding_presentation.weight.WeightScreen

fun NavGraphBuilder.weightScreen(
    navController: NavController,
    snackbarHostState: SnackbarHostState,
    innerPadding: PaddingValues
) {
    composable<Route.Weight> {
        WeightScreen(
            modifier = Modifier.padding(innerPadding),
            snackbarHostState = snackbarHostState,
            onNextClick = { navController.navigate(Route.Activity) }
        )
    }
}