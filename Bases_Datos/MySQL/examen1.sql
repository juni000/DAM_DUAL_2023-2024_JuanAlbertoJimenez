select * from departamento;
select * from empleado;
select upper(concat(nombre," ", apellido1," ",apellido2)) as Nombre from empleado;
select nombre, gastos from departamento where presupuesto<gastos order by gastos desc;
select * from empleado where apellido2="Díaz" or apellido2="Moreno";
select * from empleado e join departamento d on (d.id=e.id_departamento) order by d.nombre,e.apellido1,e.apellido2,e.nombre;
select d.nombre from departamento d join empleado e on (d.id=e.id_departamento) where nif="38382980M";
select nombre, presupuesto from departamento order by presupuesto desc limit 1;
select * from empleado e join departamento d on (d.id=e.id_departamento);
select nombre from departamento where id=any(select id_departamento from empleado);
insert into empleado set
	id=14,
    nif="73616403G",
    nombre="Juan Alberto",
    apellido1="Jimenez",
    apellido2="Arenas",
    id_departamento="1";
set sql_safe_updates=0;
update departamento set presupuesto=presupuesto+10000 where presupuesto=0; 