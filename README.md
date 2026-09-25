# VerifyHire

## Overview

VerifyHire is a Java-based recruitment verification system designed to help organisations make hiring decisions using verified candidate information rather than informal connections.

The system is being developed as a software engineering and cloud-computing project. It provides a foundation for:

* Candidate registration and profile management
* Qualification and work-experience information
* Job and organisation management
* Job applications
* Candidate verification
* Verification reports
* Rejected-application appeals
* REST API access
* PostgreSQL persistence
* Docker containerisation
* AWS cloud deployment

---

## Problem Statement

Recruitment processes can be affected by incomplete, inconsistent, or difficult-to-verify candidate information. VerifyHire aims to provide a structured system in which candidate information can be recorded, checked, and used during the recruitment workflow.

The project focuses on building the technical foundation for a future verification platform. External government and educational verification integrations are outside the current prototype scope.

---

## Main Users

* Candidates
* Recruiters
* Organisations
* System administrators (future scope)

---

## Core Workflow

```text
Candidate
   |
   v
Candidate Profile
   |
   v
Job Application
   |
   v
Verification
   |
   +---- Verified ------> Accepted / Shortlisted workflow
   |
   +---- Not verified --> Rejected
                              |
                              v
                           Appeal
```

---

## Technology Stack

| Technology            | Purpose                         |
| ---------------------- | -------------------------------- |
| Java 21               | Application development         |
| Spring Boot 3.5.6     | REST API                        |
| Maven                 | Build and dependency management |
| PostgreSQL            | Relational database             |
| JDBC                  | Database connectivity           |
| JUnit 5               | Automated testing               |
| Docker                | Containerisation                |
| Git/GitHub            | Version control                 |
| AWS ECS/Fargate       | Cloud application hosting       |
| Amazon RDS PostgreSQL | Cloud database                  |

---

## Project Structure

```text
verifyhire/

├── database/
│   └── schema.sql
├── docs/
│   ├── 01_Project_Proposal.md
│   ├── 02_Software_Requirements_Specification.md
│   ├── 03_System_Analysis.md
│   ├── 04_Domain_Model.md
│   ├── 05_UML_Diagram.md
│   └── 06_Cloud_Architecture.md
├── src/
│   ├── main/
│   │   ├── java/za/co/verifyhire/
│   │   │   ├── controller/
│   │   │   ├── database/
│   │   │   ├── dto/
│   │   │   ├── model/
│   │   │   └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── Dockerfile
├── pom.xml
└── README.md
```

---

# Quick Start

The following commands can be used to navigate, build, test and run VerifyHire locally.

## 1. Clone the Repository

```bash
git clone https://github.com/HelenLetsoalo/verifyhire.git
```

Navigate into the project:

```bash
cd verifyhire
```

Check that you are in the correct directory:

```bash
pwd
```

List the project files:

```bash
ls
```

You should see files/directories such as:

```text
database
docs
src
Dockerfile
pom.xml
README.md
```

---

## 2. Check the Git Repository

Check the current Git branch:

```bash
git branch
```

Check the working-tree status:

```bash
git status
```

View recent commits:

```bash
git log --oneline -5
```

---

# Running Locally

## Requirements

Install:

* Java 21
* Maven
* PostgreSQL
* Docker Desktop (for container testing)
* Git

Check Java:

```bash
java -version
```

Check Maven:

```bash
mvn -version
```

Check Git:

```bash
git --version
```

---

# Database Setup

Create a PostgreSQL database named `verifyhire`.

The database schema is located at:

```text
database/schema.sql
```

The schema can be executed using PostgreSQL's `psql` command:

```bash
psql -U postgres -d verifyhire -f database/schema.sql
```

Alternatively, open PostgreSQL/pgAdmin and execute the contents of:

```text
database/schema.sql
```

The application reads database configuration from environment variables:

```text
VERIFYHIRE_DB_HOST
VERIFYHIRE_DB_PORT
VERIFYHIRE_DB_NAME
VERIFYHIRE_DB_USER
VERIFYHIRE_DB_PASSWORD
```

Example values for a local PostgreSQL installation:

```text
VERIFYHIRE_DB_HOST=localhost
VERIFYHIRE_DB_PORT=5432
VERIFYHIRE_DB_NAME=verifyhire
VERIFYHIRE_DB_USER=postgres
VERIFYHIRE_DB_PASSWORD=<your-password>
```

Do not commit database passwords or other secrets to GitHub.

---

# Environment Variables

## Git Bash

Set the database variables before starting the application:

