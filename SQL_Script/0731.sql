select Customer.name,bookname,publisher
from Customer,Orders,Book
where (Customer.custid=Orders.custid) and
(Book.bookid=Orders.bookid) and
Book.publisher='대한미디어';

select Customer.name from Customer
where custid = (select custid from Orders 
where bookid in (select bookid from Book where publisher='대한미디어')); 

select C.name, B.bookname
from Customer C, Book B, Orders O
where C.custid=O.custid and B.bookid=O.bookid
Order by C.name;

select custid,bookid from Orders;

select C.name, B.bookname
from Book B, Customer C
where (C.custid,B.bookid) in (select custid,bookid from Orders)
order by C.name;

select C.name,B.bookname
from Customer C, Book B
where C.custid in (select custid from Orders) and B.bookid in (select bookid from Orders)
order by C.name;

select year(orderdate), count(*) as 'Amount'
from madangdb.Orders
group by year(orderdate)
having Amount>1;

select Customer.name, sum(Orders.saleprice) as'구매금액'
from Customer,Orders
where Customer.custid=Orders.custid
group by Customer.name
order by Customer.name;

select Customer.name
from Customer
where Customer.address like '대한민국%';

select name from Customer
where custid in(select custid from Orders);

select name from Customer where Customer.address like '대한민국%'
union
select name from Customer
where custid in(select custid from Orders);

select* from Customer
union all
select* from Book;

select name,address
from Customer cs
where exists (select * from Orders od 
where cs.custid=od.custid);

create table NewBook(
bookid integer primary key,
bookname varchar(20),
publisher varchar(20),
price integer
);

create table NewCustomer(
custid integer,
name varchar(40),
address varchar(40),
phone varchar(30),
primary key (custid)
);

create table NewOrders(
orderid integer primary key,
custid integer not null,
bookid integer not null,
saleprice integer,
orderdate date,
foreign key(custid) references NewCustomer(custid) on delete cascade
);

describe NewBook;

alter table NewBook add isbn varchar(13);

alter table NewBook modify isbn integer;

alter table NewBook drop isbn;

alter table NewBook modify bookname varchar(20) not null;

alter table NewBook add primary key (bookname,publisher);

drop table NewBook;

insert into Book(bookid,bookname,publisher,price)
value(11,'스포츠 의학','한솔의학서적','90000');

select Customer.name,Book.publisher from Customer,Book,Orders
where (Customer.custid=Orders.custid) and 
(Book.bookid=Orders.bookid) and
(Customer.name='박지성');

select Customer.name from Customer,Book,Orders
where (Customer.custid=Orders.custid) and 
(Book.bookid=Orders.bookid) and
(Book.publisher in ('굿스포츠','대한미디어','나무수'));

select Customer.name from Customer,Book,Orders
where (Customer.custid=Orders.custid) and 
(Book.bookid=Orders.bookid) and 
(Customer.name='박지성')
union
select Customer.name from Customer,Book,Orders
where (Customer.custid=Orders.custid) and 
(Book.bookid=Orders.bookid) and
(Book.publisher in ('굿스포츠','대한미디어','나무수'));

select Customer.name, Book.publisher 
from Customer,Book,Orders
where (Customer.custid=Orders.custid) and 
(Book.bookid=Orders.bookid) 
order by publisher;

select bookname, count(*) 
from Customer,Book,Orders
where (Customer.custid=Orders.custid) and 
(Book.bookid=Orders.bookid)
group by bookname
having count(*)>=2;






