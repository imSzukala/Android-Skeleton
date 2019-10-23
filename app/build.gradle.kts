plugins {
    id(Plugins.Build.androidApplication)
    kotlin(Plugins.Build.kotlinAndroid)
    kotlin(Plugins.Build.kotlinAndroidExtensions)
}

android {
    compileSdkVersion(Versions.App.compileSdk)
    defaultConfig {
        applicationId = Config.Application.applicationId
        minSdkVersion(Versions.App.minSdk)
        targetSdkVersion(Versions.App.targetSdk)
        versionCode = Versions.App.versionCode
        versionName = Versions.App.versionName
        testInstrumentationRunner = Plugins.Test.instrumentationRunner
    }
    buildTypes {
        getByName(Config.BuildType.debug) {
            isDebuggable = true
            applicationIdSuffix = ".${Config.BuildType.debug}"
            versionNameSuffix = "-${Config.BuildType.debug}"
        }
        getByName(Config.BuildType.release) {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        create(Config.BuildType.dev) {
            initWith(getByName(Config.BuildType.release))
            applicationIdSuffix = ".${Config.BuildType.dev}"
            versionNameSuffix = "-${Config.BuildType.dev}"
        }
    }
}

dependencies {
    // Jar files
    implementation(fileTree(Dependencies.General.jarFiles))

    // Kotlin
    implementation(Dependencies.Kotlin.stdLib)
    implementation(Dependencies.Kotlin.ktx)
    implementation(Dependencies.Kotlin.coroutines)
    implementation(Dependencies.Kotlin.coroutinesAndroid)

    // Android
    implementation(Dependencies.Android.appCompat)

    // Test
    testImplementation(Dependencies.Test.jUnit4)
    androidTestImplementation(Dependencies.Test.espressoCore)

    // Ui
    implementation(Dependencies.Ui.constraintLayout)
}
