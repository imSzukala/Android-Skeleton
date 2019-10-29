plugins {
    `java-library`
    kotlin("jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {

    // Jar files
    implementation(fileTree(Dependencies.jarFiles))

    // Kotlin
    implementation(kotlin(Dependencies.stdLib, Versions.kotlin))
    implementation(Dependencies.coroutines)
}
