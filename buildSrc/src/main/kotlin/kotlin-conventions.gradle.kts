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
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.20"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("io.kotest:kotest-assertions-core:5.6.1")
}