SELECT Orders.OrderId, Customers.CustomerName
FROM Orders
         INNER JOIN Customers
                    ON Orders.CustomerID = Customers.CustomerID

-- Using where
SELECT Orders.CustomerId, Customers.CustomerName
FROM Orders
         INNER JOIN Customers
                    ON Orders.CustomerID = Customers.CustomerID
WHERE Customers.Country = 'Germany'

SELECT o.OrderID, c.CustomerName, p.ProductName
FROM Orders o
    inner join customers c
on o.CustomerID = c.CustomerID
inner join orderdetails od
    on o.OrderID = od.OrderID
inner join Products p
    ON od.ProductID = p.ProductID

SELECT c.CustomerName, o.OrderID
FROM Orders o
         INNER JOIN Customers c
                    ON o.CustomerID = c.CustomerID

SELECT c.CustomerName, c.Country, o.OrderID
FROM Orders o
         INNER JOIN Customers c
                    ON o.CustomerID = c.CustomerID
WHERE c.Country = 'Germany'

SELECT p.ProductName, od.OrderID
FROM Products p
         INNER JOIN OrderDetails od
                    ON p.ProductID = od.ProductID