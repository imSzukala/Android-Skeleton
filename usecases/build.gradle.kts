plugins {
    `java-library`
    kotlin("jvm")
    id(Plugins.baseDependencies)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    // Project modules
    implementation(project(Modules.domain))
    implementation(project(Modules.data))
}
