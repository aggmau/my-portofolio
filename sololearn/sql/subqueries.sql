/*
Subqueries


Monica has just returned from nutritionist and was advised to only eat low-fat foods.
Here is the Foods table:contentImage
Help Monica lose weight by writing a query to choose the foods, whose fat percentages are lower than the average from the "Foods" table. Then show the resulting table.

*/

select *
from foods
where fatpercentage < (select avg(fatpercentage) from foods)
