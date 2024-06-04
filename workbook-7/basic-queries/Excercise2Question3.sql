USE northwind;

-- list productid 
-- list productName
-- list unitprice
-- order ascending by price


SELECT ProductID
		, ProductName
        , UnitPrice 
        
FROM Products
ORDER BY UnitPrice DESC;        