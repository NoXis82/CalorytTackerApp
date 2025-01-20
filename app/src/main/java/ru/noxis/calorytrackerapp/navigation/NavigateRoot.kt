package ru.noxis.calorytrackerapp.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import ru.noxis.core.navigation.Route

@Composable
fun NavigateRoot(shouldShowOnboarding: Boolean) {
    val navController = rememberNavController()
    val snackbarHostState = remember { SnackbarHostState() }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = if (shouldShowOnboarding) Route.Welcome else Route.TrackerOverview
        ) {
            welcomeScreen(navController, innerPadding)
            ageScreen(navController, snackbarHostState, innerPadding)
            genderScreen(navController, innerPadding)
            heightScreen(navController, snackbarHostState, innerPadding)
            weightScreen(navController, snackbarHostState, innerPadding)
            nutrientGoalScreen(navController, snackbarHostState, innerPadding)
            activityScreen(navController, innerPadding)
            goalScreen(navController, innerPadding)
            trackerOverviewScreen(navController, innerPadding)
            searchScreen(navController, snackbarHostState, innerPadding)
        }
    }
}