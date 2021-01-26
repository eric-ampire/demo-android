
plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlinx-serialization")
    id("dagger.hilt.android.plugin")
}

kapt {
    correctErrorTypes = true
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.ericampire.android.demo.compose"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled(false)
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Version.compose
        kotlinCompilerVersion = Version.kotlin
    }
}

dependencies {

    implementation(Deps.Kotlin.stdlib)

    implementation(Deps.AndroidX.core)
    implementation(Deps.AndroidX.appCompat)
    implementation(Deps.AndroidX.fragmentKtx)

    implementation(Deps.Coroutines.core)
    implementation(Deps.Coroutines.android)

    implementation(Deps.AndroidX.composeNavigation)
    implementation(Deps.AndroidX.lifecycleRuntime)

    implementation(Deps.Maverick.core)
    implementation(Deps.materialDesign)

    testImplementation(Deps.AndroidX.Test.junit)

    androidTestImplementation(Deps.AndroidX.Test.ext)
    androidTestImplementation(Deps.AndroidX.Test.Expresso.core)

    implementation(Deps.Ktor.core)
    implementation(Deps.Ktor.android)
    implementation(Deps.Ktor.cio)
    implementation(Deps.Ktor.serialization)
    implementation(Deps.Ktor.logging)

    implementation(Deps.Hilt.android)
    kapt(Deps.Hilt.compiler)

    implementation(Deps.AndroidX.Hilt.viewModel)
    kapt(Deps.AndroidX.Hilt.compiler)

    implementation(Deps.Koin.android)
    implementation(Deps.Koin.scope)
    implementation(Deps.Koin.viewModel)
    implementation(Deps.Koin.fragment)

    implementation(Deps.Epoxy.core)
    implementation(Deps.Epoxy.dataBinding)
    implementation(Deps.Epoxy.glidePreloading)
    implementation(Deps.Epoxy.paging)
    kapt(Deps.Epoxy.processor)
}

configurations.all {
    resolutionStrategy {
        setForcedModules("org.jetbrains.kotlin:kotlin-parcelize-runtime:${Version.kotlin}")
    }
}