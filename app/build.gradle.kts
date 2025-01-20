plugins {
    alias(libs.plugins.calorytrackerapp.android.application.compose)
    alias(libs.plugins.calorytrackerapp.android.hilt)
}

android {

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.material3)

    implementation(project(":core-ui"))
    implementation(project(":core"))
    implementation(project(":onboarding:onboarding_domain"))
    implementation(project(":onboarding:onboarding_presentation"))
    implementation(project(":tracker:tracker_domain"))
    implementation(project(":tracker:tracker_data"))
    implementation(project(":tracker:tracker_presentation"))

    implementation(libs.navigation.compose)

    testImplementation(libs.mockk)
    testImplementation(libs.truth)


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.test.manifest)
}