package ru.noxis.tracker_data.mapper

import ru.noxis.tracker_data.local.entity.TrackedFoodEntity
import ru.noxis.tracker_data.remote.dto.Product
import ru.noxis.tracker_domain.model.MealType
import ru.noxis.tracker_domain.model.TrackableFood
import ru.noxis.tracker_domain.model.TrackedFood
import java.time.LocalDate
import kotlin.math.roundToInt

fun TrackedFoodEntity.toTrackedFood(): TrackedFood {
    return TrackedFood(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        mealType = MealType.fromString(type),
        amount = amount,
        date = LocalDate.of(year, month, dayOfMonth),
        calories = calories,
        id = id
    )
}

fun TrackedFood.toTrackedFoodEntity(): TrackedFoodEntity {
    return TrackedFoodEntity(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        type = mealType.name,
        amount = amount,
        dayOfMonth = date.dayOfMonth,
        month = date.monthValue,
        year = date.year,
        calories = calories,
        id = id
    )
}

fun Product.toTrackableFood(): TrackableFood? {
    val carbsPer100g = nutriments.carbohydrates100g?.roundToInt() ?: 0
    val proteinPer100g = nutriments.proteins100g?.roundToInt() ?: 0
    val fatPer100g = nutriments.proteins100g?.roundToInt() ?: 0
    val caloriesPer100g = nutriments.energyKcal100g?.roundToInt() ?: 0
    return TrackableFood(
        name = productName ?: return null,
        carbsPer100g = carbsPer100g,
        proteinPer100g = proteinPer100g,
        fatPer100g = fatPer100g,
        caloriesPer100g = caloriesPer100g,
        imageUrl = imageFrontThumbUrl
    )
}