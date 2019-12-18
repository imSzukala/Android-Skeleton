import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class BaseAndroidPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.configurePlugins()
        project.configureAndroid()
        project.configureDependencies()
    }
}

internal fun Project.configureAndroid() = this.extensions.getByType<BaseExtension>().run {
    compileSdkVersion(Versions.compileSdk)

    defaultConfig {
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        testInstrumentationRunner = Plugins.instrumentationRunner
        testInstrumentationRunnerArgument(Plugins.jUnit5Argument, Plugins.jUnit5Builder)
    }

    buildTypes {
        create(Config.dev) {
            initWith(getByName(Config.release))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    packagingOptions {
        exclude("META-INF/LICENSE*")
    }

    dataBinding {
        isEnabled = true
    }
}

internal fun Project.configureDependencies() {
    plugins.apply(Plugins.baseDependencies)
    plugins.apply(Plugins.androidDependencies)
}

internal fun Project.configurePlugins() {
    plugins.apply(Plugins.android)
    plugins.apply(Plugins.androidExtensions)
    plugins.apply(Plugins.kapt)
    plugins.apply(Plugins.jUnit5)
    plugins.apply(Plugins.safeArgs)
}
