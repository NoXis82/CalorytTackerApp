package ru.noxis.tracker_data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import ru.noxis.tracker_data.local.TrackerDao
import ru.noxis.tracker_data.mapper.toTrackableFood
import ru.noxis.tracker_data.mapper.toTrackedFood
import ru.noxis.tracker_data.mapper.toTrackedFoodEntity
import ru.noxis.tracker_data.remote.OpenFoodApi
import ru.noxis.tracker_domain.model.TrackableFood
import ru.noxis.tracker_domain.model.TrackedFood
import ru.noxis.tracker_domain.repository.TrackerRepository
import java.time.LocalDate

class TrackerRepositoryImpl(
    private val dao: TrackerDao,
    private val api: OpenFoodApi
) : TrackerRepository {

    override suspend fun searchFood(
        query: String,
        page: Int,
        pageSize: Int
    ): Result<List<TrackableFood>> {
        return try {
            val searchDto = api.searchFood(
                query = query,
                page = page,
                pageSize = pageSize
            )
            Result.success(
                searchDto.products
                    .filter {
                        val carbohydrates100g = it.nutriments.carbohydrates100g ?: 0.00
                        val proteins100g = it.nutriments.proteins100g ?: 0.00
                        val fat100g = it.nutriments.fat100g ?: 0.00
                        val energyKcal100g = it.nutriments.energyKcal100g ?: 0.00

                        val calculatedCalories =
                            carbohydrates100g * 4f + proteins100g * 4f + fat100g * 9f
                        val lowerBound = calculatedCalories * 0.99f
                        val upperBound = calculatedCalories * 1.01f
                       energyKcal100g in (lowerBound..upperBound)
                    }
                    .mapNotNull { it.toTrackableFood() }
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Result.failure(e)
        }
    }

    override suspend fun insertTrackedFood(food: TrackedFood) {
        dao.insertTrackedFood(food.toTrackedFoodEntity())
    }

    override suspend fun deleteTrackedFood(food: TrackedFood) {
        dao.deleteTrackedFood(food.toTrackedFoodEntity())
    }

    override fun getFoodsForDate(localDate: LocalDate): Flow<List<TrackedFood>> {
        return dao.getFoodsForDate(
            day = localDate.dayOfMonth,
            month = localDate.monthValue,
            year = localDate.year
        ).map { entities ->
            entities.map { it.toTrackedFood() }
        }
    }
}
