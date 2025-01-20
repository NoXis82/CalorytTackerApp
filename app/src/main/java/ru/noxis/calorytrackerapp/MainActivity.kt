package ru.noxis.calorytrackerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import ru.noxis.calorytrackerapp.navigation.NavigateRoot
import ru.noxis.calorytrackerapp.ui.theme.CalorytTackerAppTheme
import ru.noxis.core.domain.preferences.Preferences
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val shouldShowOnboarding = preferences.loadShouldShowOnboarding()
        setContent {
            CalorytTackerAppTheme {
                NavigateRoot(shouldShowOnboarding)
            }
        }
    }
}
