package ru.noxis.tracker_presentation.tracker_overview

import ru.noxis.tracker_domain.model.TrackedFood

sealed interface TrackerOverviewEvent {
    data object OnNextDayClick: TrackerOverviewEvent
    data object OnPreviousDayClick: TrackerOverviewEvent
    data class OnToggleMealClick(val meal: Meal): TrackerOverviewEvent
    data class OnDeleteTrackedFoodClick(val trackedFood: TrackedFood): TrackerOverviewEvent
}