use madangdb;
select name,phone from Customer
where name like '김연아'; 

select bookname,publisher,price from Book
where price like '1__00' or
price like '2_000' or
price like '3_000';

select bookname,publisher from Book
where price >= 10000;

select bookname,publisher,price from Book
-- where 10000  <= price and price <= 20000;
where price between 10000 and 20000;

select publisher from Book;
select distinct publisher from Book;

select name from Customer
where phone is null;

select publisher,price from Book
where (publisher ='굿스포츠') and (price between 10000 and 19999);

select * from Book
-- where (publisher ='굿스포츠') || (publisher like '대한미디어');
where publisher in ('굿스포츠','대한미디어');

select * from Book
where publisher not in ('굿스포츠','대한미디어');

update Book 
set bookname='그 여자의 축구' 
where bookid = 2;

select*from Book;

select * from Book
where bookname like '_구%';

delete from book
where bookid = 2;

select*from Book order by bookname desc;

select*from Book order by price desc, bookname;

select sum(saleprice) from Orders;

select avg(saleprice) from Orders;

select count(saleprice) from Orders;

select max(saleprice) from Orders;

select min(saleprice) from Orders;

select price as '판매가격' from Book;

select sum(saleprice) as'합계',
 avg(saleprice) as '평균가',
 min(saleprice) as '최소가',
max(saleprice) as '최고가'
from Orders;

select count(*) from Orders;

select custid,
count(*) as '총수량',
sum(saleprice) as '총판매액'
from Orders
group by custid;


select custid, count(*) as '총수량'
from Orders
where saleprice >= 8000
group by custid
having count(*)>=2; 

select *
from Customer,Orders
where Customer.custid=Orders.custid
order by Orders.orderdate;

select name, sum(saleprice)
from Customer,Orders
where Customer.custid=Orders.custid
group by Customer.name
order by Customer.name;

select name, count(*) as '총수량'
from Customer,Orders
where (saleprice >= 8000) and
(Customer.custid=Orders.custid)
group by Customer.name
having count(*)>=2;

select name, bookname
from Customer,Book,Orders
where (Customer.custid=Orders.custid) and
(Book.bookid=Orders.bookid)
order by Book.bookname;

select name, bookname
from Customer,Book,Orders
where (Customer.custid=Orders.custid) and
(Book.bookid=Orders.bookid) and
(Book.price >= 20000)
order by Book.bookname;

select bookname from Book
where bookid =1;

select bookname from Book
where price >=20000;

select name, sum(saleprice) as'총 구매금액'
from Customer,Orders
where (Customer.custid=Orders.custid) and
(name='박지성');

select name, count(*) as'구매한 도서의 수'
from Customer,Orders
where (Customer.custid=Orders.custid) and
(name='박지성');

select name, count(publisher) as'구매한 도서의 출판사 수'
from Customer,Orders,Book
where (Customer.custid=Orders.custid) and
(Book.bookid=Orders.bookid) and
(name='박지성');

select bookname, price, price-saleprice as '정가와 판매가격의 차이'
from Customer,Orders,Book
where (Customer.custid=Orders.custid) and
(Book.bookid=Orders.bookid) and
(name='박지성');

select count(bookid) as '마당서점 도서의 총개수'
from Book;

select count(distinct publisher) from Book;

select name,address from Customer;

select bookname
from Book,Orders
where (Book.bookid=Orders.bookid) and
orderdate between '2024-07-04' and '2024-07-07';

select name,address
from Customer
where name like '김%%';

select name,address
from Customer
where name like '김_아';

select bookname
from Customer,Orders,Book
where (Customer.custid=Orders.custid) and
(Book.bookid=Orders.bookid) and
(name not in ('박지성')); 

select sum(saleprice) as '총액', avg(saleprice) as '평균금액' 
from Orders;

select name, sum(saleprice)
from Customer,Orders
where Customer.custid=Orders.custid 
group by Customer.name;

select name, bookname
from Customer,Book,Orders
where (Customer.custid=Orders.custid) and
(Book.bookid=Orders.bookid)
order by Customer.name;

select max(price) from Book;

select bookname
from Book
where price = (select max(price) from Book);

select distinct name
from Customer,Orders
where Customer.custid=Orders.custid;

select name from Customer
where custid in (select distinct custid from Orders);
