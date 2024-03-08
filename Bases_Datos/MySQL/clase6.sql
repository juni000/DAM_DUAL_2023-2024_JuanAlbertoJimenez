create view Asignaturas1 as
select 
	a.nombre as Asignatura, 
	a.descripcion as Descripción, 
    a.horas as Horas, 
    a.ciclo as Ciclo, 
    a.curso as Curso,
    concat(p.nombre, " " , p.apellido) as Nombre
from asignatura a join profesor p on a.profesor=p.dni;

select * from centroestudios.asignaturas where ciclo="DAM";
select * from centroestudios.asignaturas1 where ciclo="DAM" order by curso;

use centroestudios;
insert into profesor values("73616403G","Carlos","Mateos","carlos.mateos@gmail.com","657172035",null);
select * from profesor;

insert into alumno set 
	nombre="Carlota", 
	dni="73616450R", 
    email="calota@gmail.com";
select * from alumno;

show variables like"sql_safe_updates";
set sql_safe_updates=0;

update asignatura set horas=horas+10 where ciclo="DAM";
select * from asignatura;
set sql_safe_updates=1;
update alumno set apellido="Gonzales" where nombre="Carlota";

/* en la base de datos ventas modificar la comision de los comerciales que hayan vendido productos por menos de 200 restando 0.2*/