show tables;
/*
CREATE TABLE Customer (

    cust_id INT PRIMARY KEY,

    name VARCHAR(50) NOT NULL,

    email VARCHAR(100) UNIQUE,

    phone VARCHAR(15),

    city VARCHAR(50),

    account_type VARCHAR(20),  -- Saving / Current

    balance DECIMAL(10,2) DEFAULT 0,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);

 
 
INSERT INTO Customer (cust_id, name, email, phone, city, account_type, balance) VALUES

(1, 'Amit Sharma', 'amit@gmail.com', '9876543210', 'Delhi', 'Saving', 15000),

(2, 'Neha Verma', 'neha@gmail.com', '9876543211', 'Mumbai', 'Current', 25000),

(3, 'Rohit Kumar', 'rohit@gmail.com', '9876543212', 'Noida', 'Saving', 18000),

(4, 'Priya Singh', 'priya@gmail.com', '9876543213', 'Pune', 'Saving', 22000),

(5, 'Ankit Jain', 'ankit@gmail.com', '9876543214', 'Jaipur', 'Current', 30000),

(6, 'Sneha Gupta', 'sneha@gmail.com', '9876543215', 'Delhi', 'Saving', 12000),

(7, 'Rahul Mehta', 'rahul@gmail.com', '9876543216', 'Chennai', 'Current', 27000),

(8, 'Kavita Joshi', 'kavita@gmail.com', '9876543217', 'Bangalore', 'Saving', 16000),

(9, 'Vikas Yadav', 'vikas@gmail.com', '9876543218', 'Lucknow', 'Saving', 14000),

(10, 'Pooja Kapoor', 'pooja@gmail.com', '9876543219', 'Chandigarh', 'Current', 35000),

(11, 'Arjun Patel', 'arjun@gmail.com', '9876543220', 'Ahmedabad', 'Saving', 21000),

(12, 'Ritu Malhotra', 'ritu@gmail.com', '9876543221', 'Delhi', 'Saving', 19000),

(13, 'Sandeep Roy', 'sandeep@gmail.com', '9876543222', 'Kolkata', 'Current', 28000),

(14, 'Meena Iyer', 'meena@gmail.com', '9876543223', 'Chennai', 'Saving', 17000),

(15, 'Deepak Chauhan', 'deepak@gmail.com', '9876543224', 'Noida', 'Current', 26000),

(16, 'Nisha Arora', 'nisha@gmail.com', '9876543225', 'Delhi', 'Saving', 13000),

(17, 'Manoj Tiwari', 'manoj@gmail.com', '9876543226', 'Varanasi', 'Saving', 11000),

(18, 'Komal Shah', 'komal@gmail.com', '9876543227', 'Surat', 'Current', 32000),

(19, 'Tarun Khanna', 'tarun@gmail.com', '9876543228', 'Delhi', 'Saving', 20000),

(20, 'Simran Kaur', 'simran@gmail.com', '9876543229', 'Amritsar', 'Current', 29000);
 
select * from  customer;

INSERT INTO Customer (cust_id, name, email, phone, city,  balance) VALUES

(21, 'Amit C', 'amit23@gmail.com', '9876543210', 'Delhi', 15000),

(22, 'Neha Verma', 'neha2@gmail.com', '9876543211', "pune",  25000);
 
*/
 
select * from customer where account_type is null;

select name from customer where name like '_e%';

alter table customer add column state varchar(255) default 'Tamilnadu';

describe customer;


insert into customer(cust_id, name, email, phone, city, account_type, balance) VALUES
(23, 'Amit Sharma', 'amit@gmail.com', '9876543210', 'Delhi', 'Saving', 15000),

(24, 'Neha Verma', 'neha@gmail.com', '9876543211', 'Mumbai', 'Current', 25000);



