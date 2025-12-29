SELECT Orders.OrderId, Customers.CustomerName
FROM Orders
         INNER JOIN Customers
                    ON Orders.CustomerID = Customers.CustomerID