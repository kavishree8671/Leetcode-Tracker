-- Last updated: 7/9/2026, 3:09:56 PM
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;