```bash
export VERIFYHIRE_DB_HOST=localhost
export VERIFYHIRE_DB_PORT=5432
export VERIFYHIRE_DB_NAME=verifyhire
export VERIFYHIRE_DB_USER=postgres
export VERIFYHIRE_DB_PASSWORD=your_password
```

Check that the variables are available:

```bash
echo $VERIFYHIRE_DB_HOST
echo $VERIFYHIRE_DB_PORT
echo $VERIFYHIRE_DB_NAME
echo $VERIFYHIRE_DB_USER
```

Avoid displaying or committing your database password.

---

# Build the Project

To compile and package the project:

```bash
mvn clean package
```

If you want to package the application without running tests:

```bash
mvn clean package -DskipTests
```

The generated JAR file will be located in:

```text
target/
```

---

# Run Tests

Run the complete test suite:

```bash
mvn clean test
```

Run tests without cleaning the previous build:

```bash
mvn test
```

Run a specific test class:

```bash
mvn -Dtest=CandidateRepositoryTest test
```

Run another specific test class:

```bash
mvn -Dtest=CandidateServiceTest test
```

A successful test run should finish with:

```text
BUILD SUCCESS
```

---

# Run VerifyHire with Spring Boot

Start the application using Maven:

```bash
mvn spring-boot:run
```

The application runs locally on:

```text
http://localhost:8080
```

Keep this terminal open while testing the API.

To stop the application:

```text
Ctrl + C
```

---

# API Testing

The API can be tested using a web browser, `curl`, Postman, or another REST client.

## 1. Health Check

Endpoint:

```text
GET /health
```

Using `curl`:

```bash
curl http://localhost:8080/health
```

Expected response:

```text
VerifyHire is running
```

This is the quickest way to confirm that the Spring Boot application is running.

---

## 2. Get a Candidate

Endpoint:

```text
GET /candidates/{userId}
```

Example:

```bash
curl http://localhost:8080/candidates/U001
```

The `U001` value represents the candidate/user ID being requested.

You can replace it with another existing user ID.

---

## 3. Create a Candidate

Endpoint:

```text
POST /candidates
```

Using `curl`:

```bash
curl -X POST http://localhost:8080/candidates \
  -H "Content-Type: application/json" \
  -d '{
    "userId": "U100",
    "firstName": "Demo",
    "lastName": "Candidate",
    "email": "demo100@example.com",
    "password": "TempPass123",
    "location": "Johannesburg"
  }'
```

The request creates a candidate using the supplied JSON data.

---

# Recommended Testing Order

For someone testing VerifyHire for the first time, use the following order:

### Step 1 — Navigate to the project

```bash
cd verifyhire
```

### Step 2 — Check the project

```bash
ls
```

### Step 3 — Check Java and Maven

```bash
java -version
mvn -version
```

### Step 4 — Check the database

Make sure PostgreSQL is running and the `verifyhire` database exists.

### Step 5 — Set database environment variables

```bash
export VERIFYHIRE_DB_HOST=localhost
export VERIFYHIRE_DB_PORT=5432
export VERIFYHIRE_DB_NAME=verifyhire
export VERIFYHIRE_DB_USER=postgres
export VERIFYHIRE_DB_PASSWORD=your_password
```

### Step 6 — Run automated tests

```bash
mvn clean test
```

### Step 7 — Start the API

```bash
mvn spring-boot:run
```

### Step 8 — Open another terminal

Keep the Spring Boot terminal running and open a second terminal in the project directory.

### Step 9 — Test the health endpoint

```bash
curl http://localhost:8080/health
```

### Step 10 — Test the candidate endpoint

```bash
curl http://localhost:8080/candidates/U001
```

### Step 11 — Test candidate creation

```bash
curl -X POST http://localhost:8080/candidates \
  -H "Content-Type: application/json" \
  -d '{
    "userId": "U100",
    "firstName": "Demo",
    "lastName": "Candidate",
    "email": "demo100@example.com",
    "password": "TempPass123",
    "location": "Johannesburg"
  }'
```

### Step 12 — Stop the application

Return to the Spring Boot terminal and press:

```text
Ctrl + C
```

---

# Docker

The application is designed to run as a Docker container.

## Build the Docker Image

```bash
docker build -t verifyhire .
```

Check that the image was created:

```bash
docker images
```

---

## Run the Container

```bash
docker run --rm -p 8080:8080 verifyhire
```

The application will be available at:

```text
http://localhost:8080
```

Test the application:

```bash
curl http://localhost:8080/health
```

---

## Run Docker with Database Configuration

For database-backed endpoints, provide the database environment variables when starting the container.

Example:

