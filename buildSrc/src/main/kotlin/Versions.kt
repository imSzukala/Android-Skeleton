object Versions {

    // App
    private const val versionMajor = 0
    private const val versionMinor = 1
    private const val versionPatch = 0

    // TODO Enable Bitrise build versioning
    val versionCode = (System.getenv("BITRISE_BUILD_NUMBER") ?: "1").toInt()
    const val versionName = "$versionMajor.$versionMinor.$versionPatch"

    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29

    // Build plugins
    const val jUnit5Gradle = "1.5.2.0"

    // Kotlin
    const val kotlin = "1.3.61"
    const val kotlinJdk = "8"
    const val coroutines = "1.3.2"

    // AndroidX
    const val core = "1.3.0-alpha01"
    const val appCompat = "1.2.0-alpha02"
    const val constraintLayout = "2.0.0-beta4"
    const val recyclerView = "1.1.0-rc01"
    const val cardView = "1.0.0"

    // Room
    const val room = "2.2.3"

    // Ui
    const val material = "1.2.0-alpha04"
    const val lottie = "3.1.0"

    // Navigation
    const val navigation = "2.2.0"

    // Lifecycle
    const val lifecycle = "2.2.0"

    // Di
    const val koin = "2.1.0-alpha-10"

    // Networking
    const val moshi = "1.9.2"
    const val okHttp = "4.3.1"
    const val retrofit = "2.7.1"

    // Debug tools
    const val leakCanary = "2.1"
    const val stetho = "1.5.1"

    // Permissions
    const val easyPermissions = "3.0.0"

    // Time
    const val threeTen = "1.2.1"

    // Unit Testing
    const val jUnit5 = "5.6.0"
    const val coreTest = "2.1.0"
    const val mockK = "1.9.3"

    // Instrumentation Testing
    const val espressoCore = "3.3.0-alpha03"
    const val testRunner = "1.3.0-alpha03"
    const val jUnit5Runner = "1.2.0"

    // Quality
    const val ktlint = "0.36.0"
    const val gradleVersions = "0.27.0"
}
