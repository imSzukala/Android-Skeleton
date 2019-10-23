object Versions {

    object App {
        private const val versionMajor = 0
        private const val versionMinor = 1
        private const val versionPatch = 0

        const val versionCode = 1
        const val versionName = "$versionMajor.$versionMinor.$versionPatch"

        const val compileSdk = 29
        const val minSdk = 21
        const val targetSdk = 29
    }

    object Build {
        const val androidGradle = "3.5.1"
    }

    object Kotlin {
        const val kotlin = "1.3.50"
        const val ktx = "1.1.0"
        const val coroutines = "1.3.1"
    }

    object Android {
        const val jetpack = "1.1.0"
    }

    object Test {
        const val jUnit4 = "4.12"
        const val espressoCore = "3.2.0"
    }

    object Ui {
        const val constraintLayout = "1.1.3"
    }
}
