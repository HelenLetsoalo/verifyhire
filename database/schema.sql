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

