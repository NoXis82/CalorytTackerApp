plugins {
    alias(libs.plugins.calorytrackerapp.android.library.compose)
}

android {
    namespace = "ru.noxis.core_ui"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(libs.bundles.compose)
    implementation(libs.bundles.compose.debug)


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}