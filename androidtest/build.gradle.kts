plugins {
    id(Plugins.androidLibrary)
    id(Plugins.baseAndroidPlugin)
}

dependencies {
    implementation(Dependencies.jUnit5)
    implementation(Dependencies.jUnit5Params)
    runtimeOnly(Dependencies.jUnit5Engine)
    implementation(Dependencies.liveDataTest)
}
