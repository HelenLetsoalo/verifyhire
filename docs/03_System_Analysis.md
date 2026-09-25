# 3. System Analysis

## 3.1 Current Recruitment Problem

The system is intended to address the difficulty of managing and verifying recruitment information in a structured way.

The main information flow is:

```text
Candidate
   ↓
Profile
   ↓
Qualifications / Experience / References
   ↓
Job Application
   ↓
Verification
   ↓
Application Decision
   ↓
Appeal (when applicable)
```

## 3.2 Actors

### Candidate

A person applying for a job through the system.

### Recruiter

A recruitment user associated with an organisation.

### Organisation

An organisation that owns or manages job opportunities.

### System

The software responsible for storing information, processing applications, and performing verification logic.

## 3.3 Major Use Cases

### Register Candidate

A candidate's basic information is stored as a user and candidate record.

### Create Job

An organisation can have job opportunities associated with it.

### Apply for Job

A candidate can be associated with a job through a job application.

### Verify Application

The verification process checks the available candidate information and produces a result.

### Reject Application

An application that fails verification can move to `REJECTED`.

### Appeal

A candidate can submit an appeal associated with an application.

### Retrieve Candidate

A client can request candidate information through the REST API.

## 3.4 System Layers

```text
Controller Layer
       ↓
Service Layer
       ↓
Repository / Database Layer
       ↓
PostgreSQL
```

The controller handles HTTP requests, services contain application logic, repositories handle database operations, and PostgreSQL stores persistent data.

## 3.5 Current Implementation

The project currently contains:

- Java domain models
- Services
- JDBC repository code
- PostgreSQL schema
- Spring Boot REST controllers
- DTOs
- Automated tests
- Docker configuration

## 3.6 Cloud Evolution

The local architecture is being extended into a cloud architecture:

```text
Local:
Spring Boot → PostgreSQL

Cloud:
ECS/Fargate → RDS PostgreSQL
```

The application configuration uses environment variables so that the same application can use different database environments without changing source code.
