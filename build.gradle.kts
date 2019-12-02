plugins {
    id(Plugins.gradleVersions).version(Versions.gradleVersions)
}

buildscript {
    repositories {
        google()
        jcenter()

    }

    dependencies {
        classpath(Plugins.androidGradlePlugin)
        classpath(Plugins.kotlinGradlePlugin)
        classpath(Plugins.navigationSafeArgs)
        classpath(Plugins.jUnit5Gradle)
    }
}

allprojects {

    apply {
        from(rootProject.file(Config.ktlintGradle))
    }

    repositories {
        google()
        jcenter()

    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
