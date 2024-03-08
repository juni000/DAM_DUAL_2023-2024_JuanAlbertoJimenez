drop database if exists prueba;
create database prueba;
use prueba;
create table personas (
	ID int not null unique,
    Apellidos varchar(255) not null,
    Nombre varchar(255) not null,
    Edad int
);
create table personas2 (
	ID int not null unique,
    Apellidos varchar(255) not null,
    Nombre varchar(255) not null,
    Edad int,
    primary key (ID)
);
CREATE TABLE almacen (
	estante varchar(3),
	producto varchar(3),
	localizacion varchar(30),
	cantidad int,
	PRIMARY KEY (estante,producto)
);
alter table personas2 add renta int;
drop table personas2;

