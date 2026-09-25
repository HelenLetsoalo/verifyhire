# 6. Cloud Architecture and Deployment

## 6.1 Cloud Objective

The purpose of the cloud component is to demonstrate how VerifyHire can be deployed as a containerised application with a managed relational database.

## 6.2 Target AWS Architecture

```text
                         Internet
                            |
                            v
                    AWS Application Endpoint
                            |
                            v
                 +-----------------------+
                 | Amazon ECS / Fargate  |
                 |                       |
                 | VerifyHire Container  |
                 | Spring Boot API       |
                 +-----------+-----------+
                             |
                         JDBC connection
                             |
                             v
                 +-----------------------+
                 | Amazon RDS            |
                 | PostgreSQL            |
                 +-----------------------+
```

## 6.3 AWS Services

### Amazon ECS

Amazon ECS will manage the VerifyHire container workload.

### AWS Fargate

Fargate will provide serverless compute for the ECS task so that the project does not require manually managed servers.

### Amazon RDS

RDS PostgreSQL will provide the managed relational database for the cloud deployment.

### Amazon VPC

The application and database will operate within AWS networking resources.

### Security Groups

Security groups will control which network traffic is allowed between the application and database.

## 6.4 Configuration

The application already supports environment-based database configuration:

```text
VERIFYHIRE_DB_HOST
VERIFYHIRE_DB_PORT
VERIFYHIRE_DB_NAME
VERIFYHIRE_DB_USER
VERIFYHIRE_DB_PASSWORD
```

This allows the same application code to run against local PostgreSQL and cloud PostgreSQL.

## 6.5 Security

Database credentials should be configured through AWS environment/secrets configuration and must not be committed to GitHub.

The database should not be exposed unnecessarily to the public internet. Access should be restricted to the application workload through AWS networking and security groups.

## 6.6 Deployment Plan

1. Build and test VerifyHire locally.
2. Build the Docker image.
3. Create an Amazon RDS PostgreSQL database.
4. Configure AWS networking and security groups.
5. Create an ECS cluster.
6. Create a Fargate task definition.
7. Configure the VerifyHire container environment variables.
8. Deploy the ECS service.
9. Test `/health`.
10. Test a database-backed candidate endpoint.
11. Document the final architecture and deployment evidence.

## 6.7 Cloud Success Criteria

The cloud deployment will be successful when:

- The VerifyHire container runs on AWS.
- The application responds to HTTP requests.
- The application connects to RDS PostgreSQL.
- Candidate data can be retrieved from the cloud database.
- Database credentials are not stored in source code.
- AWS network rules restrict database access appropriately.

## 6.8 Current Status

The AWS deployment is a planned next phase. The local implementation has already demonstrated:

- Spring Boot API
- PostgreSQL connectivity
- Docker containerisation
- Environment-based database configuration

The AWS section should be updated with screenshots, resource names, endpoint information, and test results after deployment.
