Q-13. Write a SQL query to find the salesperson and customer who reside in the same city. Return Salesman, cust_name, and city

SQL> select name,cust_name,salesman.city from salesman,customer where salesman.city=customer.city;

Q-14. Write a SQL query to find the salesperson(s) and the customer(s) he represents. Return Customer Name, city, Salesman, and commission.

SQL> select cust_name,customer.city,name,commission from customer,salesman where salesman.salesman_id=customer.salesman_id;

Q-15. Write a SQL query to find salespeople who received commissions of more than 12 percent from the company. Return Customer Name, customer city, Salesman, and commission.

SQL> select cust_name,customer.city,name,commission from salesman,customer where commission>.12 and salesman.salesman_id=customer.salesman_id;
