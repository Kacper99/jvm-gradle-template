plugins {
    java
    id("io.spring.dependency-management") version "1.1.0"
    id("com.diffplug.spotless") version "6.18.0"
}

group = "com.martela"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
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

dependencyManagement {
    imports {
        mavenBom("org.springframework.boot:spring-boot-dependencies:3.0.5")
    }
}