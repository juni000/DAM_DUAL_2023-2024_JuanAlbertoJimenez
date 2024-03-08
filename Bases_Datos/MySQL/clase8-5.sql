DROP DATABASE IF EXISTS Cine;
CREATE DATABASE Cine CHARACTER SET utf8mb4;
USE Cine;
create table peliculas (
	codigo varchar(6) primary key,
    nombre varchar(150) not null,
    fecha date not null,
    precio double not null
);
create table clientes (
	dni varchar(6) primary key,
    nombre varchar(150) not null,
    email varchar(100) not null
);
create table descargas (
		codigo_pelicula varchar(6),
        dni_cliente varchar(6),
        mes_descarga int not null,
        id_descarga int primary key auto_increment,
        foreign key (codigo_pelicula) references peliculas(codigo),
        foreign key (dni_cliente) references clientes(dni)
);
