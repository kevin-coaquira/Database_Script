create database bikes;
use bikes;
create table bike(
    id_bike INT AUTO_INCREMENT, /*PK*/
    type_bike VARCHAR(30),
    price DECIMAL,
    PRIMARY KEY (id_bike),
    FOREIGN KEY(id_store) references store(id_store) /*CHECKAR*/
);
create table store(
    id_store INT AUTO_INCREMENT, /*PK*/
    name_store VARCHAR(30),
    address_store VARCHAR(50),
    stars DECIMAL,
    PRIMARY KEY(id_store)
);

create table contracts(
    number_contract INT AUTO_INCREMENT,
    start_rent DATE,
    finish_rent DATE,
    PRIMARY KEY(number_contract),
    FOREIGN KEY(id_custom) references custom(id_custom),
    FOREIGN KEY(id_bike) references bike(id_bike),
    FOREIGN KEY(id_extra) references extra(id_extra),
    FOREIGN KEY(id_insurance) references insurance(id_insurance)
);

create table extra(
    id_extra INT AUTO_INCREMENT, /*PK*/
    type_extra VARCHAR(30) ,
    PRIMARY KEY(id_extra)
);

create table custom(
    id_custom INT AUTO_INCREMENT, /*PK*/
    name_custom VARCHAR(30), 
    surname VARCHAR(30),
    birth DATE,
    age INT,
    number_phone VARCHAR(20),
    PRIMARY KEY (id_custom)
);

create table insurance(
    id_insurance INT AUTO_INCREMENT, /*PK*/
    type_insurance VARCHAR(30),
    PRIMARY KEY(id_insurance)
);