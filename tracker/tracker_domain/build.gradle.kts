plugins {
    alias(libs.plugins.calorytrackerapp.android.library)
    alias(libs.plugins.calorytrackerapp.android.hilt)
}

android {
    namespace = "ru.noxis.tracker_domain"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(project(":core"))

    testImplementation(libs.junit)
    testImplementation(libs.mockk)
    testImplementation(libs.mockkAndroid)
    testImplementation(libs.mockkAgentAndroid)
    testImplementation(libs.truth)
    testImplementation(libs.dexmaker)

    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}