SELECT CustomerName,Country
FROM Customers
WHERE COUNTRY IN ('Germany', 'France')
ORDER BY CustomerName ASC

SELECT OrderId as Orden, OrderDate as FechaDeOrden
FROM Orders WHERE OrderDate BETWEEN '1997-01-01' AND '1997-12-31'

SELECT c.CustomerName, o.OrderID
FROM Orders o INNER JOIN Customers c
                         ON o.CustomerID = c.CustomerID

SELECT p.ProductName, o.OrderID
FROM Products p
         INNER JOIN OrderDetails od ON p.ProductID = od.ProductID
         INNER JOIN Orders o ON o.OrderID = od.OrderID

SELECT c.CustomerName, o.OrderID
FROM Customers c LEFT JOIN Orders o
                           ON c.CustomerID = o.CustomerID

SELECT c.CustomerName, o.OrderID
FROM Customers c LEFT JOIN Orders o
                           ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL

SELECT c.CustomerName, o.OrderID, o.OrderDate
FROM Customers c LEFT JOIN Orders o
                           ON c.CustomerID = o.CustomerID AND o.OrderDate BETWEEN '1997-01-01' AND '1997-12-31'

SELECT c.CustomerName, COUNT(o.OrderID)
FROM Customers c LEFT JOIN Orders o
                           ON c.CustomerID = o.CustomerID
GROUP BY c.CustomerName

SELECT c.CustomerName, COUNT(o.OrderID)
FROM Customers c LEFT JOIN Orders o
                           ON c.CustomerID = o.CustomerID
GROUP BY c.CustomerName HAVING COUNT(o.OrderID) > 5

