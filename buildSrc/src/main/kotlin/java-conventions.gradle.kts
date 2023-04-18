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
    id("com.diffplug.spotless")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.assertj:assertj-core:3.24.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

spotless {
    java {
        removeUnusedImports()
        importOrder()

        palantirJavaFormat()
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
    }
}