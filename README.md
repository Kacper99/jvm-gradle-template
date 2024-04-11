# JVM Springboot Gradle template

A template repository to spin up a multi-module springboot service that has support for Java and Kotlin.

This template contains a sample "hello world" spring boot project which has a single controller which will return
hello world, or hello with your name. The controller uses a module called "library" which provides different methods
for returning hello world. This is a very convoluted way of doing Hello World however it hopefully demonstrates how
you can build a multi-module springboot project.

## Using this template
- Change the group in [versioning.gradle.kts](buildSrc/src/main/kotlin/versioning.gradle.kts).
- Rename the project name in [settings.gradle.kts](settings.gradle.kts).
- Delete all the Hello World related classes. You may use the [delete-example-code.sh](delete-example-code.sh) script to
  to do this: `./delete-example-code.sh`
- Update your jacoco configuration in [testing.gradle.kts](buildSrc/src/main/kotlin/testing.gradle.kts).

## Adding additional modules
If you want to add another module, create a new directory with a build.gradle.kts file containing
```gradle
plugins { `library-conventions` }
```
Then add the name of your new module to settings.gradle.kts
