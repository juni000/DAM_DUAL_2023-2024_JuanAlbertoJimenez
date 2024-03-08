use empleados;
alter table empleado add jefe boolean default false not null;
select * from departamento;
select * from empleado;
insert into departamento (nombre,presupuesto,gastos) values ("Marketing",200000,0);
set sql_safe_updates=0;
update empleado set id_departamento=8 where id_departamento=1;
update empleado set jefe=true where id=1;
set sql_safe_updates=1;
create table proyectos (
	id int unsigned auto_increment primary key,
    nombre varchar(120) not null,
    descripcion varchar(250),
    exterior boolean not null,
    fecha_inicio date not null,
    fecha_fin date
);
select * from proyectos;
create table trabajos(
	id_proyecto int unsigned,
    id_empleado int unsigned,
    rol varchar(50) not null,
	primary key (id_proyecto,id_empleado),
    foreign key (id_proyecto) references proyectos(id),
    foreign key (id_empleado) references empleado(id)
);
select * from trabajos;

insert into proyectos (nombre,descripcion,exterior,fecha_inicio,fecha_fin) values ("Edificio","Edificio Inteligente",true,20150522,20180321),
	("Casa","Casa para ufv",false,20120623,20150621);
insert into trabajos values (1,2,"Constructor"),(2,2,"CEO"),(2,5,"Constructor");
alter table departamento drop gastos;
select * from departamento;
alter table departamento rename departamentos;
select * from departamentos;
alter table departamentos modify nombre varchar(150);
select * from departamentos;
