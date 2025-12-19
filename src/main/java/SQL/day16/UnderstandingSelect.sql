package
OOP.day16;

-- Making an overall selection in Customers
SELECT *
FROM Customers;

-- Selecting with specific columns
SELECT CustomerName, Country
FROM Customers;

-- Making a query using ORDER BY and ASC
SELECT CustomerName, Country
FROM Customers
ORDER BY Country ASC;

-- Making a query using ORDER BY and DESC
SELECT CustomerName, Country
FROM Customers
ORDER BY Country DESC;

--Where
SELECT CustomerName, Country
FROM Customers
WHERE Country = 'Germany';

SELECT CustomerName, Country
FROM Customers
WHERE Country = 'France'
ORDER BY CustomerName ASC;

-- AND
SELECT CustomerName, Country, City
FROM Customers
WHERE Country = 'Germany'
  AND City = 'Berlin'
ORDER BY CustomerName DESC;

-- OR
SELECT CustomerName, Country
FROM Customers
WHERE Country = 'Germany'
   OR Country = 'France';

--IN
SELECT CustomerName, Country
FROM Customers
WHERE Country IN ('Germany', 'France');

-- LIKE
SELECT CustomerName
FROM Customers
WHERE CustomerName LIKE 'A%';

SELECT CustomerName
FROM Customers
WHERE CustomerName LIKE 'A____';

-- BETWEEN
SELECT OrderId, OrderDate
FROM Orders
WHERE OrderId BETWEEN 10250 AND 10255;

SELECT OrderId, OrderDate
FROM Orders
WHERE OrderDate BETWEEN '1996-07-01' AND '1996-07-31';

--LIMIT
SELECT CustomerName, Country
FROM Customers
ORDER BY CustomerName
LIMIT 5;

-- MIXED UP
SELECT CustomerName, Country
FROM Customers
WHERE Country = 'Germany'
ORDER BY CustomerName
LIMIT 5;

SELECT CustomerName, Country
FROM Customers
ORDER BY CustomerName
LIMIT 5
OFFSET 5;

-- DISTINCT
SELECT DISTINCT Country
FROM Customers;

SELECT DISTINCT Country
FROM Customers
ORDER BY Country ASC;
