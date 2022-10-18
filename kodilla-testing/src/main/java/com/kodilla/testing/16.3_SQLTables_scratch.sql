create table ISSUESLIST
(
    ID serial primary key,
    NAME varchar(100)
);

create table ISSUES
(
    ID serial primary key,
    ISSUESLIST_ID bigint unsigned not null ,
    SUMMARY varchar(1024),
    DESCRIPTION varchar(1024),
    USER_ID_ASSIGNEDTO bigint unsigned not null ,
    FOREIGN KEY (ISSUESLIST_ID) references ISSUESLIST(ID),
    FOREIGN KEY (USER_ID_ASSIGNEDTO) references USERS(ID)
);

insert into ISSUESLIST (NAME) values ("ToDo");
insert into ISSUESLIST (NAME) values ("In progress");
insert into ISSUESLIST (NAME) values ("Done");

select * from ISSUES;
select * from ISSUESLIST;

insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (1, "ToDo task 1", "Create something ToDo1", 2);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (1, "ToDo task 2", "Create something ToDo2", 2);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (1, "ToDo task 3", "Create something ToDo3", 5);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (1, "ToDo task 4", "Create something ToDo4", 1);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (1, "ToDo task 5", "Create something ToDo5", 5);

insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (2, "In Progress task 1", "Procesing something In Progress 1", 4);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (2, "In Progress task 2", "Procesing something In Progress 2", 5);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (2, "In Progress task 3", "Procesing something In Progress 3", 3);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (2, "In Progress task 4", "Procesing something In Progress 4", 3);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (2, "In Progress task 5", "Procesing something In Progress 5", 1);

insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (3, "Done task 1", "Done something 1", 5);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (3, "Done task 2", "Done something 2", 4);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (3, "Done task 3", "Done something 3", 1);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (3, "Done task 4", "Done something 4", 1);
insert into ISSUES (issueslist_id, summary, description, user_id_assignedto) values (3, "Done task 5", "Done something 5", 2);

Commit;




