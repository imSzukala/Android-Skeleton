plugins {
    id(Plugins.androidLibrary)
    id(Plugins.baseAndroidPlugin)
}

dependencies {
    // Project modules
    implementation(project(Modules.usecases))
    implementation(project(Modules.base))
    implementation(project(Modules.navigation))
}
