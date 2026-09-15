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

