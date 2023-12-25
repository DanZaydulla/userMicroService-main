DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(255) NOT NULL DEFAULT '',
    last_name varchar(255) NOT NULL DEFAULT '',
    email varchar(255) NOT NULL DEFAULT '',
    age int NOT NULL,
    address varchar(255) NOT NULL DEFAULT '',
    join_date DATE NOT NULL
);

INSERT INTO customer (first_name, last_name, email, age, address, join_date)
VALUES ('A', 'AA', '@@', 24, 'NEW YORK', '2023-11-23'),
       ('B', 'BB', '@@', 45, 'SYDNEY', '2023-11-23'),
       ('C', 'CC', '@@', 19, 'TEL AVIV', '2023-11-23'),
       ('D', 'DD', '@@', 67, 'LONDON', '2023-11-23');