/*
AVG


You are given the following table sam_grades, which shows Sam’s exam scores.contentImageWrite a query to output the average of Sam's exam scores for the first semester.
Use the AVG() function!
*/

select avg(score) 
from sam_grades
where semester =1
