package ru.noxis.calorytrackerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import ru.noxis.calorytrackerapp.navigation.NavigateRoot
import ru.noxis.calorytrackerapp.ui.theme.CalorytTackerAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalorytTackerAppTheme {
                NavigateRoot()
            }
        }
    }
}
