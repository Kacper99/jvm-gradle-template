/**
 * Conventional plugin for dealing with spring and its dependencies
 */
plugins {
    java
    `jvm-test-suite`
}

dependencies {
    implementation(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)) //https://docs.spring.io/spring-boot/docs/current/gradle-plugin/reference/htmlsingle/#managing-dependencies.gradle-bom-support
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation(libs.springdoc) {
        because("Provide Swagger and an OpenAPI spec")
    }
}
