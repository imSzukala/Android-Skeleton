plugins {
    `java-library`
    kotlin("jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(Dependencies.jUnit5)
    implementation(Dependencies.jUnit5Params)
    runtimeOnly(Dependencies.jUnit5Engine)
    implementation(Dependencies.coroutinesTest)
}
