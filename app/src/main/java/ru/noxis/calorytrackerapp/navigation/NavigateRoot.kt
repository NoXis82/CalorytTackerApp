package ru.noxis.calorytrackerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import ru.noxis.core.navigation.Route

@Composable
fun NavigateRoot() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Route.Welcome
    ) {
        welcomeScreen(navController)
        ageScreen(navController)
        genderScreen(navController)
        heightScreen(navController)
        weightScreen(navController)
        nutrientGoalScreen(navController)
        activityScreen(navController)
        goalScreen(navController)
        trackerOverviewScreen(navController)
        searchScreen(navController)
    }
}