select e.employee_id,concat(e.first_name,e.last_name)'Name',e.salary,j.job_title,e.hire_date,e.manager_id
from employees e,jobs j
where e.job_id=j.job_id;

select concat(e.first_name,e.last_name)'Name', j.job_title 'Job', e.salary, e.salary+100 'Increased Ann_Salary',