/**
 * Conventional plugin for dealing with spring and its dependencies
 */
plugins {
    java
    `jvm-test-suite`
    id("org.springframework.boot")
}

dependencies {
    implementation(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)) //https://docs.spring.io/spring-boot/docs/current/gradle-plugin/reference/htmlsingle/#managing-dependencies.gradle-bom-support
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0") {
        because("Provide Swagger and an OpenAPI spec")
    }
}

testing {
    suites {
        register<JvmTestSuite>("springTest") {
            dependencies {
                implementation(project())
                implementation(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
                implementation("org.springframework.boot:spring-boot-starter-test") {
                    exclude(group = "org.hamcrest", module = "hamcrest") //Using assertJ and kotest instead
                }
            }

            targets {
                all {
                    testTask.configure {
                        shouldRunAfter(tasks.named("test"))
                    }
                }
            }
        }
    }
}

tasks.named("check") {
    dependsOn(testing.suites.named("springTest"))
}