#!/bin/zsh

# Delete the application folder
rm -rf application

# Delete the library folder
rm -rf library

# Remove the project includes in settings.gradle.kts
sed -i '' '/include("application")/d' settings.gradle.kts
sed -i '' '/include("library")/d' settings.gradle.kts

# Remove the file itself
rm delete-example-code.sh
