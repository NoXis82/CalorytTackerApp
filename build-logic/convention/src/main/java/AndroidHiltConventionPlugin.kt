import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import ru.noxis.convention.libs

class AndroidHiltConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("com.google.dagger.hilt.android")
                apply("com.google.devtools.ksp")
            }

            dependencies {
                "implementation"(libs.findLibrary("hilt.android").get())
                "implementation"(libs.findLibrary("hilt.navigation.compose").get())
                "implementation"(libs.findLibrary("room.ktx").get())
                "ksp"(libs.findLibrary("hilt.android.compiler").get())
                "ksp"(libs.findLibrary("hilt.android.compiler").get())
                "kspAndroidTest"(libs.findLibrary("hilt.android.compiler").get())
                "androidTestImplementation"(libs.findLibrary("hilt.android.testing").get())
            }
        }
    }

}