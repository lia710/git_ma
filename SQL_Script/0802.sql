SET @seq:=0;

select (@seq:=@seq+1) '순번',custid,name,phone
from Customer
where @seq < 3;

select sum(saleprice)
from Orders
where custid = (select custid
from Customer where name='박지성');

select orderid, saleprice
from Orders
where saleprice <= (select avg(saleprice) from Orders);

select orderid, custid, saleprice
from Orders O1
where saleprice > (select avg(saleprice)from Orders O2
where O1.custid=O2.custid);

select orderid,saleprice
from Orders
where saleprice > All (select saleprice from Orders where custid='3');

select sum(saleprice) 'total'
from Orders od
where exists (select * from Customer cs
where address like '%대한민국%' and cs.custid=od.custid);

select (select name
from Customer C
where C.custid=O.custid) 'name', sum(saleprice) 'total'
from Orders O
group by O.custid;

select C.name, sum(O.saleprice) '판매액'
from (select custid, name 
from Customer
where custid<=2) C, Orders O
where C.custid=O.custid 
group by C.name;