/*Borrar tablas*/
/*Custom*/
drop table custom;
/*Bike*/
drop table bike;
alter table bike
drop foreign key(id_store);
/*Store*/
drop table store;
/*Insurance*/
drop table insurance;
/*Contract*/
drop table contracts;
alter table contracts
drop foreign key(id_custom),
drop foreign key(id_insurance);
/*Extra*/
drop table extra;