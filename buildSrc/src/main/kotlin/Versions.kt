object Versions {

    // App
    private const val versionMajor = 0
    private const val versionMinor = 1
    private const val versionPatch = 0

    // TODO Enable Bitrise build versioning
    val versionCode = (System.getenv("BITRISE_BUILD_NUMBER") ?: "1").toInt()
    const val versionName = "$versionMajor.$versionMinor.$versionPatch"

    const val compileSdk = 30
    const val minSdk = 21
    const val targetSdk = 30

    // Build plugins
    const val jUnit5Gradle = "1.6.2.0"

    // Kotlin
    const val kotlin = "1.4.10"
    const val kotlinJdk = "8"
    const val coroutines = "1.4.0-M1"

    // AndroidX
    const val core = "1.3.2"
    const val appCompat = "1.2.0"
    const val constraintLayout = "2.0.2"
    const val recyclerView = "1.1.0"
    const val cardView = "1.0.0"

    // Room
    const val room = "2.2.5"

    // Ui
    const val material = "1.2.1"
    const val lottie = "3.4.4"

    // Navigation
    const val navigation = "2.3.1"

    // Lifecycle
    const val lifecycle = "2.2.0"

    // Di
    const val koin = "2.1.6"

    // Networking
    const val moshi = "1.11.0"
    const val okHttp = "4.9.0"
    const val retrofit = "2.9.0"

    // Debug tools
    const val leakCanary = "2.5"
    const val stetho = "1.5.1"

    // Permissions
    const val easyPermissions = "3.0.0"

    // Unit Testing
    const val jUnit5 = "5.7.0"
    const val coreTest = "2.1.0"
    const val mockK = "1.10.2"

    // Instrumentation Testing
    const val espressoCore = "3.3.0"
    const val testRunner = "1.3.0"
    const val jUnit5Runner = "1.2.0"

    // Quality
    const val ktlint = "0.39.0"
    const val gradleVersions = "0.33.0"

    // Desugaring
    const val desugaring = "1.0.10"
}
