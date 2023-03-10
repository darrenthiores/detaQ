import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.library")
    kotlin("plugin.serialization") version Kotlin.version
}

apply {
    from("$rootDir/base-module.gradle")
}

android {
    defaultConfig {
        val apiKey = gradleLocalProperties(rootDir).getProperty("API_KEY")

        buildConfigField("String", "API_KEY", "\"${apiKey}\"")
        buildConfigField("String", "base_url", "\"my.base.url\"")
    }
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.landingDomain))

    "implementation"(Ktor.ktorClientCore)
    "implementation"(Ktor.ktorClientAndroid)
    "implementation"(Ktor.ktorSerialization)
    "implementation"(Ktor.ktorSerializationJson)
    "implementation"(Ktor.ktorClientLogging)
    "implementation"(Ktor.ktorClientAuth)
    "implementation"(Ktor.logBackClassic)
}