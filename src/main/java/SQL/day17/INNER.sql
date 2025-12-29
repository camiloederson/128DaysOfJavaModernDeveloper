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