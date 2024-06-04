USE northwind;

-- At least 100 units on hand
-- Orderby Price biggest to smallest

SELECT * 

FROM PRODUCTS 
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC
;
