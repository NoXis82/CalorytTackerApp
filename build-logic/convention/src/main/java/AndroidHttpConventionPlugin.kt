import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import ru.noxis.convention.libs

class AndroidHttpConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {

            dependencies {
                "implementation"(libs.findLibrary("okHttp").get())
                "implementation"(libs.findLibrary("okHttpLoggingInterceptor").get())
            }

        }
    }

}