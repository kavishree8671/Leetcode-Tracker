-- Last updated: 7/9/2026, 3:09:13 PM
select
    s.customer_id
from(
    select
    customer_id,
    count(distinct product_key) as total_unique_products
    from Customer
    group by customer_id
) s
where s.total_unique_products = (select count(distinct product_key) from Product)