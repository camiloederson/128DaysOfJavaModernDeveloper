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