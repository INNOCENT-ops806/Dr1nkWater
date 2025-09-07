#!/bin/bash
# Builds and runs the Gradle application.
echo "Building and running Dr1nkWater..."
./gradlew build && ./gradlew :app:run
