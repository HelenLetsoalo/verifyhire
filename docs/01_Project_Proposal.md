# 1. Project Proposal

## 1.1 Project Name

**VerifyHire**

## 1.2 Background

Recruitment systems often require candidates to provide information about their identity, qualifications, work experience, and supporting documents. When information is incomplete or difficult to verify, organisations may have difficulty evaluating applications consistently.

VerifyHire proposes a structured recruitment verification system in which candidate information can be stored, associated with applications, and processed through a verification workflow.

## 1.3 Problem Statement

Recruitment information can be fragmented across documents, emails, and informal processes. This can make verification difficult and can result in inconsistent application handling.

VerifyHire aims to provide a central software system for recording candidate information, managing applications, performing verification checks within the prototype, and allowing rejected applications to be appealed.

## 1.4 Proposed Solution

VerifyHire will provide:

- Candidate profiles
- Qualifications
- Work experience
- References
- Organisations
- Vacancies/jobs
- Job applications
- Documents
- Verification reports
- Appeals
- REST API access
- PostgreSQL persistence
- Docker deployment
- AWS cloud deployment

## 1.5 Target Users

- Candidates
- Recruiters
- Organisations

## 1.6 Objectives

1. Build a maintainable Java application.
2. Store recruitment information in PostgreSQL.
3. Implement a verification workflow.
4. Provide REST endpoints for application access.
5. Containerise the application with Docker.
6. Demonstrate cloud deployment using AWS.
7. Protect database credentials through environment-based configuration.

## 1.7 Scope

### In scope

- Candidate management
- Job/application concepts
- Verification workflow
- Appeals
- PostgreSQL database
- REST API
- Automated tests
- Docker
- AWS deployment architecture

### Out of scope for the current prototype

- Direct Home Affairs integration
- Direct university/education-department integrations
- Production identity verification
- Production document storage
- Full recruiter web interface
- Payment processing
- Machine-learning candidate scoring

These can be considered future enhancements.

## 1.8 Expected Outcome

The expected outcome is a working Java/Spring Boot recruitment verification prototype backed by PostgreSQL, containerised with Docker, and prepared for deployment to AWS using ECS/Fargate and Amazon RDS.
