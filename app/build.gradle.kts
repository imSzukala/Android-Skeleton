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

    // TODO Generate debug keystore
    signingConfigs {
        getByName(Config.debug) {
            storeFile = rootProject.file(Config.debugKeyStore)
        }
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
            signingConfig = signingConfigs.getByName(Config.debug)
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    packagingOptions {
        exclude("META-INF/LICENSE*")
    }

    dataBinding {
        isEnabled = true
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

    // Ui
    implementation(Dependencies.material)

    // Navigation
    implementation(Dependencies.navigationFragment)
    implementation(Dependencies.navigationUi)

    // Lifecycle
    implementation(Dependencies.viewModel)
    implementation(Dependencies.liveData)

    // Di
    implementation(Dependencies.koinAndroid)
    implementation(Dependencies.koinViewModel)

    // Debug tools
    implementation(Dependencies.stetho)
    debugImplementation(Dependencies.leakCanary)

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
