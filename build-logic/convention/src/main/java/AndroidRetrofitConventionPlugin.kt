import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import ru.noxis.convention.libs

class AndroidRetrofitConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {

        target.run {
            dependencies {
                "api"(libs.findLibrary("retrofit").get())
                "implementation"(libs.findLibrary("moshiConverter").get())
                "implementation"(libs.findLibrary("moshi").get())
            }
        }
    }
}