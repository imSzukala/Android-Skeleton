plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    jcenter()
}

dependencies {
    compileOnly(gradleApi())
    implementation("com.android.tools.build:gradle:${Versions.gradle}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
}

object Versions {
    const val gradle = "4.1.0"
    const val kotlin = "1.4.10"
}

gradlePlugin {
    plugins {
        register("base-android-plugin") {
            id = "com.szukalairena.androidskeleton.baseandroidplugin"
            implementationClass = "BaseAndroidPlugin"
        }
    }
}
