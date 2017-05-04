--###############################################

-- MySQL

-- Last updated : 2:07 AM Friday, April 14, 2017

--###############################################

-- MySQL command line 
-- C:> mysql --user=<username> --password=<password> <db_name>
-- C:> mysql -u <username> -p <password> <db_name>

-- Import SQL
-- C:> mysql -t < <sql_file>

-- Export to SQL


-- Exit
-- > exit

--###############################################

-- View Databases

	SHOW DATABASES;

-- View users

	SELECT * FROM mysql.user;

-- View connections

	SHOW status LIKE '%onn%';
	
-- Select a Database

	USE <db_name>;

-- Show tables

	SHOW TABLES;

-- Describe table

	DESC <table_name>;

-- Select queries

	SELECT * FROM employees;
	
	SELECT emp.* FROM employees AS emp;
	
-- Count records

	SELECT COUNT(*) FROM employees;
	
	

	


