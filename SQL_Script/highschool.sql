create database highschool;

use highschool;

create table Student(
sid varchar(20) not null primary key,
sname varchar(20) NOT NULL,
syear varchar(10) NOT NULL DEFAULT'2024',
sgrade char(2) not null,
sclass char(2) not null,
snumber char(2) not null,
spw varchar(20) not null DEFAULT'1234'
);

create table Teacher(
tid varchar(20) NOT NULL primary key,
tpw varchar(20) not null,
tname varchar(20) not null,
tsubject varchar(30) not null,
ttype int(1) not null default 9
);

create table Lesson(
lid integer auto_increment not null primary key,
tid varchar(20) NOT NULL,
sid varchar(20) not null,
lname varchar(60) not null,
lyear varchar(10) not null,
lterm int(1) not null,
lgrade char(2) not null,
lclass char(2) null,
lday char(1) not null,
ltime varchar(1) not null,
lroom varchar(20) null,
FOREIGN KEY (tid) REFERENCES Teacher(tid),
FOREIGN KEY (sid) REFERENCES Student(sid)
);

create table Chulsuk(
sid varchar(20) not null,
lid integer auto_increment not null,
primary key(sid,lid),
foreign key(sid) references Student(sid),
foreign key(lid) references Lesson(lid)
);

create table Perform(
pid integer auto_increment primary key,
sid varchar(20) not null,
lid integer not null,
ptitle varchar(100) not null,
ptype char(1) null,
pcontent tinytext not null,
pstandard varchar(100) null,
psdate date not null,
pldate date not null,
foreign key (sid) references Student(sid),
foreign key (lid) references Lesson(lid)
);

create table Score(
sid varchar(20) not null,
pid integer not null,
sscore integer not null,
scheck char(1) null,
scheckdate date null,
primary key(sid,pid),
foreign key (sid) references Student(sid),
foreign key (pid) references Perform(pid)
);