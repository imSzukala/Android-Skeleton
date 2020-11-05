plugins {
    id(Plugins.androidLibrary)
    id(Plugins.baseAndroidPlugin)
}

dependencies {
    // Project modules
    implementation(project(Modules.usecases))
    implementation(project(Modules.design))
    implementation(project(Modules.navigation))
    implementation(project(Modules.domain))

    // Unit testing
    testImplementation(project(Modules.basetest))
}
