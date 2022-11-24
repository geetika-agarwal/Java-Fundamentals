-- 1. List all suppliers in reverse alphabetical order.
	
	SELECT * FROM supplier
	ORDER BY companyName DESC;
	
-- 2.	List all customers in Italy.
	
	SELECT * FROM customer
	WHERE Country='Italy';
	
-- 3.	List all customers in Paris sorted by last name.

	SELECT * FROM customer
	WHERE City='Paris'
	ORDER BY LastName;
	
-- 4.	Add Oxford Trading to the list of suppliers.
	
	INSERT into supplier
	VALUES (30, 'Oxford Trading', 'Ruth Oxford', 'New York', 'USA', '(131) 0016435', NULL);
	
-- 5.	Supplier with id 24 has moved. Change their city from Sydney to Melbourne.
	
	UPDATE supplier 
	SET city = 'Melbourne'
	WHERE id = 24;

-- 6.	Remove 'Stroopwafels' from the products.

	DELETE FROM product WHERE productName = 'Stroopwafels';
	
-- 7.	List all suppliers in the UK.

	SELECT * FROM supplier WHERE country = 'UK';
	
-- 8.	List all customers.
	
	SELECT * FROM customer;
	
-- 9.	List the first name, last name, and city of all customers.

	SELECT FirstName, LastName, City FROM customer;
	
-- 10.	List all suppliers in France.
	
	SELECT * FROM supplier
	WHERE country='France';
	
-- 11.	List all customers in Sweden.

	SELECT * FROM customer
	where Country='Sweden';
	
-- 12.	For supplier Pavlova, Ltd, change the city to Sydney.

	UPDATE supplier
	SET city='Sydney'
	WHERE companyName='Pavlova, Ltd';
	
-- 13.	Delete products with a price higher than $50.
	
	DELETE FROM product
	WHERE unitPrice>='50.00';
	
-- 14.	An INSERT statement that adds a new supplier to the database

	INSERT INTO supplier 
	VALUES (31, 'Pavlova, Ltd', 'Anna Pavlova', 'QueensLand', 'Australia', '(121) 3719729', NULL);
	
-- 15.	Add new customer Craig Smith to the database.

	INSERT INTO customer
	VALUES (92, 'Craig' , 'Smith', 'Seoul', 'South Korea', '(125) 237979');

-- 16.	Leka Trading supplier has also become a customer. Add a customer record with values from the supplier table.

	INSERT INTO customer (FirstName, City, Country, Phone)
	SELECT contactName, city, country, phone FROM supplier s
	WHERE s.companyName = 'Leka Trading';
	
-- 17.	Change the phone number for supplier Tokio Traders. 	
	
	UPDATE supplier
	SET phone='(097) 379200'
	WHERE companyName='Tokyo Traders';
	
-- 18.	Discontinue all products in the database.

	UPDATE product
	set isDiscontinued = 1
	WHERE isDiscontinued= 0;
	
-- 19.	Discontinue all products over $50.

	UPDATE product
	set isDiscontinued = 1
	WHERE unitPrice>=50.00;
	
-- 20.	Discontinue the product with Id = 46
	
	DELETE FROM product WHERE id=46;
	
-- 21.	Supplier Norske Meierier (Id = 15) has moved. Change their city, phone, and fax with updated values.

	UPDATE supplier
	set city='Oslo', phone = '(10-89) 290796', fax='(10-89) 290796'
	WHERE id=15;
-- 22.	Remove customer Elizabeth Lincoln who lives in Canada.

	DELETE FROM customer
	where FirstName='Elizabeth' AND LastName='Lincoln' AND Country='Canada';
	
-- 25.	Remove customer with Id = 21.

	DELETE FROM customer WHERE id=21;
	
-- 26.	List all customers sorted by country.

	SELECT * FROM customer
	ORDER BY Country;
	
-- 27.	List all suppliers in alphabetical order.

	SELECT * FROM supplier
	ORDER BY companyName;
	
-- 28.	List all suppliers in reverse alphabetical order

	SELECT * FROM supplier
	ORDER BY companyName DESC;
	
-- 29.	List all customers ordered by country, then by city within each country.

	SELECT * FROM customer
	ORDER BY Country, City;
	
-- 30.	List all suppliers in the USA, Japan, and Germany, ordered by city, then by company name in reverse order.	

	SELECT * FROM supplier
	WHERE country IN ('USA', 'Japan', 'Germany')
	ORDER by city, companyName DESC;

-- 31.	List all orders, sorted by amount (largest first), within each year.

	-- SELECT * FROM orderTable
	-- ORDER by totalAmount DESC, orderDate;
	
-- 32.	List all suppliers with their products.

		SELECT s.id, s.companyName, p.id, p.productName
		FROM supplier s JOIN product p
		ON s.id = p.supplierId;

-- 33.	List all orders with customer information.
	
	SELECT o.id AS orderId, c.firstName, c.lastName
	FROM orderTable o join customer c
	ON o.customerId = c.id;
	
-- 34.	List all orders with product name, quantity, and price, sorted by order number.

	SELECT p.productName, q.quantity, q.unitPrice, o.orderNumber
	FROM product p inner join orderItem q
	ON p.id=q.productId
	inner join orderTable o
	on q.orderId=o.id
	order by o.orderNumber;
	
-- 35.	List all suppliers and their products, including suppliers with no products.

	SELECT s.companyName, p.productName
	FROM supplier s left join product p
	ON s.id = p.supplierId;
	
-- 36.	List all customers and the total amount they spent irrespective whether they placed any orders or not.

	SELECT c.id, sum(o.totalAmount)
	FROM Customer c Left join OrderTable o 
	ON c.id = o.customerId
	GROUP BY c.id;
	
-- 39.	List all customers -- with or without orders -- and a count of the orders that include a '2kg box with Konbu' (product with Id = 13). Sort the results by number of orders.

	SELECT c.*, q.productId, q.id, count(q.id) 
	FROM customer c left join orderTable o
	ON c.id=o.customerId 
	inner join orderItem q 
	on o.id = q.orderId and q.productId=13
	group by c.id;
	
-- 40.	List all customers and their order dates, including those without orders

	SELECT c.*, o.orderDate
	from customer c left join orderTable o
	ON c.id = o.customerId;
	
-- 41.	Match all customers and suppliers by country.

	SELECT c.id as customerId, s.id as supplierId
	from Customer c join supplier s 
	on c.country = s.country;
	
-- 42.	Match suppliers that are from the same country.

	select s1.contactName as Person1, s2.contactName as Person2, s1.country, s2.country
	from supplier s1 join supplier s2
	ON s1.id<>s2.id AND s1.country = s2.country;
	
-- 43.	Match customers that are from the same city and country.

	SELECT c1.firstName as Person1, c2.firstName as Person2
	FROM customer c1 join customer c2
	ON c1.id<>c2.id AND c1.city = c2.city AND c1.country = c2.country;
	
-- 44.	Find customers with the same first name (i.e. duplicates).

	SELECT c1.id as person1, c2.id as person2
	FROM customer c1 join customer c2
	ON c1.id<>c2.id AND c1.firstName=c2.firstName;
	
-- 45.	Increase the unit price by 10% for all products that have been sold before.