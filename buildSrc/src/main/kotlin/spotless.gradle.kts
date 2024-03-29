import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.diffplug.spotless")
}


spotless {
    java {
        removeUnusedImports()
        importOrder()

        palantirJavaFormat()
    }

    kotlin {
        targetExclude("**/build/generated/**", "**/build/tmp/**")
        ktfmt("0.43").dropboxStyle()
    }

    kotlinGradle {
        target("*.gradle.kts")
        ktfmt("0.43").dropboxStyle()
    }
}

tasks.withType(AbstractCompile::class) {
    dependsOn(tasks.spotlessCheck)
}