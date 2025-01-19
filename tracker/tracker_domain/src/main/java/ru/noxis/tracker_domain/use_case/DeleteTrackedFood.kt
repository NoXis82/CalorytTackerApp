package ru.noxis.tracker_domain.use_case

import ru.noxis.tracker_domain.model.TrackedFood
import ru.noxis.tracker_domain.repository.TrackerRepository

class DeleteTrackedFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(trackedFood: TrackedFood) {
        repository.deleteTrackedFood(trackedFood)
    }
}
