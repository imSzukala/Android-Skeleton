object Plugins {

    object Build {
        const val androidApplication = "com.android.application"
        const val kotlinAndroid = "android"
        const val kotlinAndroidExtensions = "android.extensions"

        const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.Build.androidGradle}"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.kotlin}"
    }

    object Test {
        const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}
