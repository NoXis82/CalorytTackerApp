package ru.noxis.tracker_domain.use_case

import kotlinx.coroutines.flow.Flow
import ru.noxis.tracker_domain.model.TrackedFood
import ru.noxis.tracker_domain.repository.TrackerRepository
import java.time.LocalDate

class GetFoodsForDate(
    private val repository: TrackerRepository
) {
    operator fun invoke(date: LocalDate): Flow<List<TrackedFood>> {
        return repository.getFoodsForDate(date)
    }
}
