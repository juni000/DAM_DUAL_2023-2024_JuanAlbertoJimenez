alter table producto add tiempo_vida_util int default 5;
select * from producto;
create table Ubicacion (
	id int auto_increment primary key,
    pasillo int unsigned not null default 0,
    seccion varchar(3) not null,
    recomendaciones varchar(255)
);
insert into Ubicacion (pasillo,seccion,recomendaciones)  values (1,"A1",""),(1,"B23","Sólo productos frágilaes"),(2,"A15",""),(2,"A16",""),(3,"B1","Solo cajas de 30x30x25");
select * from ubicacion;
alter table producto add pasillo int;
alter table producto add constraint pasillo foreign key (pasillo) references Ubicacion(id);