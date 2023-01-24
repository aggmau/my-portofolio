/*

Apartments


You want to rent an apartment and have the following table named Apartments
:contentImage
Write a query to output the apartments whose prices are greater than the average and are also not rented, sorted by the 'Price' column.

*/

select * from apartments
where status = 'Not rented'
and price > (select avg(price) from apartments)
order by price