/*Write a query to find customers whose second character in name is 'a'.
*/
select  * from customer where name like '_a%';
/*

Write a query to display customers whose name has exactly 5 characters.

select * from customer where name like '_____';

*/
/*
Write a query to find customers whose email contains 'gmail' but does not end with '.com'.
*/
select * from customers where email like '%gmail%' and email not like '%.com%';
 /*
Write a query to display customers whose city name has 'a' as the third character.
*/
select * from customer where city like '__a%';
/*
Write a query to find customers whose name starts with any vowel.
*/
select * from customer where name like 'A%' or name like 'I%' or name like 'E%' or name like 'O%' or name like 'U%';
/*
Write a query to display customers whose phone number is NULL and account type is 'Saving'.
*/
select * from customer where phone_number is null AND account_type='Saving';
/*
Write a query to find customers whose email is NULL or phone is NULL.
*/
select * from customer where email is null or phone is null;
/*
Write a query to display customers whose balance is between 15000 and 30000 and city is not 'Delhi'.
*/
select * from customers where balance between 150000 and 30000 and city<>'Delhi';
/*
Write a query to find customers whose cust_id is between 5 and 15 and account type is 'Current'.
*/
select * from customer where cust_id between 5 and 15 and account_type='Current';

#Write a query to display customers whose created_at date is between '2024-01-01' and '2024-12-31' and balance > 20000.

select * from cutomer where date between '2024-01-01' and '2024-12-31' and balance > 20000;


update customer set balance=balance*1.05 where cust_id=19;

delete from customer where cust_id=21;

select * from customer;

select * from customer 
order by account_type,balance;

select count(*) from customer where balance <=10000;


select city,count(cust_id) from customer group by city
having sum(balance)> 20000;

select city from customer group by city
having count(cust_id)>2;


#Write a query to update balance by adding 5000 for all customers with Saving account.

update customer set balance =balance+5000 where account_type='Saving';

#Write a query to update city to 'Delhi' where cust_id is 5.

update customer set city='Delhi' where cust_id=5;

#Write a query to increase balance by 10% for customers whose balance is less than 20000.

update customer set balance=balance+balance*0.10 where balance<20000;

#Write a query to delete customers whose balance is less than 12000.

delete from customer where balance<12000;

#Write a query to delete customers from city 'Chennai'

delete from customer where city='Cheennai';

#Write a query to count number of customers in each city using GROUP BY.

select count(cust_id) as 'no_of_customers' from customer group by city;

#Write a query to find total balance for each account type.

select sum(balance) as 'total_balance' from customer group by account_type;

#Write a query to find average balance city-wise.

select avg(balance) as 'avg_balance' from customer group by city;

#Write a query to display cities having more than 2 customers using HAVING.

select city from customer group by city
having count(cust_id)>2;

#Write a query to find account types where total balance is greater than 50000 using HAVING.

select account_type from customer group by account_type having sum(balance)>50000;

#Write a query to display all customers sorted by balance in descending order.

select * from customer order by balance desc;

#Write a query to display customers sorted by city and then by name.

select * from customer order by city,name;

#Write a query to find maximum balance in each city.

select max(balance),city from customer group by city;

#Write a query to delete customers whose email is NULL.

delete from customer where email is null;

#Write a query to update account type to 'Current' where balance is greater than 30000.

update customer set account_type='current' where balance>30000;


CREATE TABLE Items (
    item_no INT PRIMARY KEY,
    name VARCHAR(50),
    price DECIMAL(10,2),
    qty INT
);

CREATE TABLE Orders (
    bill_no INT PRIMARY KEY,
    item_no INT,
    city VARCHAR(50),
    qty INT,
    bill DECIMAL(10,2),
    FOREIGN KEY (item_no) REFERENCES Items(item_no)
);

