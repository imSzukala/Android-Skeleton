plugins {
    id(Plugins.androidApplication)
    kotlin(Plugins.android)
    kotlin(Plugins.androidExtensions)
    kotlin(Plugins.kapt)
    id(Plugins.safeArgs)
    id(Plugins.jUnit5)
}

android {
    compileSdkVersion(Versions.compileSdk)

    defaultConfig {
        applicationId = Config.applicationId
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        testInstrumentationRunner = Plugins.instrumentationRunner
        testInstrumentationRunnerArgument(Plugins.jUnit5Argument, Plugins.jUnit5Builder)
    }

    buildTypes {
        getByName(Config.debug) {
            isDebuggable = true
            applicationIdSuffix = ".${Config.debug}"
            versionNameSuffix = "-${Config.debug}"
        }
        getByName(Config.release) {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        create(Config.dev) {
            initWith(getByName(Config.release))
            applicationIdSuffix = ".${Config.dev}"
            versionNameSuffix = "-${Config.dev}"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    packagingOptions {
        exclude("META-INF/LICENSE*")
    }
}

dependencies {

    // Project modules
    implementation(project(Modules.domain))
    implementation(project(Modules.data))

    // Jar files
    implementation(fileTree(Dependencies.jarFiles))

    // Kotlin
    implementation(kotlin(Dependencies.stdLib, Versions.kotlin))
    implementation(Dependencies.coroutines)
    implementation(Dependencies.coroutinesAndroid)

    // AndroidX
    implementation(Dependencies.core)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.constraintLayout)

    // Navigation
    implementation(Dependencies.navigationFragment)
    implementation(Dependencies.navigationUi)

    // Lifecycle
    implementation(Dependencies.viewModel)
    implementation(Dependencies.liveData)

    // Di
    implementation(Dependencies.koinAndroid)
    implementation(Dependencies.koinViewModel)

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

    // Unit Testing
    testImplementation(Dependencies.jUnit5)
    testImplementation(Dependencies.jUnit5Params)
    testRuntimeOnly(Dependencies.jUnit5Engine)
    testImplementation(Dependencies.liveDataTest)
    testImplementation(Dependencies.koinTest)
    testImplementation(Dependencies.mockK)

    // Instrumentation Testing
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(Dependencies.testRunner)
    androidTestImplementation(Dependencies.jUnit5)
    androidTestImplementation(Dependencies.jUnit5Core)
    androidTestRuntimeOnly(Dependencies.jUnit5Runner)
}
