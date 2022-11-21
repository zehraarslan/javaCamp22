--Select
SELECT * FROM Customers;
Select ContactName, City from Customers
-- !ANSII :
Select ContactName Adi, City Sehir from Customers

--Where Koşulu 
Select * from Customers where City = 'London'
Select * from Products where categoryId = 1
Select * from Products where categoryId = 1 or categoryId = 3
Select * from Products where categoryId = 1 and Price>=10

--Order by (Sıralama)
Select * from Products order by CategoryId, ProductName
-- asc -ascending (artan sıralama)
Select * from Products order by Price asc
-- desc -descending (azalan sıralama)
Select * from Products order by Price desc
Select * from Products where CategoryId=1 order by Price desc

--Şarta uyan tüm satırları say sayısını ver.
Select count(*) Adet from Products where CategoryId=2

--Group by Tekrar etmiyecek şekil de listelemek.
Select CategoryId, count(*) from Products group by CategoryId
Select CategoryId, count(*) from Products where Price>20 group by CategoryId having count(*)<10
 
Select Products.ProductId, Products.ProductName, Products.Price, Categories.CategoryName  from Products inner join Categories on Products.CategoryId = Categories.CategoryId where Products.Price>10
 
--DTO Data Trabsformation Object
 
Select * from Products p left join OrderDetails od on p.ProductId = od.ProductId
 
Select * from Customers c left join Orders o on c.CustomerId = o.CustomerId where o.CustomerId is null
