drop database if exists prueba; 
CREATE DATABASE prueba;
USE prueba;
CREATE TABLE agenda (
	id INT AUTO_INCREMENT,	
	nombre VARCHAR(20) NOT NULL,
	apellido VARCHAR(20),
	direccion VARCHAR(100), 
	email VARCHAR(100), 
	telefono VARCHAR(16) NOT NULL,
    PRIMARY KEY (ID));

delimiter //
create procedure crearContacto(in nombrex VARCHAR(20),in apellidox VARCHAR(20),in direccionx VARCHAR(100),in emailx VARCHAR(100),in telefonox VARCHAR(16))
	begin
		insert into agenda (nombre,apellido,direccion,email,telefono) values (nombrex,apellidox,direccionx,emailx,telefonox);
	end //
delimiter ;
call crearContacto("juan2","jimenez","olite","juan@gmail.com","123141");

select * from agenda;
