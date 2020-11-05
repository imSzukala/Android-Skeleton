plugins {
    id(Plugins.androidLibrary)
    id(Plugins.baseAndroidPlugin)
}

dependencies {
    // Project modules
    implementation(project(Modules.domain))
    implementation(project(Modules.data))

    // Di
    implementation(Dependencies.koinAndroid)

    // Unit testing
    testImplementation(Dependencies.koinTest)
}
