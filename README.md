# Android Skeleton
## Architecture
- **app** - root module
- **ui** - layer that interacts with the UI
  - **main** - module that contains MainActivity and is the starting point of the app
  - **navigation** - module that contains navigation graph
  - **design** - module that contains resources, assets, views and base UI classes
  - **feature 1**
  - **feature 2**
  - ...
- **usecases** - layer that converts active or implicit user actions into interactions with the rest of inner layers
- **domain** - layer that contains entities and abstraction
- **data** - layer that contains data repositories that have access to the needed data
- **framework** - layer that interacts with the Android framework and external libraries to retrieve needed data
  - **network**
  - **database**
  - **shared preferences**
  - ...
- **base** - module that contains base classes
- **basetest** - module that contains base unit test utils and extensions

## Useful Gradle Tasks:
- `./gradlew ktlint` - Runs ktlint kotlin code style checker
- `./gradlew ktlintFormat` - Runs ktlint formatter to format the code based on ktlint coding style
- `./gradlew dependencyUpdates` - Checks the current used dependencies and their latest versions
- `./gradlew test` - Runs all tests
- `./gradlew generateMergedJacocoReport` - Generates merged Jacoco report
