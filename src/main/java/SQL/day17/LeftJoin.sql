SELECT c.CustomerName, o.OrderID
FROM Customers c
         LEFT JOIN Orders o ON c.CustomerID = o.CustomerID

SELECT c.CustomerNAME, o.OrderID
FROM Customers c LEFT JOIN Orders o
                           ON c.CustomerID = o.CustomerID
WHERE o.OrderID is NULL