```bash
docker run --rm -p 8080:8080 \
  -e VERIFYHIRE_DB_HOST=host.docker.internal \
  -e VERIFYHIRE_DB_PORT=5432 \
  -e VERIFYHIRE_DB_NAME=verifyhire \
  -e VERIFYHIRE_DB_USER=postgres \
  -e VERIFYHIRE_DB_PASSWORD=your_password \
  verifyhire
```

The exact database host may need to be changed depending on the local Docker/PostgreSQL setup.

---

## Check Running Docker Containers

```bash
docker ps
```

Show all containers, including stopped containers:

```bash
docker ps -a
```

Stop a running container:

```bash
docker stop <container-id>
```

---

## Remove the Docker Image

If the image needs to be rebuilt from scratch:

```bash
docker rmi verifyhire
```

Then rebuild:

```bash
docker build -t verifyhire .
```

---

# Useful Maven Commands

| Command                         | Purpose                             |
| -------------------------------- | ------------------------------------ |
| `mvn clean`                     | Removes previous build files        |
| `mvn test`                      | Runs tests                          |
| `mvn clean test`                | Cleans project and runs tests       |
| `mvn package`                   | Packages the application            |
| `mvn clean package`             | Cleans and packages the application |
| `mvn clean package -DskipTests` | Packages without running tests      |
| `mvn spring-boot:run`           | Starts the Spring Boot application  |

---

# Useful Git Commands

Check the current status:

```bash
git status
```

View changed files:

```bash
git diff
```

View recent commits:

```bash
git log --oneline -5
```

Check the current branch:

```bash
git branch
```

Pull the latest changes:

```bash
git pull origin main
```

Push committed changes:

```bash
git push origin main
```

---

# API Endpoints

| Method | Endpoint               | Purpose                                  |
| ------ | ----------------------- | ------------------------------------------ |
| GET    | `/health`              | Check whether the application is running |
| GET    | `/candidates/{userId}` | Retrieve a candidate                     |
| POST   | `/candidates`          | Create a candidate                       |

Additional endpoints can be added as the system develops.

---

# Cloud Deployment

The cloud target for the project is AWS.

Planned architecture:

```text
GitHub
   |
   v
Docker image
   |
   v
Amazon ECS / AWS Fargate
   |
   | JDBC
   v
Amazon RDS for PostgreSQL
```

AWS deployment uses environment variables for database configuration rather than hard-coding credentials.

See:

```text
docs/06_Cloud_Architecture.md
```

for the cloud deployment plan.

---

# Testing

The project contains unit and integration-style tests covering:

* Domain models
* Services
* Candidate repository/database operations
* Database connectivity
* Application behaviour
* REST API functionality

Run the complete test suite:

```bash
mvn clean test
```

---

# Troubleshooting

## Port 8080 is already in use

Check which process is using port 8080.

On Windows:

```bash
netstat -ano | findstr :8080
```

Stop the application currently using the port, or configure VerifyHire to use another port.

---

## Application cannot connect to PostgreSQL

Check that PostgreSQL is running.

Then verify:

```bash
echo $VERIFYHIRE_DB_HOST
echo $VERIFYHIRE_DB_PORT
echo $VERIFYHIRE_DB_NAME
echo $VERIFYHIRE_DB_USER
```

Confirm that the `verifyhire` database exists and that the PostgreSQL credentials are correct.

---

## Maven build fails

Try a clean build:

```bash
mvn clean
mvn test
```

If dependencies need to be downloaded again:

```bash
mvn clean package
```

---

## Check the generated JAR

After building:

```bash
ls target
```

The packaged application should be available in the `target` directory.

Run the JAR with:

```bash
java -jar target/verifyhire-1.0-SNAPSHOT.jar
```

---

# Project Documentation

The `docs/` directory contains the project documentation:

1. Project Proposal
2. Software Requirements Specification
3. System Analysis
4. Domain Model
5. UML Diagram
6. Cloud Architecture and Deployment

These documents describe the system separately from the source code so that the design, requirements, implementation, and cloud architecture can be assessed independently.

---

# Project Status

Current development includes:

* Java domain model
* PostgreSQL schema
* Repository layer
* Service layer
* Spring Boot REST API
* Candidate GET and POST endpoints
* Automated tests
* Docker containerisation
* Environment-based database configuration
* Local Docker-to-PostgreSQL connectivity
* AWS cloud deployment preparation

Cloud milestone:

* Deploy VerifyHire to AWS
* Provision Amazon RDS PostgreSQL
* Run the application using ECS/Fargate
* Configure networking and security groups
* Test the deployed API

---

# Author

Helen Letsoalo

---

# Academic Project

VerifyHire is an educational project developed to demonstrate software engineering, database, API, containerisation, and cloud-computing concepts.
