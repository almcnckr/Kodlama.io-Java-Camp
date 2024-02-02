#select
Select ContactName Adi, City Sehir from customers;

select * from customers where city= 'Berlin';

#case insensitive
SeLeCT * from products where CategoryID = 1 or CategoryID = 3;

select * from products where CategoryID = 1 and Price>=10;

select * from products where CategoryID=1 order by Price desc; #ascending descending

select count(*) from products;

select CategoryID, count(*) from products where price>20 group by CategoryID having count(*) < 10;

select products.ProductID, products.ProductName, products.Price, categories.CategoryName 
from products inner join categories 
on products.CategoryID = categories.CategoryID
where Price >10 ;

select * from products p inner join orderdetails od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID;

select * from customers c left join orders o 
on c.CustomerID = o.CustomerID
where o.CustomerID is null