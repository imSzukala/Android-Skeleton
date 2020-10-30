# Android Skeleton
## Architecture
- **ui** - layer that interacts with the UI
  - app
  - features modules
  - navigation
  - base
- **use cases** - active or implicit actions
- **domain** - business logic
  - model
  - abstraction
- **data** - layer that decides where to find the information
  - repositories
- **framework** - layer that interacts with the Android framework and external libraries
  - network
  - database
  - shared preferences
  - ...
## Useful Gradle Tasks:
- `./gradlew ktlint` - Runs ktlint kotlin code style checker
- `./gradlew ktlintFormat` - Runs ktlint formatter to format the code based on ktlint coding style
- `./gradlew dependencyUpdates` - Checks the current used dependencies and their latest versions
