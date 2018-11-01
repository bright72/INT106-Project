drop table orders;

create table orders (
orderId int NOT NULL,
orderDate Date Not null,
customerId int Not null,
comment varchar(200),
PRIMARY KEY(orderId),
CONSTRAINT orders_ibfk_1 FOREIGN KEY(customerID) REFERENCES account (customerID));

drop table orderDetail;

create table orderDetail (
orderId int NOT NULL,
productCode int Not null,
quantity int Not null,
priceEach decimal(4,2) Not null,
PRIMARY KEY(orderId, productCode),
CONSTRAINT orderdetail_ibfk_1 FOREIGN KEY(orderID) REFERENCES orders (orderID),
CONSTRAINT orderdetail_ibfk_2 FOREIGN KEY(productCode) REFERENCES product (productCode));

drop table product;

create table product (
productCode int not null,
productName varchar(30) not null,
productPrice decimal(4,2) not null,
productType varchar(25),
PRIMARY KEY (productCode));