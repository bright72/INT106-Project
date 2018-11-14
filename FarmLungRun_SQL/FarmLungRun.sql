drop table account;

create table account (
username varchar(20),
encryptedPassword varchar(100) Not null,
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

drop table product;

create table product (
productCode varchar(10) not null,
productName varchar(30) not null,
productPrice decimal(10,2) not null,
productType varchar(25),
PRIMARY KEY (productCode));

insert into product values 
('V_1001','Tomato',36,'Vegetable');
insert into product values
('V_1002','Carrot',28,'Vegetable');
insert into product values
('V_1003','Potato',35,'Vegetable');
insert into product values
('V_1004','Lettuce',25,'Vegetable');
insert into product values
('V_1005','Pumpkin',35,'Vegetable');
insert into product values
('V_1006','Broccoli',52,'Vegetable');
insert into product values
('F_2001','Orange',35,'Fruit');
insert into product values
('F_2002','Mango',35,'Fruit');
insert into product values
('F_2003','Pineapple',96,'Fruit');
insert into product values
('F_2004','Mangosteen',50,'Fruit');
insert into product values
('F_2005','Pomegranate',180,'Fruit');
insert into product values
('F_2006','Watermelon',32,'Fruit');
insert into product values
('D_3001','Cheese',1200,'Dairy Product');
insert into product values
('D_3002','Yogurt',104,'Dairy Product');
insert into product values
('D_3003','Butter',430,'Dairy Product');
insert into product values
('D_3004','Powdered Milk',420,'Dairy Product');
insert into product values
('D_3005','Condensed Milk',58,'Dairy Product');
insert into product values
('D_3006','Milk',205,'Dairy Product');
insert into product values
('E_4001','Egg',90,'Egg');
insert into product values
('E_4002','Duck Egg',120,'Egg');
insert into product values
('E_4003','Quail Egg',74,'Egg');
insert into product values
('M_5001','Pork',139,'Meat');
insert into product values
('M_5002','Beaf',985,'Meat');
insert into product values
('M_5003','Chicken Meat',140,'Meat');
insert into product values
('M_5004','Lamb Meat',550,'Meat');
insert into product values
('M_5005','Duck Meat',390,'Meat');
insert into product values
('M_5006','Salmon',630,'Meat');

drop table orderDetail;

create table orderDetail (
orderDetailId int NOT NULL,
orderId int NOT NULL,
productCode varchar(10) Not null,
quantity int Not null,
priceEach decimal(10,2) Not null,
PRIMARY KEY(orderDetailId),
CONSTRAINT orderdetail_ibfk_1 FOREIGN KEY(orderID) REFERENCES orders (orderID),
CONSTRAINT orderdetail_ibfk_2 FOREIGN KEY(productCode) REFERENCES product (productCode));