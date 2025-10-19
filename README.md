# Kotlin Spring Sample Project
> A Spring Boot application built with Kotlin

## Description
This project is a backend application built using Kotlin on top of Spring Boot.
It demonstrates setting up modern microservices, web APIs or backend services in Kotlin.

## Technologies Used
- Kotlin (2.0.20)
- Spring Boot (3.5.6)
- Spring Web
- Spring Data
- Gradle with Kotlin DSL
- Jackson module for Kotlin
- Mustache
- H2/in‑memory database
- JUnit/MockK

## Key Features
- REST endpoints built in Kotlin
- Data persistence layer (repository/service pattern) using Spring Data JPA
- Kotlin‑friendly serialization/deserialization using Jackson.
- Configuration via `application.yml`
- Unit and integration tests that spin up the Spring context and verify endpoints.
- Mustache leveraged for simple HTML build

## Getting Started / Installation

### Prerequisites
- Java Development Kit (JDK) 21
- Gradle (or use the Gradle wrapper provided)
- Git

### Clone the Repository
```bash
git clone https://github.com/GennaroGreg/kotlin-sping-project.git
cd kotlin-sping-project
```

### Configuration
By default, Spring Boot runs on port `8080`. Configuration files live in `src/main/resources`.  
You can modify `application.yml` for environment‑specific settings (In this case, only a few simple properties can be adjusted).

### Build and Run Locally
Since this uses Gradle (with Kotlin DSL) you can build and then run:

```bash
# Clean & Build
./gradlew clean build

# Run the application
./gradlew bootRun

# Run all unit/integration tests
./gradlew test
```