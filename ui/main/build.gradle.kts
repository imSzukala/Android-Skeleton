plugins {
    id(Plugins.androidLibrary)
    id(Plugins.baseAndroidPlugin)
}

dependencies {
    // Project modules
    implementation(project(Modules.usecases))

    // Di
    implementation(Dependencies.koinAndroid)
}
