package ru.noxis.calorytrackerapp.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.SnackbarHostState
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import ru.noxis.core.navigation.Route
import ru.noxis.tracker_presentation.search.SearchScreen

fun NavGraphBuilder.searchScreen(
    navController: NavController,
    snackbarHostState: SnackbarHostState,
    innerPadding: PaddingValues
) {
    composable<Route.Search> { backStackEntry ->
        SearchScreen(
            modifier = Modifier.padding(innerPadding),
            snackbarHostState = snackbarHostState,
            mealName = backStackEntry.toRoute<Route.Search>().mealName,
            dayOfMonth = backStackEntry.toRoute<Route.Search>().dayOfMonth,
            month = backStackEntry.toRoute<Route.Search>().month,
            year = backStackEntry.toRoute<Route.Search>().year,
            onNavigateUp = { navController.navigateUp() }
        )
    }
}