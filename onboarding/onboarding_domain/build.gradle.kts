plugins {
    alias(libs.plugins.calorytrackerapp.android.library)
    alias(libs.plugins.calorytrackerapp.android.hilt)
}

android {
    namespace = "ru.noxis.onboarding_domain"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(project(":core"))

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}