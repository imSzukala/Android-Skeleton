val implementation by configurations
val testImplementation by configurations
val androidTestImplementation by configurations
val androidTestRuntimeOnly by configurations

/**
 * Base dependencies for Android modules.
 * Contains:
 * - Core Kotlin extensions for Android
 * - Coroutines extensions for Android
 * - Koin
 * - Desugaring
 * - Base Android Instrumentation test dependencies
 */
dependencies {
    // Kotlin
    implementation(Dependencies.coroutinesAndroid)

    // AndroidX
    implementation(Dependencies.core)

    // Di
    implementation(Dependencies.koinAndroid)
    implementation(Dependencies.koinViewModel)

    // Unit testing
    testImplementation(Dependencies.koinTest)

    // Desugaring
    add(Config.desugaringConfig, Dependencies.desugaring)

    // Instrumentation testing
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(Dependencies.testRunner)
    androidTestImplementation(Dependencies.jUnit5)
    androidTestImplementation(Dependencies.jUnit5Core)
    androidTestRuntimeOnly(Dependencies.jUnit5Runner)
    androidTestImplementation(Dependencies.mockKAndroid)
}