INSERT INTO Items VALUES (1, 'Pen', 10.00, 100);
INSERT INTO Items VALUES (2, 'Pencil', 5.00, 200);
INSERT INTO Items VALUES (3, 'Notebook', 50.00, 150);
INSERT INTO Items VALUES (4, 'Eraser', 3.00, 300);
INSERT INTO Items VALUES (5, 'Sharpener', 7.00, 250);
INSERT INTO Items VALUES (6, 'Marker', 20.00, 120);
INSERT INTO Items VALUES (7, 'Scale', 15.00, 180);
INSERT INTO Items VALUES (8, 'Bag', 500.00, 50);
INSERT INTO Items VALUES (9, 'Bottle', 200.00, 80);
INSERT INTO Items VALUES (10, 'Lunch Box', 300.00, 60);


INSERT INTO Orders VALUES (101, 1, 'Delhi', 5, 50.00);
INSERT INTO Orders VALUES (102, 3, 'Noida', 2, 100.00);
INSERT INTO Orders VALUES (103, 5, 'Gurgaon', 4, 28.00);
INSERT INTO Orders VALUES (104, 8, 'Delhi', 1, 500.00);
INSERT INTO Orders VALUES (105, 10, 'Noida', 3, 900.00);

select city,price from Items inner join Orders on Items.item_no=Orders.item_no;
select name,city,price from Items left join Orders on Items.item_no=Orders.item_no;

select city,price from Items right join Orders on Items.item_no=Orders.item_no;
#select city,price from Items full  outer join Orders on Items.item_no=Orders.item_no;

#Display order details along with item name and price.
SELECT Orders.*, Items.name, Items.price
FROM Orders
INNER JOIN Items 
ON Orders.item_no = Items.item_no;

#Show bill number, item name, city, and total bill amount

select Orders.bill_no,Items.name,Orders.city,sum(Orders.bill) from Items inner join Orders on Items.item_no=Orders.item_no
group by Orders.bill,Items.name,Orders.city;

#List all items along with their ordered quantity (if available).
SELECT Items.name, Orders.quantity
FROM Items
LEFT JOIN Orders 
ON Items.item_no = Orders.item_no;

SELECT DISTINCT Items.name
FROM Items
INNER JOIN Orders 
ON Items.item_no = Orders.item_no;

SELECT Items.name
FROM Items
LEFT JOIN Orders 
ON Items.item_no = Orders.item_no
WHERE Orders.item_no IS NULL;

SELECT Orders.*, Items.name
FROM Orders
INNER JOIN Items 
ON Orders.item_no = Items.item_no
WHERE Orders.city = 'Delhi';

SELECT Items.name, SUM(Orders.quantity) AS total_quantity
FROM Items
INNER JOIN Orders 
ON Items.item_no = Orders.item_no
GROUP BY Items.name;

SELECT Items.name, SUM(Items.price * Orders.quantity) AS revenue
FROM Items
INNER JOIN Orders 
ON Items.item_no = Orders.item_no
GROUP BY Items.name;

SELECT Orders.*, Items.name
FROM Orders
INNER JOIN Items 
ON Orders.item_no = Items.item_no
ORDER BY Orders.bill DESC;

SELECT Items.name, Orders.city
FROM Items
INNER JOIN Orders 
ON Items.item_no = Orders.item_no
WHERE Items.price > 100;

SELECT Orders.*, Items.name
FROM Orders
INNER JOIN Items 
ON Orders.item_no = Items.item_no
WHERE Orders.quantity > 2;

SELECT Items.*, Orders.*
FROM Items
LEFT JOIN Orders 
ON Items.item_no = Orders.item_no;

SELECT Orders.*, Items.*
FROM Orders
LEFT JOIN Items 
ON Orders.item_no = Items.item_no;

SELECT Items.name, SUM(Orders.quantity) AS total_qty
FROM Items
INNER JOIN Orders 
ON Items.item_no = Orders.item_no
GROUP BY Items.name
ORDER BY total_qty DESC
LIMIT 1;


#Display city-wise total bill amount with item details.

SELECT Orders.city, Items.name, SUM(Items.price * Orders.quantity) AS total_bill
FROM Orders
INNER JOIN Items 
ON Orders.item_no = Items.item_no
GROUP BY Orders.city, Items.name;

use hexaware;
create table products(id int,name varchar(20),price double(10,2));







