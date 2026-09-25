# 5. UML Diagram

The following conceptual class diagram represents the main relationships in VerifyHire.

```mermaid
classDiagram
    class User {
        +String userId
        +String firstName
        +String lastName
        +String email
        +String password
        +String location
    }

    class Candidate {
        +List~Qualification~ qualifications
        +List~WorkExperience~ experiences
        +List~Reference~ references
    }

    class Qualification
    class WorkExperience
    class Reference
    class Document

    class Organisation {
        +String organisationId
        +String name
        +String location
    }

    class Job {
        +String jobId
        +String title
        +String description
        +String location
        +String requirements
        +String status
    }

    class JobApplication {
        +String applicationId
        +LocalDate applicationDate
        +Status status
    }

    class VerificationReport {
        +String reportId
        +boolean verified
        +String reason
    }

    class Appeal {
        +String appealId
        +String reason
        +String status
    }

    User <|-- Candidate

    Candidate "1" --> "0..*" Qualification
    Candidate "1" --> "0..*" WorkExperience
    Candidate "1" --> "0..*" Reference
    Candidate "1" --> "0..*" Document
    Candidate "1" --> "0..*" JobApplication

    Organisation "1" --> "0..*" Job
    Job "1" --> "0..*" JobApplication

    JobApplication "1" --> "0..*" VerificationReport
    JobApplication "1" --> "0..*" Appeal
```

## Architectural Component View

```text
+----------------------+
| Browser / API Client |
+----------+-----------+
           |
           v
+----------------------+
| Spring Boot REST API |
|    Controllers       |
+----------+-----------+
           |
           v
+----------------------+
|      Services        |
+----------+-----------+
           |
           v
+----------------------+
| CandidateRepository  |
|    JDBC / Repos      |
+----------+-----------+
           |
           v
+----------------------+
|     PostgreSQL       |
+----------------------+
```
