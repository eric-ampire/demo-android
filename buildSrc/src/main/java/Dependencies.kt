package com.ericampire.android.demo.compose


object Version {
    const val compose = "1.0.0-alpha07"
    const val kotlin = "1.4.10"
}

object Deps {
    object Gradle {
        const val plugin = "com.android.tools.build:gradle:4.2.0-alpha15"
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
    }

    object AndroidX {

        const val core = "androidx.core:core-ktx:1.3.2"
        const val appCompat = "androidx.appcompat:appcompat:1.2.0"
        const val composeNavigation = "androidx.navigation:navigation-compose:1.0.0-alpha01"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-beta01"


        object Compose {
            object Ui {
                const val core = "androidx.compose.ui:ui:${Version.compose}"
                const val tooling = "androidx.ui:ui-tooling:${Version.compose}"
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