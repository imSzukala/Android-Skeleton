object Dependencies {
    // General
    val jarFiles = mapOf("dir" to "libs", "include" to listOf("*.jar"))

    // Kotlin
    const val stdLib = "stdlib-jdk${Versions.kotlinJdk}"
    private const val kotlinX = "org.jetbrains.kotlinx:kotlinx"
    const val coroutines = "$kotlinX-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "$kotlinX-coroutines-android:${Versions.coroutines}"

    // AndroidX
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"

    // Ui
    const val material = "com.google.android.material:material:${Versions.material}"
    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"

    // Room
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"

    // Navigation
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    // Lifecycle
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

    // Di
    private const val koin = "org.koin:koin"
    const val koinAndroid = "$koin-android:${Versions.koin}"
    const val koinViewModel = "$koin-androidx-viewmodel:${Versions.koin}"
    const val koinScope = "$koin-androidx-scope:${Versions.koin}"
    const val koinExperimental = "$koin-androidx-ext:${Versions.koin}"

    // Networking
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val moshiKotlinCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLogger = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"

    // Debug tools
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
    const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
    const val stethoOkHttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"

    // Permissions
    const val easyPermissions = "pub.devrel:easypermissions:${Versions.easyPermissions}"

    // Unit testing
    const val jUnit5 = "org.junit.jupiter:junit-jupiter-api:${Versions.jUnit5}"
    const val jUnit5Params = "org.junit.jupiter:junit-jupiter-params:${Versions.jUnit5}"
    const val jUnit5Engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.jUnit5}"
    const val liveDataTest = "androidx.arch.core:core-testing:${Versions.coreTest}"
    const val koinTest = "$koin-test:${Versions.koin}"
    const val roomTest = "androidx.room:room-testing:${Versions.room}"
    const val okHttpMock = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"
    const val mockK = "io.mockk:mockk:${Versions.mockK}"
    const val coroutinesTest = "$kotlinX-coroutines-test:${Versions.coroutines}"

    // Instrumentation testing
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val jUnit5Core = "de.mannodermaus.junit5:android-test-core:${Versions.jUnit5Runner}"
    const val jUnit5Runner = "de.mannodermaus.junit5:android-test-runner:${Versions.jUnit5Runner}"
    const val mockKAndroid = "io.mockk:mockk-android:${Versions.mockK}"

    // Desugaring
    const val desugaring = "com.android.tools:desugar_jdk_libs:${Versions.desugaring}"
}
