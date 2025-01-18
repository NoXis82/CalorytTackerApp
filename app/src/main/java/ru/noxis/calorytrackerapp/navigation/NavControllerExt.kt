package ru.noxis.calorytrackerapp.navigation

import androidx.navigation.NavController
import ru.noxis.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}