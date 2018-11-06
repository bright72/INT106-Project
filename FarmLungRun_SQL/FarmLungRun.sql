drop table account;

create table account (
username varchar(20),
encryptedPassword varchar(20) Not null,
fname varchar(30) Not null,
lname varchar(50) Not null,
address varchar(100),
province varchar(20),
country varchar(20),
postalCode varchar(10),
PRIMARY KEY(username));

drop table orders;

create table orders (
orderId int NOT NULL,
orderDate Date Not null,
username varchar(20) Not null,
comment varchar(200),
PRIMARY KEY(orderId),
CONSTRAINT orders_ibfk_1 FOREIGN KEY(username) REFERENCES account (username));

drop table orderDetail;

create table orderDetail (
orderDetailId int NOT NULL,
orderId int NOT NULL,
productCode int Not null,
quantity int Not null,
priceEach decimal(4,2) Not null,
PRIMARY KEY(orderDetailId),
CONSTRAINT orderdetail_ibfk_1 FOREIGN KEY(orderID) REFERENCES orders (orderID),
CONSTRAINT orderdetail_ibfk_2 FOREIGN KEY(productCode) REFERENCES product (productCode));

drop table product;

create table product (
productCode int not null,
productName varchar(30) not null,
productPrice decimal(4,2) not null,
productType varchar(25),
PRIMARY KEY (productCode));