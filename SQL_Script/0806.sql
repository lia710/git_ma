create database madangbu;

use madangbu;

create table Plot(
pnumber varchar(30) not null primary key,
address varchar(40) not null,
pvalue varchar(20) not null
);

create table Ownerp(
onumber varchar(14) not null primary key,
oname varchar(20) not null,
ophone varchar(15) not null
);

create table Sou(
pnumber varchar(30) not null,
onumber varchar(14) not null,
primary key(pnumber,onumber),
foreign key (pnumber) references Plot(pnumber),
foreign key (onumer) references Sou(onumber)
);


create table Ownerp(
onumber varchar(14) not null primary key,
oname varchar(20) not null,
ophone varchar(15) not null
);

create table Bsou(
pnumber varchar(30) not null primary key,
address varchar(40) not null,
pvalue varchar(20) not null,
onumber varchar(14) not null,
foreign key (onumer) references Sou(onumber)
);

create user lia710@localhost identified by '1020';

select* from user;

create user madang@localhost identified by '1234';

drop user madang@localhost;

create user mdguest2 identified by '1234';

grant all privileges on madanguniversity.* to madang@localhost;

flush privileges;

show grants for madang@localhost;

grant select on madangdb.Book to madang@localhost;

flush privileges;

select * from user;