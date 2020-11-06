plugins {
    id(Plugins.androidLibrary)
    id(Plugins.baseAndroidPlugin)
    id(Plugins.uiAndroidDependencies)
}

dependencies {
    // Project modules
    implementation(project(Modules.usecases))
    implementation(project(Modules.design))
    implementation(project(Modules.navigation))
}
