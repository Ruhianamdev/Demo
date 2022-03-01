create table person
(
  id integer not null,
 name varchar(255)  not null,
location varchar(255),
birth_date timestamp,
 primary key(id)
);
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(1003, 'POOJA' , 'BANGLORE', sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(1004, 'POOJ' , 'BANGLORE', sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(1007, 'RUHI' , 'BANGLORE', sysdate());
