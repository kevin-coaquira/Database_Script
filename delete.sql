/*Borrar datos*/
/*Custom*/
DELETE FROM custom WHERE surname = 'Fernandez' and age>28;
DELETE FROM custom; /*Para borrar todo las columnas*/
/*Insurance*/
DELETE FROM insurance WHERE type_insurance = 'Basic';
/*Contracts*/
DELETE FROM contracts WHERE start_rent  between 2022-01-01 and 2022-06-31;
/*Bike*/
DELETE FROM bike WHERE type_bike='urban';
DELETE FROM bike WHERE type_bike='urban' and type_bike='road';
DELETE FROM bike WHERE type_bike like 'ro%';
DELETE FROM bike WHERE price>500
/*Extra*/
DELETE FROM extra WHERE type_extra='lights';
DELETE FROM extra WHERE type_extra like 'ba%';
/*Store*/
DELETE FROM store WHERE address_store like 'Carrer%';
DELETE FROM store WHERE stars>3.5;
DELETE FROM store WHERE name_Store like '%Bike%';