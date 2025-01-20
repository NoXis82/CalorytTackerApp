package ru.noxis.calorytrackerapp.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ru.noxis.core.navigation.Route
import ru.noxis.tracker_presentation.tracker_overview.TrackerOverviewScreen

fun NavGraphBuilder.trackerOverviewScreen(
    navController: NavController,
    innerPadding: PaddingValues
) {
    composable<Route.TrackerOverview> {
        TrackerOverviewScreen(
            modifier = Modifier.padding(innerPadding),
            onNavigateToSearch = { mealName, day, month, year ->
                navController.navigate(
                    route = Route.Search(
                        mealName = mealName,
                        dayOfMonth = day,
                        month = month,
                        year = year
                    )
                )
            }
        )
    }
}