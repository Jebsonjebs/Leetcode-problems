CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set N=N-1;
 RETURN (
         select DISTINCT salary from employee
         order by salary DESC limit 1 offset N
  );
END