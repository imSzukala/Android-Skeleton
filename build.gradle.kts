buildscript {
    repositories {
        google()
        jcenter()

    }

    dependencies {
        classpath(Plugins.Build.androidGradlePlugin)
        classpath(Plugins.Build.kotlinGradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()

    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
