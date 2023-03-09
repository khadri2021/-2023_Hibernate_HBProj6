create table student_comp(sno varchar(36),sname varchar(30),doorno int,street varchar(30));
-- drop table student_comp;

select * from student_comp;


create table TRAVELER(TRAVELER_ID int,TRAVELER_NAME varchar(20),BYKE_NAME varchar(20),CAR_NAME varchar(20),TRAVELER_TYPE varchar(20));
select t.*,t.traveler_type from TRAVELER t;

alter table TRAVELER add column PLANE_NAME varchar(20);




create table TRAVELER1(TRAVELER_ID int NOT NULL AUTO_INCREMENT PRIMARY KEY ,TRAVELER_NAME varchar(30));
create table BYKE_TRAVELER1(BYKE_ID int PRIMARY KEY,BYKE_NAME varchar(30));
create table CAR_TRAVELER1(CAR_ID int PRIMARY KEY,CAR_NAME varchar(30));

select * from TRAVELER1;
select * from CAR_TRAVELER1;
select * from BYKE_TRAVELER1;


