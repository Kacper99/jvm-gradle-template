import gradle.kotlin.dsl.accessors._7b5b8d69360df55b8c1e9ea17171c344.testImplementation

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
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
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