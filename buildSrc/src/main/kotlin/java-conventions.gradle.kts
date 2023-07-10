/**
 * Conventions to be used across all Java projects, irrespective of frameworks.
 *
 * assertJ should always be used for assertions
 *
 * Spotless check will run as part of the build and fail on formatting violations
 */
plugins {
    `java-library`
    id("versioning")
    id("spotless")
    id("testing")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.assertj:assertj-core:3.24.2")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
    }
}