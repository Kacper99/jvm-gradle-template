plugins {
    `java-library`
    id("com.diffplug.spotless")
}

repositories {
    mavenCentral()
}

spotless {
    java {
        removeUnusedImports()
        importOrder()

        palantirJavaFormat()
    }
}