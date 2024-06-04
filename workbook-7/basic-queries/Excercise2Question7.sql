USE northwind;


-- Products that have no units left but 1 or more on back order
-- order by product name

SELECT *

FROM Products
WHERE UnitsInStock = 0 AND UnitsOn
Order >= 1
ORDER BY ProductName
; 

SELECT MIN(UNITPRICE) -- get the min of that order
	, MAX(UnitPrice)

FROM `Order Details` -- fron order details table 
WHERE OrderID = 10248 -- order id = this number
;