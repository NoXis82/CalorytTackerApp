plugins {
    alias(libs.plugins.calorytrackerapp.android.library)
}

android {
    namespace = "ru.noxis.onboarding_domain"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}