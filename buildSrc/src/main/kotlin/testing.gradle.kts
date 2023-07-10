plugins {
    java
    `jvm-test-suite`
    jacoco
}

testing {
    suites {
        configureEach {
            if (this is JvmTestSuite) {
                useJUnitJupiter()
                targets {
                    all {
                        testTask.configure{
                            finalizedBy(tasks.jacocoTestReport)
                        }
                    }
                }
            }
        }

        register<JvmTestSuite>("integrationTest") {
            dependencies {
                implementation(project())
                implementation("io.kotest:kotest-assertions-core:5.6.1")
            }

            targets {
                all {
                    testTask.configure {
                        shouldRunAfter(testing.suites.named("test"))
                    }
                }
            }
        }
    }
}

tasks.named("check") {
    dependsOn(testing.suites.named("integrationTest"))
}