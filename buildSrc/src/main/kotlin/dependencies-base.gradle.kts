val implementation by configurations
val testImplementation by configurations
val testRuntimeOnly by configurations

dependencies {
    // Jar files
    implementation(fileTree(Dependencies.jarFiles))

    // Kotlin
    implementation(kotlin(Dependencies.stdLib, Versions.kotlin))
    implementation(Dependencies.coroutines)

    // Unit Testing
    testImplementation(Dependencies.jUnit5)
    testImplementation(Dependencies.jUnit5Params)
    testRuntimeOnly(Dependencies.jUnit5Engine)
    testImplementation(Dependencies.mockK)
}
