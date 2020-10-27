plugins {
    id(Plugins.androidLibrary)
    id(Plugins.baseAndroidPlugin)
}

dependencies {
    // Project modules
    implementation(project(Modules.domain))
    implementation(project(Modules.data))

    // Networking
    implementation(Dependencies.moshi)
    implementation(Dependencies.moshiKotlin)
    kapt(Dependencies.moshiKotlinCodeGen)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLogger)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofitMoshi)

    // Di
    implementation(Dependencies.koinAndroid)
}
