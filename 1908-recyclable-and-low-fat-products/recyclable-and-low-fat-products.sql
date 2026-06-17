-- Write your PostgreSQL query statement below
SELECT product_id as product_id
FROM Products
where low_fats='Y' AND recyclable='Y';