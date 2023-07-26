# Simple Integration with MySql
this repository contains a simple Rest Api and integration with a Mysql DB  

## Before run the application
Suggest to use Docker to run the MySql DB    
https://hub.docker.com/_/mysql  
Create a table `test`
Use the same settings you find in the file `application.properties`

## Other components
I create the table and preload data with DDL/DML:  
`mysqltemplate\src\main\resources\data-mysql.sql`
`mysqltemplate\src\main\resources\schema-mysql.sql`