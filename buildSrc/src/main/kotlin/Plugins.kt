object Plugins {

    // Build
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val android = "android"
    const val androidExtensions = "android.extensions"
    const val kapt = "kapt"

    // Gradle
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradle}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    // Navigation
    const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val safeArgs = "androidx.navigation.safeargs.kotlin"

    // Testing
    const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val jUnit5Gradle = "de.mannodermaus.gradle.plugins:android-junit5:${Versions.jUnit5Gradle}"
    const val jUnit5 = "de.mannodermaus.android-junit5"
    const val jUnit5Builder = "de.mannodermaus.junit5.AndroidJUnit5Builder"
    const val jUnit5Argument = "runnerBuilder"
}
