plugins {
    id(Plugins.androidLibrary)
    id(Plugins.baseAndroidPlugin)
}

dependencies {
    // Project modules
    implementation(project(Modules.domain))

    // Networking
    implementation(Dependencies.moshi)
    kapt(Dependencies.moshiKotlinCodeGen)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLogger)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofitMoshi)

    // Room
    implementation(Dependencies.room)
    kapt(Dependencies.roomCompiler)
    implementation(Dependencies.roomKtx)

    // Debug tools
    implementation(Dependencies.stethoOkHttp)

    // Unit Testing
    testImplementation(Dependencies.roomTest)
}
