/**
 * Conventional plugin for a Java Spring application. To be used for running the spring application
 */
plugins {
    id("java-conventions")
    id("kotlin-conventions")
    id("spring")
    kotlin("plugin.spring")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}
