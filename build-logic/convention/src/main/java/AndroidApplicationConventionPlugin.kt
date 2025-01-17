import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import ru.noxis.convention.configureKotlinAndroid
import ru.noxis.convention.libs

class AndroidApplicationConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {

            pluginManager.run {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
                val versionMajor = libs.findVersion("versionMajor").get().toString().toInt()
                val versionMinor = libs.findVersion("versionMinor").get().toString().toInt()
                val versionPatch = libs.findVersion("versionPatch").get().toString().toInt()

                defaultConfig {
                    applicationId = libs.findVersion("bundleId").get().toString()
                    minSdk = libs.findVersion("projectMinSdkVersion").get().toString().toInt()
                    targetSdk = libs.findVersion("projectTargetSdkVersion").get().toString().toInt()
                    versionCode = libs.findVersion("versionBuild").get().toString().toInt()
                    versionName = "${versionMajor}.${versionMinor}.${versionPatch}"

                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }
                configureKotlinAndroid(this)
            }
        }
    }
}
