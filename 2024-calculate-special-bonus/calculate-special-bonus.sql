# Write your MySQL query statement below
-- UPDATE employees
-- set salary=0  
-- where employee_id%2=0 OR name like 'm%' ;

select employee_id , salary*(employee_id%2)*(name not like'M%') as bonus from employees
order by employee_id;