
SELECT c.CustomerName, o.OrderID
FROM Orders o
         RIGHT JOIN Customers c
                    ON o.CustomerID = c.CustomerID;


SELECT c.CustomerName, o.OrderID
FROM Orders o RIGHT JOIN Customers c
                         ON o.CustomerID = c.CustomerID
WHERE o.OrderID is NULL