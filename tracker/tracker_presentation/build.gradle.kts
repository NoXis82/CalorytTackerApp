plugins {
    alias(libs.plugins.calorytrackerapp.android.library.compose)
}

android {
    namespace = "ru.noxis.tracker_presentation"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}