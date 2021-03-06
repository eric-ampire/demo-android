plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
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

    implementation(Deps.Coroutines.core)
    implementation(Deps.Coroutines.android)

    implementation(Deps.AndroidX.composeNavigation)
    implementation(Deps.AndroidX.lifecycleRuntime)

    implementation(Deps.materialDesign)

    implementation(Deps.AndroidX.Compose.Ui.core)
    implementation(Deps.AndroidX.Compose.Ui.tooling)
    implementation(Deps.AndroidX.Compose.Runtime.core)
    implementation(Deps.AndroidX.Compose.Runtime.liveData)
    implementation(Deps.AndroidX.Compose.Runtime.rxJava)
    implementation(Deps.AndroidX.Compose.Foundation.core)
    implementation(Deps.AndroidX.Compose.Material.core)
    implementation(Deps.AndroidX.Compose.Material.iconsCore)
    implementation(Deps.AndroidX.Compose.Material.iconsExtended)

    androidTestImplementation(Deps.AndroidX.Compose.Ui.uiTest)

    implementation(Deps.Accompanist.glide)
    implementation(Deps.Accompanist.insets)

    implementation(Deps.materialDesign)
}