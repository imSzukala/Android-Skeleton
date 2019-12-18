val implementation by configurations
val testImplementation by configurations
val androidTestImplementation by configurations
val androidTestRuntimeOnly by configurations

dependencies {

    // Kotlin
    implementation(Dependencies.coroutinesAndroid)

    // AndroidX
    implementation(Dependencies.core)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.constraintLayout)

    // Ui
    implementation(Dependencies.material)

    // Navigation
    implementation(Dependencies.navigationFragment)
    implementation(Dependencies.navigationUi)

    // Lifecycle
    implementation(Dependencies.viewModel)
    implementation(Dependencies.liveData)

    // Unit Testing
    testImplementation(Dependencies.liveDataTest)

    // Instrumentation Testing
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(Dependencies.testRunner)
    androidTestImplementation(Dependencies.jUnit5)
    androidTestImplementation(Dependencies.jUnit5Core)
    androidTestRuntimeOnly(Dependencies.jUnit5Runner)
}
