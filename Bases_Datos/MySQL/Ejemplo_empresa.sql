drop database if exists Ejemplo_empresa;
create database Ejemplo_empresa;
use Ejemplo_empresa;
create table cliente(
	DNI char(9) primary key,
    Nombre VARCHAR (255) not null,
    Email VARCHAR (255),
    check (email like"%@%"));

create table producto(
	Cod_prod int primary key,
    Descrip VARCHAR (255) not null,
    precio_unit float not null);

create table compran(
	DNI char(9),
    Cod_prod int,
    Cantidad int not null,
    primary key(DNI,Cod_prod),
    FOREIGN KEY (DNI) REFERENCES cliente (DNI),
    FOREIGN KEY (Cod_prod) REFERENCES producto (Cod_prod));

select * from producto;
select * from cliente;
select * from compran;


insert into cliente values("73616403G","Juan","ASDF@gmail,com"),("87890987G","Adrian","jesus@hotmail.es"),("12345678T","Jesus","1@gmail.com");
insert into producto values(101,"lata de servesa",45.2),(102,"coche azul",100.45),(103,"cruzifijo",3.45);
insert into compran values("73616403G",101,600),("87890987G",102,2);
insert into cliente values("73616303G","Juan1","ASDFgmail.com");