/*
Joining Tables


You are given the following students and teachers tables
students (with their teachers ID's)
:contentImageteachers
:contentImage
Write a query to output all of the students with their teachers' last names in one table, sorted by students ID.

*/

select s.id, s.firstname, s.lastname, t.lastname as teacher
from students s, teachers t
where s.teacherid = t.id
order by s.id
