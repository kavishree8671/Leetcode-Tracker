-- Last updated: 7/9/2026, 3:10:03 PM
SELECT e.name,b.bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empID=b.empId
WHERE b.bonus IS NULL OR b.bonus<1000;