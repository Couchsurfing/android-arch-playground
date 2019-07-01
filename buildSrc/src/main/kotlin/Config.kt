object Config {

    const val kotlinVersion = "1.3.40"

    const val buildToolsVersion = "29.0.0"

    private const val navigationVersion = "2.1.0-alpha05"

    object Versions {
        const val major = 1
        const val minor = 0
        const val patch = 0
        const val build = 0

        const val name = "$major.$minor.$patch"
        const val fullName = "$name.$build"
        const val code = major * 1000000 + minor * 10000 + patch * 100 + build
    }

    object SdkVersions {
        const val compile = 28
        const val target = 28
        const val min = 21
    }

    object Plugins {
        const val android = "com.android.tools.build:gradle:3.4.1"
        const val ktlint = "org.jlleitschuh.gradle:ktlint-gradle:7.2.1"
        const val navigation = "androidx.navigation:navigation-safe-args-gradle-plugin:$navigationVersion"
        const val ossLicenses = "com.google.android.gms:oss-licenses-plugin:0.9.3"
        const val gradleVersions = "com.github.ben-manes:gradle-versions-plugin:0.20.0"
    }

    object Libs {

        object Kotlin {
            object Coroutine {
                private const val version = "1.2.1"

                const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
                const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
                const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
            }
        }

        object AndroidX {
            private const val pagingVersion = "2.1.0"
            private const val fragmentVersion = "1.1.0-beta01"
            private const val workVersion = "1.0.1"

            const val appCompat = "androidx.appcompat:appcompat:1.1.0-beta01"
            const val activityKtx = "androidx.activity:activity-ktx:1.0.0-beta01"
            const val fragmentKtx = "androidx.fragment:fragment-ktx:$fragmentVersion"
            const val fragmentTesting = "androidx.fragment:fragment-testing:$fragmentVersion"
            const val preferenceKtx = "androidx.preference:preference-ktx:1.1.0-beta01"
            const val coreKtx = "androidx.core:core-ktx:1.1.0-rc01"
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.0-beta1"
            const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0-alpha06"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.1.0-beta01"
            const val pagingRuntimeKtx = "androidx.paging:paging-runtime-ktx:$pagingVersion"
            const val pagingCommon = "androidx.paging:paging-common:$pagingVersion"
            const val dynamicAnimation = "androidx.dynamicanimation:dynamicanimation-ktx:1.0.0-alpha02"
            const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
            const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
            const val workRuntimeKtx = "android.arch.work:work-runtime-ktx:$workVersion"
            const val workTesting = "android.arch.work:work-testing:$workVersion"
        }

        object PlayServices {
            const val ossLicenses = "com.google.android.gms:play-services-oss-licenses:17.0.0"
        }

        object Dagger {
            private const val version = "2.23.2"
            private const val assistedInjectVersion = "0.4.0"

            const val core = "com.google.dagger:dagger:$version"
            const val compiler = "com.google.dagger:dagger-compiler:$version"
            const val android = "com.google.dagger:dagger-android-support:$version"
            const val androidProcessor = "com.google.dagger:dagger-android-processor:$version"

            const val assistedInject = "com.squareup.inject:assisted-inject-annotations-dagger2:$assistedInjectVersion"
            const val assistedInjectProcessor =
                "com.squareup.inject:assisted-inject-processor-dagger2:$assistedInjectVersion"
        }

        object LeakCanary {
            private const val version = "1.6.3"

            const val leakCanary = "com.squareup.leakcanary:leakcanary-android:$version"
            const val leakCanaryFragments =
                "com.squareup.leakcanary:leakcanary-support-fragment:$version"
            const val leakCanaryNoop =
                "com.squareup.leakcanary:leakcanary-android-no-op:$version"
        }

        object Test {
            const val junit = "androidx.test.ext:junit:1.1.1"
            const val truth = "androidx.test.ext:truth:1.2.0"
            const val robolectric = "org.robolectric:robolectric:4.3"

            const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        }

        // Misc
        const val material = "com.google.android.material:material:1.0.0"
        const val timber = "com.jakewharton.timber:timber:4.7.1"
        const val picasso = "com.squareup.picasso3:picasso:3.0.0-SNAPSHOT"
        const val okHttp = "com.squareup.okhttp3:okhttp:4.0.0"
        const val okIo = "com.squareup.okio:okio:2.2.2"
        const val shimmer = "com.facebook.shimmer:shimmer:0.4.0"
    }
}