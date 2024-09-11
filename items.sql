create database CheckCompras;
use CheckCompras;

create table items (
id int auto_increment primary key,
nome varchar(255),
quantity int,
price double
);

insert into items (nome, quantity, price) values ('Maçã', 5, 2.50);

select * from items;

