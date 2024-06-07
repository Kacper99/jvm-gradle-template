import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("versioning")
    id("spotless")
    id("testing")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(libs.kotlin.bom))
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation(libs.bundles.arrow)
}

kotlin {
    compilerOptions {
        jvmToolchain(JAVA_VERSION.asInt())
        apiVersion.set(KotlinVersion.KOTLIN_2_0)
    }
}
