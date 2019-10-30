plugins {
    id(Plugins.androidLibrary)
    kotlin(Plugins.android)
    kotlin(Plugins.androidExtensions)
    kotlin(Plugins.kapt)
    id(Plugins.jUnit5)
}

android {
    compileSdkVersion(Versions.compileSdk)

    buildTypes {
        create(Config.dev) {
            initWith(getByName(Config.release))
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {

    // Project modules
    implementation(project(Modules.domain))

    // Jar files
    implementation(fileTree(Dependencies.jarFiles))

    // Kotlin
    implementation(kotlin(Dependencies.stdLib, Versions.kotlin))
    implementation(Dependencies.coroutines)
    implementation(Dependencies.coroutinesAndroid)

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
    testImplementation(Dependencies.jUnit5)
    testImplementation(Dependencies.jUnit5Params)
    testRuntimeOnly(Dependencies.jUnit5Engine)
    testImplementation(Dependencies.mockK)
    testImplementation(Dependencies.roomTest)
}
