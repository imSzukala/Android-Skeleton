plugins {
    id(Plugins.androidApplication)
    id(Plugins.baseAndroidPlugin)
}

android {
    defaultConfig {
        applicationId = Config.applicationId
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
        getByName(Config.dev) {
            applicationIdSuffix = ".${Config.dev}"
            versionNameSuffix = "-${Config.dev}"
            signingConfig = signingConfigs.getByName(Config.debug)
        }
    }
}

dependencies {
    // Project modules
    implementation(project(Modules.data))
    implementation(project(Modules.network))
    implementation(project(Modules.usecases))
    implementation(project(Modules.main))
    implementation(project(Modules.messages))

    // Debug tools
    implementation(Dependencies.stetho)
    debugImplementation(Dependencies.leakCanary)
}
