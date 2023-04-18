plugins {
    `java-spring-application`
}

group = "com.martela"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    implementation(project(":library"))
}