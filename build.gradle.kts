plugins {
    id(Plugins.gradleVersions).version(Versions.gradleVersions)
    jacoco
}

buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
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

tasks {
    @Suppress("UNUSED_VARIABLE")
    val clean by registering(Delete::class) {
        delete(rootProject.buildDir)
    }

    @Suppress("UNUSED_VARIABLE")
    val generateMergedJacocoReport by registering(JacocoReport::class) {
        executionData.setFrom(fileTree(projectDir) { include(Jacoco.moduleReportsExecPattern) })
        classDirectories.setFrom(
            fileTree(projectDir) {
                include(Jacoco.classIncludes)
                exclude(Jacoco.classExcludes)
            }
        )
        reports {
            xml.isEnabled = false
            xml.destination = file("${buildDir}${Jacoco.XML_REPORT_DESTINATION_SUFFIX}")
            html.isEnabled = true
            html.destination = file("${buildDir}${Jacoco.HTML_REPORT_DESTINATION_SUFFIX}")
        }
    }
}
