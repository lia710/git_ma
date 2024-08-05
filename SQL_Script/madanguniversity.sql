create database madanguniversity;

use madanguniversity;

create table Professor(
pssn varchar(14) not null primary key,
pname varchar(20) not null,
page integer null,
prank varchar(20) null,
pspeciality varchar(40) not null
);

-- 학과마다 학과장이 있다
create table Department(
dno varchar(20) not null primary key,
dname varchar(30) not null,
office varchar(10) not null,
pssn varchar(14) not null,
foreign key (pssn) references Professor(pssn)
);

-- 대학원생에게 전공학과가 있다
create table Graduate(
gssn varchar(14) not null primary key,
gname varchar(20) not null,
gage integer null,
dno varchar(20) not null,
deg_prog char(2) not null,
advisor varchar(14) null,
foreign key (advisor) references Graduate(gssn), -- advisor가 대학원생이기 때문에 같은 테이블안에서 참조한다 
foreign key (dno) references Department(dno)
);

create table Project(
pid varchar(20) not null primary key,
sponsor varchar(20) null,
start_date date not null,
end_date date not null,
budget integer not null,
manage varchar(20) not null,
foreign key (manage) references Professor(pssn)
);

create table WDept(
pssn varchar(14) not null,
dno varchar(20) not null,
pct_time integer not null,
primary key (pssn,dno),
foreign key (pssn) references Professor(pssn),
foreign key (dno) references Department(dno)
);

create table Win(
pid varchar(20) not null,
pssn varchar(14) not null,
primary key (pid,pssn),
foreign key (pid) references Project(pid),
foreign key (pssn) references Professor(pssn)
);

create table Wprog(
pid varchar(20) not null,
gssn varchar(14) not null,
primary key (pid,gssn),
foreign key (pid) references Project(pid),
foreign key (gssn) references Graduate(gssn)
);



