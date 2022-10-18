create database kodilla_course;

show databases;

create user 'kodilla_user' identified with MYSQL_NATIVE_PASSWORD by 'kodilla_Pass123';

grant ALL PRIVILEGES ON kodilla_course.* to kodilla_user;

show tables;

create table USERS
(
    ID        serial primary key,
    FIRSTNAME varchar(100),
    LASTNAME  varchar(100)
);

create table POSTS
(
    ID      SERIAL PRIMARY KEY,
    USER_ID BIGINT UNSIGNED NOT NULL,
    BODY    VARCHAR(1024),
    FOREIGN KEY (USER_ID) REFERENCES USERS (ID)
);

SELECT * FROM USERS;

INSERT INTO USERS (FIRSTNAME, LASTNAME) VALUES ("John", "Smith");

COMMIT;

select * from USERS;

INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, "This is my first post on this forum!");
commit;

select * from POSTS;

select * from POSTS;

insert into POSTS (USER_ID, BODY) VALUES (2, "This is my first post too!");

INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("Zachary", "Lee");

INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("Stephanie", "Kovalsky");

INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("Thomas", "Landgren");

INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("John", "Thomson");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (2, "This is my first post too!");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (2, "How are you?");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, "Quite good, thanks bro!");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (4, "Yo all! Here is Thomas!");

COMMIT;

select * from USERS;
select * from posts;


