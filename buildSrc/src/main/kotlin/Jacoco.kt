object Jacoco {

    val classExcludes = listOf(
        "**/R.class",
        "**/R\$*.class",
        "**/BuildConfig.*",
        "**/Manifest*.*",
        "**/*Test*.*",
        "android/**/*.*",
        "**/*\$Lambda$*.*",
        "**/*\$inlined$*.*",
        "*/androidx/databinding/*",
        "*_ViewBinding*.*",
        "*/*MapperImpl*.*",
        "**/*\$ViewInjector*.*",
        "*/*\$ViewBinder*.*",
        "**/*Component*.*",
        "*/*BR*.*",
        "*/*Companion*.*",
        "**/*ModuleKt*",
        "**/*ConfigKt*"
    )

    val classIncludes = listOf(
        "**/build/intermediates/javac/release/*/classes/**",
        "**/build/tmp/kotlin-classes/release/**",
        "**/build/intermediates/javac/stagingRelease/*/classes/**",
        "**/build/tmp/kotlin-classes/stagingRelease/**"
    )

    val moduleReportsExecPattern = listOf(
        "**/build/jacoco/testDevUnitTest.exec",
        "**/build/jacoco/testReleaseUnitTest.exec",
        "**/build/jacoco/testDebugUnitTest.exec"
    )

    const val XML_REPORT_DESTINATION_SUFFIX = "/reports/jacoco/jacocoTestReport.xml"
    const val HTML_REPORT_DESTINATION_SUFFIX = "/reports/jacoco/html"
}
