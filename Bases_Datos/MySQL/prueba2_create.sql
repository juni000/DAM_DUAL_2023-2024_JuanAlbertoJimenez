CREATE DATABASE Comunidad;

Use Comunidad;

CREATE TABLE Persona (
id int AUTO_INCREMENT,
nombre VARCHAR (30),
profesion varchar (20),
PRIMARY KEY (id));

INSERT INTO Persona SET nombre="Rosa",
profesion="Informática";

select * from Persona;

INSERT INTO Persona SET nombre="Pedro",
profesion="Veterinario";
