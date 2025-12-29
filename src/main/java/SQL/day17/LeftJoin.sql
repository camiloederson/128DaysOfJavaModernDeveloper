SELECT c.CustomerName, o.OrderID
FROM Customers c
         LEFT JOIN Orders o ON c.CustomerID = o.CustomerID

SELECT c.CustomerNAME, o.OrderID
FROM Customers c LEFT JOIN Orders o
                           ON c.CustomerID = o.CustomerID
WHERE o.OrderID is NULL

SELECT c.CustomerName as CustomerName, o.OrderID as OrderNumber, o.OrderDate as OrderDate
FROM Customers c LEFT JOIN Orders o
                           ON c.CustomerID = o.CustomerID
WHERE o.OrderDate BETWEEN '1997-01-01' AND '1997-12-31'

SELECT c.CustomerName as CustomerName, COUNT(O.OrderID) as NumberOfOrders
FROM Customers c LEFT JOIN Orders o
                           ON c.CustomerID = o.CustomerID
GROUP BY c.CustomerName