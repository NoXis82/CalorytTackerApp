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
fun NavigateRoot() {
    val navController = rememberNavController()
    val snackbarHostState = remember { SnackbarHostState() }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Route.Welcome
        ) {
            welcomeScreen(navController, innerPadding)
            ageScreen(navController, snackbarHostState, innerPadding)
            genderScreen(navController, innerPadding)
            heightScreen(navController)
            weightScreen(navController)
            nutrientGoalScreen(navController)
            activityScreen(navController)
            goalScreen(navController)
            trackerOverviewScreen(navController)
            searchScreen(navController)
        }
    }
}