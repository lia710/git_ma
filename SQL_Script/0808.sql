select *
from employees
where length(concat(first_name,last_name))>=8;

select *
from employees
where ;

select concat(first_name,last_name), length(last_name)
from employees
where last_name like '_c%';

select *
from locations l, countries c, regions r
where min(length(l.street_address))
	AND l.country_id = c.country_id
	AND c.region_id = r.region_id;
    
    select street_address , length(street_address)
from locations
where length(street_address) in (select min(length(street_address))
from locations);