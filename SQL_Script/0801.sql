select abs(-78),abs(+78);

select round(4.875,1);

select name, round(avg(saleprice/100))*100 as '평균주문금액' 
from Customer,Orders
where Customer.custid=Orders.custid
group by Customer.name;

select name, round(avg(saleprice),-2) as '평균주문금액' 
from Customer,Orders
where Customer.custid=Orders.custid
group by Customer.name;

select concat('마당','서점');

select lower('MR.SCOTT');

select upper('mr.scott');

select lpad('page 1',10,'*');

select rpad('page 1',10,'*');

select replace('jack & jue','j','bl');

select substr('abcdefg',3,4);

select trim('=' from "= A =B =C =D =E =");

select replace(B.bookname,'야구','농구')from Book B;

select Book.bookname from Book;

select bookname '제목', char_length(bookname) '문자수',
length(bookname) '바이트수'
from Book
where publisher='굿스포츠';

select substr(name,1,1) '성', count(*) '인원'
from Customer
group by substr(name,1,1);

select adddate('2024-07-01',interval -5 day) before5,
adddate('2024-07-01', interval 5 day) after5;

select orderid '주문번호', orderdate '주문일',
adddate(orderdate, interval 10 day) '확정'
from Orders;

select orderid '주문번호', date_format(orderdate,'%y%m%d') '주문일',
date_format(orderdate,'%b %d %Y') '주문일',
date_format(orderdate,'%y-%m-%d %a') '주문일',
O.custid '고객ID', O.bookid '도서ID'
from Customer C, Book B, Orders O
where (B.bookid=O.bookid) and (C.custid = O.custid) and
orderdate=str_to_date('20240707','%Y%m%d');

create view Vorders
as select orderid, O.custid, name, O.bookid, bookname, saleprice, orderdate
from Customer C, Orders O, Book B
where C.custid=O.custid and B.bookid=O.bookid;

select * from Vorders;

create view vw_Customer
as select *
from Customer
where address like '대한민국%';

create view cb_name
as select orderid,O.custid, name,O.bookid, bookname, saleprice, orderdate
from Customer C, Book B, Orders O
where C.custid=O.custid and B.bookid=O.bookid;

select name,orderid,bookname,saleprice
from cb_name
where name like '김연아';

select name, count(phone)
from Customer;

create table MyBook(
bookid integer not null,
price integer null
);

insert into MyBook values(1,10000);
insert into MyBook values(2,20000);
insert into MyBook (bookid) values(3);

select*from MyBook;

alter table MyBook modify bookid integer not null primary key;

select price+100
from MyBook
where bookid=3;

select sum(price), avg(price), count(*),count(price)
from MyBook;

select sum(price), avg(price), count(*),count(price)
from MyBook
where bookid >=4;

select * from MyBook
where price is null;

select count(*) from MyBook
where price is null;

select * from MyBook
where price=0;

select name '이름', ifnull(phone,'연락처없음')'전화번호'
from Customer;

select bookid '책번호', ifnull(price,'가격미정') '가격'
from MyBook;

select ENAME '사원이름', JOB '사원직위'
from EMP; 

select ENAME, SAL
FROM EMP
WHERE DEPTNO=30;

select EMPNO,ENAME,SAL,SAL*0.1'증가액',SAL*1.1'인상된 급여'
FROM EMP
order by EMPNO;

select ENAME,DEPTNO
from EMP
WHERE ENAME like 'S%';

select ROUND(MAX(SAL))'MAX',ROUND(MIN(SAL))'MIN',ROUND(SUM(SAL))'SUM',ROUND(AVG(SAL))'AVG'
FROM EMP;

select JOB '업무',count(*) '업무별 사원수'
FROM EMP
group by JOB;

select HISAL-LOSAL
FROM SALGRADE;

select COUNT(*) '구성원수', sum(SAL),avg(SAL)
FROM EMP
where DEPTNO=30;

select DEPTNO
FROM EMP
WHERE AVG(SAL) > ALL ( select AVG(SAL)
FROM EMP
group by DEPTNO);


select JOB, avg(SAL)
from EMP
WHERE SAL>=3000 
GROUP BY JOB
order by JOB DESC;

select COUNT(EMPNO)
from EMP
WHERE MGR IN(select EMPNO FROM EMP);

select ENAME, SAL, COMM, SAL+COMM '총액'
FROM EMP
WHERE COMM IS NOT NULL
order by SAL+COMM DESC;

--부서별로 같은 업무를 하는 사람의 인원수를 구하여 부서번호, 업무이름, 인원수를 출력하세요.
select JOB,COUNT(*)
FROM EMP
group by JOB;

select DT.DEPTNO , E.JOB, COUNT(JOB)
FROM  (select DEPTNO FROM DEPT D WHERE D.DEPTNO=E.DEPTNO)DT, EMP E
GROUP BY JOB;

select D.DEPTNO
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND
EMPNO NOT IN (SELECT EMPNO FROM EMP WHERE E.DEPTNO);


SELECT JOB,COUNT(*)>=4 '인원수'
FROM EMP
GROUP BY JOB;

select JOB,count(*)
FROM EMP
WHERE COUNT(*)=(SELECT COUNT(*) >=4 FROM EMP group by JOB)
group by JOB;

select ENAME
FROM EMP
WHERE EMPNO between 7400 AND 7600;

select ENAME, JOB
FROM EMP;

select E.ENAME, (select E.ENAME FROM EMP E WHERE E.MGR IN (E.EMPNO))'팀장이름'
FROM EMP E;

select E.ENAME
FROM EMP E
WHERE E.SAL > (select E.SAL FROM EMP E WHERE E.ENAME='SCOTT');

select DEPTNO
FROM EMP
WHERE ENAME='SCOTT';

select DEPTNO
FROM DEPT
WHERE LOC='DALLAS';

