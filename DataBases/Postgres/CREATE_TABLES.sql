CREATE TABLE PUBLIC.User(
	user_id SERIAL PRIMARY KEY,
	password_ VARCHAR(32) NOT NULL,
	email VARCHAR(32) NOT NULL,
	first_name VARCHAR(40) NULL,
	last_name VARCHAR(40) NULL,
	birthdate DATE NULL
);