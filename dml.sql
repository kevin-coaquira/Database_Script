/*Insert data*/
/*Store --> id_store(PK),name_store,address_store,stars*/
INSERT INTO store values ('1', 'NANO bicycles-Bike Rental Palma', 'Carrer dels Apuntadors, 6, Local, Palma,', '5');
INSERT INTO store values ('2', 'Call&Ride Bike Rental' ,'Carrer de Can Puigdorfila, 5, 07001 Palma ','4,5');
INSERT INTO store values ('3', 'Call&Ride Bike Rental', 'Carrer de Can Puigdorfila, 5, 07001 Palma', '4,5');
INSERT INTO store values ('4', 'NANO Bicycles', 'Carrer de la Mar, 10, 07012 Palma', '4');
INSERT INTO store values ('5', 'Two wheels grab a bike', 'Carrer Menorca, 4, Bajo Izq, 07011 Palma', '2');
/*Bike --> id_bike(PK), type_bike, price, id_store(FK)*/
INSERT INTO bike values('1', 'urban','120',);
INSERT INTO bike values('2', 'road', '300');
INSERT INTO bike values('3','triathlon and trial time', '289');
INSERT INTO bike values('4', 'mountain', '196');
INSERT INTO bike values('5', 'bmx', '200');
INSERT INTO bike values('6', 'ride', '290');
INSERT INTO bike values('7', 'hybrid', '500');
INSERT INTO bike values('8', 'road electric', '672');
INSERT INTO bike values('9', 'electric', '500');
INSERT INTO bike values('10', 'gravel', '930');

/*Contract --> id_custom(FK), number_contract(PK),id_bike(FK),id_extra(FK),
start_rent, finish_rent, id_insurance(FK)*/
INSERT INTO contracts values('1', '4', '2', '3', '2022-01-12', '2022-02-14', '3');
INSERT INTO contracts values('2', '1','4', '5', '2022-04-14', '2022-06-12', '1');
INSERT INTO contracts values('3', '3', '1', '6', '2022-03-08', '2022-05-05', '2');
INSERT INTO contracts values('4', '2', '6', '1', '2021-12-10','2022-01-10', '3');

/*Extra --> id_extra(PK), type_extra*/
INSERT INTO extra values('1', 'baby seat');
INSERT INTO extra values('2', 'basket');
INSERT INTO extra values('3', 'helmet');
INSERT INTO extra values('4', 'lights');
INSERT INTO extra values('5', 'padlock');
INSERT INTO extra values('6', 'GPS');
INSERT INTO extra values('7','None');
/*Insurance -->id_insurance(PK),type_insurance*/
INSERT INTO insurance values('1', 'No Insurance');
INSERT INTO insurance values('2', 'Basic');
INSERT INTO insurance values('3','Premium');
/*Custom -->id_custom(PK),name_custom,surname,birth,age,number_phone*/
INSERT INTO custom values('1', 'Juan', 'Fernandez', '1990-12-12', '31', '6123456');
INSERT INTO custom values('2', 'Pep', 'Rodriguez', '1980-01-23', '42', '7242242');
INSERT INTO custom values('3', 'Xisco', 'Hernandez', '2000-03-03', '22', '7242142');
INSERT INTO custom values('4', 'Alberto', 'Rodriguez', '1994-06-06', '28', '6599424');
