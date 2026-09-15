CREATE TABLE users (
    user_id VARCHAR(50) PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    location VARCHAR(150) NOT NULL
);

CREATE TABLE candidates (
    user_id VARCHAR(50) PRIMARY KEY,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE qualifications (
    qualification_id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    institution_name VARCHAR(150) NOT NULL,
    year_obtained INTEGER NOT NULL,
    user_id VARCHAR(50) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES candidates(user_id)
);

CREATE TABLE work_experience (
    experience_id VARCHAR(50) PRIMARY KEY ,
    company_name VARCHAR(100) NOT NULL ,
    job_title VARCHAR(100) NOT NULL ,
    start_date DATE NOT NULL ,
    end_date DATE NOT NULL,
    user_id VARCHAR(50) NOT NULL ,
    FOREIGN KEY (user_id) REFERENCES candidates(user_id)
);

CREATE TABLE candidate_references (
    reference_id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100) NOT NULL ,
    relationship VARCHAR(100) NOT NULL ,
    email VARCHAR(255) NOT NULL ,
    phone_number VARCHAR(50) NOT NULL ,
    user_id VARCHAR(50) NOT NULL ,
    FOREIGN KEY (user_id) REFERENCES candidates(user_id)
);

CREATE TABLE organisations (
    organisation_id VARCHAR(50) PRIMARY KEY ,
    name VARCHAR(100) NOT NULL ,
    location VARCHAR(100) NOT NULL ,
    email VARCHAR(100) NOT NULL ,
    services VARCHAR(100) NOT NULL ,
    phone VARCHAR(20) NOT NULL
);

CREATE TABLE jobs (
    job_id VARCHAR(50) PRIMARY KEY ,
    title VARCHAR(100) NOT NULL ,
    description VARCHAR(255) NOT NULL ,
    location VARCHAR(100) NOT NULL ,
    requirements VARCHAR(255) NOT NULL ,
    status VARCHAR(100) NOT NULL ,
    organisation_id VARCHAR(50) NOT NULL ,
    FOREIGN KEY (organisation_id) REFERENCES organisations(organisation_id)
);

CREATE TABLE job_applications (
    application_id VARCHAR(50) PRIMARY KEY ,
    application_date DATE NOT NULL ,
    status VARCHAR(50) NOT NULL ,
    job_id VARCHAR(50) NOT NULL ,
    candidate_id VARCHAR(50) NOT NULL ,
    FOREIGN KEY (job_id) REFERENCES jobs(job_id),
    FOREIGN KEY (candidate_id) REFERENCES candidates(user_id)

);

CREATE TABLE documents (
    document_id VARCHAR(50) PRIMARY KEY ,
    candidate_id VARCHAR(50) NOT NULL ,
    document_type VARCHAR(50) NOT NULL ,
    file_name VARCHAR(255) NOT NULL ,
    status VARCHAR(50) NOT NULL ,
    FOREIGN KEY (candidate_id) REFERENCES candidates(user_id)
);

