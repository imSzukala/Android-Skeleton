object Dependencies {

    object General {
        val jarFiles = mapOf("dir" to "libs", "include" to listOf("*.jar"))
    }

    object Kotlin {
        const val ktx = "androidx.core:core-ktx:${Versions.Kotlin.ktx}"
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Kotlin.kotlin}"

        private const val kotlinX = "org.jetbrains.kotlinx:kotlinx"
        const val coroutines = "$kotlinX-coroutines-core:${Versions.Kotlin.coroutines}"
        const val coroutinesAndroid = "$kotlinX-coroutines-android:${Versions.Kotlin.coroutines}"
    }

    object Android {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.Android.jetpack}"
    }

    object Test {
        const val jUnit4 = "junit:junit:${Versions.Test.jUnit4}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.Test.espressoCore}"
    }

    object Ui {
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.Ui.constraintLayout}"
    }
}
