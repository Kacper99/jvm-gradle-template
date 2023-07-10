plugins { `java-spring-application` }

dependencies {
    implementation(project(":library"))

    integrationTestImplementation(
        platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
    integrationTestImplementation("org.springframework.boot:spring-boot-starter-web")
    integrationTestImplementation("org.springframework.boot:spring-boot-starter-test")
}
