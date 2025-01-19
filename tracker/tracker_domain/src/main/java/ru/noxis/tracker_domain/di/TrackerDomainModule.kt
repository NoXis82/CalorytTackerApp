package ru.noxis.tracker_domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import ru.noxis.core.domain.preferences.Preferences
import ru.noxis.tracker_domain.repository.TrackerRepository
import ru.noxis.tracker_domain.use_case.CalculateMealNutrients
import ru.noxis.tracker_domain.use_case.DeleteTrackedFood
import ru.noxis.tracker_domain.use_case.GetFoodsForDate
import ru.noxis.tracker_domain.use_case.SearchFood
import ru.noxis.tracker_domain.use_case.TrackFood
import ru.noxis.tracker_domain.use_case.TrackerUseCases

@Module
@InstallIn(ViewModelComponent::class)
object TrackerDomainModule {

    @ViewModelScoped
    @Provides
    fun provideTrackerUseCases(
        repository: TrackerRepository,
        preferences: Preferences
    ): TrackerUseCases {
        return TrackerUseCases(
            trackFood = TrackFood(repository),
            searchFood = SearchFood(repository),
            getFoodsForDate = GetFoodsForDate(repository),
            deleteTrackedFood = DeleteTrackedFood(repository),
            calculateMealNutrients = CalculateMealNutrients(preferences)
        )
    }
}