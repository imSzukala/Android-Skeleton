val implementation by configurations
val testImplementation by configurations
val androidTestImplementation by configurations
val androidTestRuntimeOnly by configurations

/**
 * UI dependencies for Android modules.
 * Contains:
 * - Navigation
 * - Android KTX dependencies
 * - Lifecycle dependencies
 */
dependencies {
    // AndroidX
    implementation(Dependencies.appCompat)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.fragment)

    // Ui
    implementation(Dependencies.material)

    // Navigation
    implementation(Dependencies.navigationFragment)
    implementation(Dependencies.navigationUi)

    // Lifecycle
    implementation(Dependencies.viewModel)
    implementation(Dependencies.liveData)

    // Unit testing
    testImplementation(Dependencies.liveDataTest)
}
