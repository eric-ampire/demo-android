buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Deps.Kotlin.gradlePlugin)
        classpath(Deps.Kotlin.kotlinSerialization)
        classpath(Deps.Gradle.plugin)
        classpath(Deps.Hilt.gradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
    }
}

tasks.create(name = "delete", type = Delete::class) {
    delete(rootProject.buildDir)
}