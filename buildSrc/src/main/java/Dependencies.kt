package com.ericampire.android.demo.compose


object Version {
    const val compose = "1.0.0-alpha10"
    const val kotlin = "1.4.21"
    const val accompanist = "0.4.0"
    const val koin = "2.1.6"
    const val ktor = "1.4.0"
    const val hilt = "2.28-alpha"
    const val hiltAndroidX = "1.0.0-alpha01"
    const val epoxy = "4.3.1"
}

object Deps {
    const val materialDesign = "com.google.android.material:material:1.2.1"
    object Gradle {
        const val plugin = "com.android.tools.build:gradle:7.0.0-alpha04"
    }

    object Epoxy {
        const val core = "com.airbnb.android:epoxy:${Version.epoxy}"
        const val processor = "com.airbnb.android:epoxy-processor:${Version.epoxy}"
        const val dataBinding = "com.airbnb.android:epoxy-databinding:${Version.epoxy}"
        const val paging = "com.airbnb.android:epoxy-paging:${Version.epoxy}"
        const val glidePreloading = "com.airbnb.android:epoxy-glide-preloading:${Version.epoxy}"
    }

    object Koin {
        const val android = "org.koin:koin-android:${Version.koin}"
        const val scope = "org.koin:koin-androidx-scope:${Version.koin}"
        const val viewModel = "org.koin:koin-androidx-viewmodel:${Version.koin}"
        const val fragment = "org.koin:koin-androidx-fragment:${Version.koin}"
        const val test = "org.koin:koin-test:${Version.koin}"
    }

    object Hilt {
        const val android = "com.google.dagger:hilt-android:${Version.hilt}"
        const val compiler = "com.google.dagger:hilt-android-compiler:${Version.hilt}"
        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Version.hilt}"
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:${Version.ktor}"
        const val android = "io.ktor:ktor-client-android:${Version.ktor}"
        const val cio = "io.ktor:ktor-client-cio:${Version.ktor}"
        const val testing = "io.ktor:ktor-client-testing:${Version.ktor}"
        const val serialization = "io.ktor:ktor-client-serialization-jvm:${Version.ktor}"
        const val logging = "io.ktor:ktor-client-logging-jvm:${Version.ktor}"
    }


    object Accompanist {
        const val glide = "dev.chrisbanes.accompanist:accompanist-glide:${Version.accompanist}"
        const val insets = "dev.chrisbanes.accompanist:accompanist-insets:${Version.accompanist}"
    }

    object Maverick {
        const val core = "com.airbnb.android:mvrx:2.0.0-beta2"
    }
    object Coroutines {
        private const val version = "1.4.0"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin}"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Version.kotlin}"
        const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Version.kotlin}"
    }

    object AndroidX {

        const val core = "androidx.core:core-ktx:1.3.2"
        const val appCompat = "androidx.appcompat:appcompat:1.2.0"
        const val composeNavigation = "androidx.navigation:navigation-compose:1.0.0-alpha03"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-beta01"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:1.2.5"

        object Hilt {
            const val viewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Version.hiltAndroidX}"
            const val compiler = "androidx.hilt:hilt-compiler:${Version.hiltAndroidX}"
        }

        object Test {
            const val ext = "androidx.test.ext:junit:1.1.1"
            const val junit = "junit:junit:4.13"

            object Expresso {
                private const val version = "3.2.0"
                const val core = "androidx.test.espresso:espresso-core:$version"
            }
        }


        object Compose {
            object Ui {
                const val core = "androidx.compose.ui:ui:${Version.compose}"
                const val uiTest = "androidx.compose.ui:ui-test:${Version.compose}"
                const val tooling = "androidx.compose.ui:ui-tooling:${Version.compose}"
            }

            object Foundation {
                const val core = "androidx.compose.foundation:foundation:${Version.compose}"
                const val layout = "androidx.compose.foundation:layout:${Version.compose}"
            }

            object Runtime {
                const val core = "androidx.compose.runtime:runtime:${Version.compose}"
                const val liveData = "androidx.compose.runtime:runtime-livedata:${Version.compose}"
                const val rxJava = "androidx.compose.runtime:runtime-rxjava2:${Version.compose}"
            }

            object Material {
                const val core = "androidx.compose.material:material:${Version.compose}"
                const val iconsCore = "androidx.compose.material:material-icons-core:${Version.compose}"
                const val iconsExtended = "androidx.compose.material:material-icons-extended:${Version.compose}"
            }
        }
    }
}