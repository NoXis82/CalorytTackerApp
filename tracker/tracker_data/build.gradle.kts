plugins {
    alias(libs.plugins.calorytrackerapp.android.library)
    alias(libs.plugins.calorytrackerapp.android.room)
    alias(libs.plugins.calorytrackerapp.android.okhttp)
    alias(libs.plugins.calorytrackerapp.android.retrofit)
    alias(libs.plugins.calorytrackerapp.android.hilt)
}

android {
    namespace = "ru.noxis.tracker_data"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(project(":tracker:tracker_domain"))

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}