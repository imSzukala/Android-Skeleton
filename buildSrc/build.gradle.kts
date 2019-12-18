plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    jcenter()
}

// TODO move ids to external properties
dependencies {
    compileOnly(gradleApi())
    implementation("com.android.tools.build:gradle:3.5.3")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
}

gradlePlugin {
    plugins {
        register("base-android-plugin") {
            id = "com.szukalairena.androidskeleton.baseandroidplugin"
            implementationClass = "BaseAndroidPlugin"
        }
    }
}
