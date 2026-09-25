# 4. Domain Model

## 4.1 Main Domain Entities

### User

Base user information:

- userId
- firstName
- lastName
- email
- password
- location

### Candidate

A candidate extends the user concept and can have:

- Qualifications
- Work experience
- References

### Qualification

Represents an educational qualification belonging to a candidate.

### WorkExperience

Represents previous employment information.

### Reference

Represents a candidate reference.

### Organisation

Represents an organisation that owns job opportunities.

### Job

Represents a vacancy created by an organisation.

### JobApplication

Connects a candidate to a job and contains an application date and status.

### Document

Represents a document associated with a candidate.

### VerificationReport

Stores the verification result and reason for an application.

### Appeal

Represents an appeal against an application decision.

### JobRecruitment

Represents recruitment information connecting an organisation and job.

## 4.2 Key Relationships

```text
User
  |
  └── Candidate
        ├── 0..* Qualifications
        ├── 0..* WorkExperience
        ├── 0..* References
        ├── 0..* Documents
        └── 0..* JobApplications

Organisation
  └── 0..* Jobs

Job
  └── 0..* JobApplications

JobApplication
  ├── 0..* VerificationReports
  └── 0..* Appeals
```

## 4.3 Design Notes

A candidate may be a school-leaver and therefore have zero work-experience records and zero references.

The model separates users from candidates so that the system can support other user types in future.

Organisations own jobs. Recruiters can be associated with organisations without making a recruiter the owner of a job.

## 4.4 Database Mapping

The database represents the domain using relational tables including:

- users
- candidates
- qualifications
- work_experience
- candidate_references
- organisations
- jobs
- job_applications
- documents
- verification_reports
- appeals
- job_recruitment
