val implementation by configurations
val testImplementation by configurations
val testRuntimeOnly by configurations

/**
 * Base dependencies for all modules.
 * Contains:
 * - Base Kotlin dependencies
 * - Coroutines
 * - Base unit test dependencies
 */
dependencies {
    // Jar files
    implementation(fileTree(Dependencies.jarFiles))

    // Kotlin
    implementation(kotlin(Dependencies.stdLib, Versions.kotlin))
    implementation(Dependencies.coroutines)

    // Unit testing
    testImplementation(Dependencies.jUnit5)
    testImplementation(Dependencies.jUnit5Params)
    testRuntimeOnly(Dependencies.jUnit5Engine)
    testImplementation(Dependencies.mockK)
    testImplementation(Dependencies.coroutinesTest)
}
