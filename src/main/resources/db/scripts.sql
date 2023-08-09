CREATE DATABASE BANCO;

CREATE TABLE USERS (
    id SERIAL PRIMARY KEY,
		code VARCHAR(9) NOT NULL,
    firstname VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    age INTEGER NOT NULL,
		user_type VARCHAR(1) NOT NULL,
		position VARCHAR(100)
);

CREATE TABLE ACCOUNTS (
    id SERIAL PRIMARY KEY,
    account_code VARCHAR(100),
    created_date DATE,
    user_id INTEGER NOT NULL,
    CONSTRAINT FK_ACCOUNTS_USERS FOREIGN KEY (user_id) REFERENCES USERS (id)
);

CREATE TABLE TRANSACTIONS (
	id SERIAL PRIMARY KEY,
	type VARCHAR(1) NOT NULL,
	value DOUBLE NOT NULL,
	description VARCHAR(100) NOT NULL,
	account_id INTEGER NOT NULL,
	CONSTRAINT FK_TRANSACTIONS_ACCOUNTS FOREIGN KEY (account_id) REFERENCES TRANSACTIONS (id)
);

DROP TABLE TRANSACTIONS;
DROP TABLE ACCOUNTS;
DROP TABLE USERS;

SELECT * FROM USERS;

SELECT * FROM ACCOUNTS;

SELECT * FROM TRANSACTIONS;

INSERT INTO USERS (code, firstname, lastname, age, user_type, position) VALUES
('001384529', 'Jaimito', 'Perez', 38, 'C', null),
('008283819 ', 'Luis', 'Mendoza', 31, 'E', 'Desarrollador');

INSERT INTO ACCOUNTS (account_code, created_date, user_id) VALUES
('98583xxx000', '08/10/2020', 1),
('13289xxx000', '01/01/2020', 2);

INSERT INTO TRANSACTIONS (type, value, description, account_id) VALUES 
('C', 1500, 'Salario', 1),
('D', 10, 'Compra online', 1),
('D', 12, 'Transferencia a otro banco', 1),
('C', 80, 'Ahorro', 1),
('C', 2000, 'Salario', 2),
('D', 200, 'Compra online', 2),
('D', 12, 'Transferencia a otro banco', 2),
('C', 80, 'Ahorro', 2);






