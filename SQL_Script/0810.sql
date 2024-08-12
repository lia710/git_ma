use madangdb;

delimiter //  
create procedure dorepeat(p1 int)
begin
set @x = 0;
repeat set @x = @x + 1; until @x > p1 end repeat;
end
//
call dorepeat(1000);

select @x;


delimiter //
create procedure insertBook(
in mybookid    integer,
in mybookname  varchar(40),
in mypublisher varchar(40),
in myprice     integer)
begin
insert into Book(bookid, bookname, publisher, price)
values(mybookid, mybookname, mypublisher, myprice);
end; 
//
delimiter ;

call insertBook(13,'스포츠과학','마당과학서적',25000);
select * from Book;

delimiter //
create procedure BookInsertOrUpdate(
mybookid integer,
mybookname varchar(40),
mypublisher varchar(40),
myprice int)
begin
declare mycount integer;
select count(*) into mycount from Book
where bookname like mybookname;
if mycount!=0 then
set sql_safe_updates=0; 
update Book set price = myprice 
where bookname like mybookname;
else
insert into Book(bookid, bookname, publisher, price)
values(mybookid, mybookname, mypublisher, myprice);
end if;
end;
//
delimiter ;

call BookInsertOrUpdate(15,'스포츠의 즐거움','마당과학서적',25000);
select*from Book;
call BookInsertOrUpdate(15,'스포츠의 즐거움','마당과학서적',20000);
select*from Book;

delimiter //
create procedure Averageprice(
out AverageVal integer)
begin
select avg(price) into AverageVal
from Book where price is not null;
end;
//
delimiter ;

call Averageprice(@myvalue);
select @myvalue;

set global log_bin_trust_function_creators=on;

create table Book_log(
bookid_l integer,
bookname_l varchar(40),
publisher_l varchar(40),
price_l integer);

delimiter //
create trigger AfterInsertBook
after insert on Book for each row
begin
declare average integer;
insert into Book_log
values(new.bookid, new.bookname, new.publisher, new.price);
end;
//
delimiter ;

insert into Book values(14,'스포츠 과학 1','이상미디어',25000);
select*from Book where bookid=14;
select*from Book_log where bookid_l='14';

-- 푸드코트 ERD- 요구사항
create table corner(
corner_id varchar(6) primary key,
corner_name varchar(20) not null
);

create table menu(
menu_id varchar(6) not null primary key,
menu_name varchar(20) not null,
price integer not null,
corner_id varchar(6),
foreign key (corner_id) references corner(corner_id)
);
create table orders(
order_id varchar(6) not null,
menu_id varchar(6) not null,
cnt integer not null,
order_date datetime not null,
status char(1) null, -- 접수중, 픽업대기, 픽업완료 
saleprice integer,
foreign key (menu_id) references menu(menu_id),
primary key(order_id, menu_id, order_date)
);

