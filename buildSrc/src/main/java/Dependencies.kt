package com.ericampire.android.demo.compose


object Version {
    const val compose = "1.0.0-alpha08"
    const val kotlin = "1.4.20"
    const val accompanist = "0.4.0"
    const val koin = "2.1.6"
}

object Deps {
    const val materialDesign = "com.google.android.material:material:1.2.1"
    object Gradle {
        const val plugin = "com.android.tools.build:gradle:7.0.0-alpha01"
    }

    object Koin {
        const val android = "org.koin:koin-android:${Version.koin}"
        const val scope = "org.koin:koin-androidx-scope:${Version.koin}"
        const val viewModel = "org.koin:koin-androidx-viewmodel:${Version.koin}"
        const val fragment = "org.koin:koin-androidx-fragment:${Version.koin}"
        const val test = "org.koin:koin-test:${Version.koin}"
    }

    object Ktor {
        private const val version = "1.4.0"

        const val core = "io.ktor:ktor-client-core:$version"
        const val android = "io.ktor:ktor-client-android:$version"
        const val cio = "io.ktor:ktor-client-cio:$version"
        const val testing = "io.ktor:ktor-client-testing:$version"
        const val serialization = "io.ktor:ktor-client-serialization-jvm:$version"
        const val logging = "io.ktor:ktor-client-logging-jvm:$version"
    }


    object Accompanist {
        const val glide = "dev.chrisbanes.accompanist:accompanist-glide:${Version.accompanist}"
        const val insets = "dev.chrisbanes.accompanist:accompanist-insets:${Version.accompanist}"
    }

    object Maverick {
        const val core = "com.airbnb.android:mvrx:2.0.0-beta2"
    }
    object Coroutines {
        private const val version = "1.3.9"
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
        const val composeNavigation = "androidx.navigation:navigation-compose:1.0.0-alpha01"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-beta01"

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