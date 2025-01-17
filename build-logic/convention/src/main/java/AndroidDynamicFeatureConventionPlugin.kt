import com.android.build.api.dsl.DynamicFeatureExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin
import ru.noxis.convention.ExtensionType
import ru.noxis.convention.addUiLayerDependencies
import ru.noxis.convention.configureAndroidCompose
import ru.noxis.convention.configureBuildTypes
import ru.noxis.convention.configureKotlinAndroid

class AndroidDynamicFeatureConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
//            pluginManager.run {
//                apply("com.android.dynamic-feature")
//                apply("org.jetbrains.kotlin.android")
//            }
            extensions.configure<DynamicFeatureExtension> {
                configureKotlinAndroid(this)
                configureAndroidCompose(this)

                configureBuildTypes(
                    commonExtension = this,
                    extensionType = ExtensionType.DYNAMIC_FEATURE
                )
            }

            dependencies {
                addUiLayerDependencies(target)
                "testImplementation"(kotlin("test"))
            }
        }
    }
}