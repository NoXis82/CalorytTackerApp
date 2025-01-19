plugins {
    alias(libs.plugins.calorytrackerapp.android.library.compose)
    alias(libs.plugins.calorytrackerapp.android.hilt)
}

android {
    namespace = "ru.noxis.tracker_presentation"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(project(":core-ui"))
    implementation(project(":core"))
    implementation(project(":tracker:tracker_domain"))

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}