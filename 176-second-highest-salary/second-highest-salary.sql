# Write your MySQL query statement below
SELECT (
    select DISTINCT salary  from  Employee
    order by salary DESC limit 1,1
) as SecondHighestSalary 