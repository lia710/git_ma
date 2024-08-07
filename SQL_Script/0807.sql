select count(*)
from employees;
select count(*)
from departments;

select e.employee_id, e.last_name, j.job_title, e.hire_date
from employees e, jobs j
where e.job_id=j.job_id;

select last_name, salary
from employees
where salary >= 12000;

select e.last_name, d.department_name
from employees e, departments d
where e.department_id=d.department_id
and e.department_id in(20,50)
order by e.last_name;

select last_name
from employees
where last_name like '__a%';

select job_id, count(*)
from employees
group by job_id
having count(job_id)>=2;

select max(salary)-min(salary) from employees;

select job_title, max_salary- min_salary '차이'
from jobs;

select e.last_name, j.job_title, e.department_id, d.department_name
FROM employees e,
	departments d,
	jobs j,
	locations l
WHERE e.department_id = d.department_id
	AND d.location_id = l.location_id
	AND j.job_id = e.job_id
and l.city='Toronto';

select e.last_name, e.job_id, e.hire_date
from employees e 
where last_name in ('Matos','Taylor') 
order by hire_date;

select last_name, hire_date
from employees
where date_format(hire_date, '%Y') = '1994';

select e.last_name, j.job_title, e.salary
from employees e, jobs j
where e.job_id= j.job_id
and job_title in ('sales representative', 'stock clerk')
and salary not in(2500,3500,7000);

select count(manager_id) '매니저 수'
from employees;

select manager_id

