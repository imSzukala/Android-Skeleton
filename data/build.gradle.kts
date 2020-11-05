plugins {
    id(Plugins.androidLibrary)
    id(Plugins.baseAndroidPlugin)
}

dependencies {
    // Project modules
    implementation(project(Modules.domain))

    // Di
    implementation(Dependencies.koinAndroid)

    // Unit testing
    testImplementation(Dependencies.koinTest)
    testImplementation(project(Modules.basetest))
}
