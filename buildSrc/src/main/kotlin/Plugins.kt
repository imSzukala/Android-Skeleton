object Plugins {
    // Build
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val android = "kotlin-android"
    const val androidExtensions = "kotlin-android-extensions"
    const val kapt = "kotlin-kapt"

    const val baseAndroidPlugin = "com.szukalairena.androidskeleton.baseandroidplugin"
    const val baseAndroidDependencies = "dependencies-android-base"
    const val uiAndroidDependencies = "dependencies-android-ui"
    const val baseDependencies = "dependencies-base"

    // Navigation
    const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val safeArgs = "androidx.navigation.safeargs.kotlin"

    // Testing
    const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val jUnit5Gradle = "de.mannodermaus.gradle.plugins:android-junit5:${Versions.jUnit5Gradle}"
    const val jUnit5 = "de.mannodermaus.android-junit5"
    const val jUnit5Builder = "de.mannodermaus.junit5.AndroidJUnit5Builder"
    const val jUnit5Argument = "runnerBuilder"

    // Quality
    const val ktlint = "com.pinterest:ktlint:${Versions.ktlint}"
    const val gradleVersions = "com.github.ben-manes.versions"
}
