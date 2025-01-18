plugins {
    alias(libs.plugins.calorytrackerapp.android.library)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "ru.noxis.core"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(libs.kotlinx.serialization.json)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}