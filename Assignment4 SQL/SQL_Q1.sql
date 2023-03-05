Q-1. Write an SQL query to fetch “FIRST_NAME” from the Worker table using the alias name <WORKER_NAME>.
 SQL>  select Frist_Name as Worker_Name from Worker;

Q-2. Write an SQL query to find the position of the alphabet (‘a’) in the first name column ‘Amitabh’ from the Worker table.
 SQL>  select POSITION('a' IN first_name) from Worker where First_Name = 'Amitabh';

Q-3. Write an SQL query to print the FIRST_NAME from the Worker table after replacing ‘a’ with ‘A’.
  SQL> select replace(First_Name,'a','A') from Worker;

Q-4. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending.
  SQL>  select * from Worker order by First_Name asc;

Q-5. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending and DEPARTMENT Descending.
  SQL>  select * from Worker order by First_Name,Department desc;

Q-6. Write an SQL query to print details for Workers with the first name as “Vipul” and “Satish” from the Worker table.
  SQL>  select * from Worker where First_Name IN('Vipul','Satish');

Q-7. Write an SQL query to print details of Workers with DEPARTMENT name as “Admin”
  SQL> select * from Worker where Department IN('Admin');

Q-8. Write an SQL query to print details of the Workers whose FIRST_NAME contains ‘a'
  SQL> select * from Worker where First_name Like('a%');

Q-9. Write an SQL query to print details of the Workers whose SALARY lies between 100000 and 500000.
  SQL> select * from Worker where Salary Between 100000 and 500000;

Q-10. Write an SQL query to print details of the Workers whose FIRST_NAME ends with ‘h’ and contains six alphabets.
  SQL> select * from Worker where First_Name like('______h');

Q-11. Write an SQL query to print details of the Workers who have joined in Feb’2014.
  SQL> select * from Worker where Joining_Date Like('%FEB-14');

Q-12. Write an SQL query to fetch worker names with salaries >= 50000 and <= 100000.
  SQL> select * from Worker where Salary>=50000 AND Salary<=100000;

