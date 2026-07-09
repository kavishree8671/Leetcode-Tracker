-- Last updated: 7/9/2026, 3:12:16 PM
SELECT DISTINCT Num AS ConsecutiveNums
FROM Logs
WHERE (Id + 1, Num) IN (
    SELECT Id, Num FROM Logs
)
AND (Id + 2, Num) IN (
    SELECT Id, Num FROM Logs
);
