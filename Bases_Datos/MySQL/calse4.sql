select * from comercial;
select * from pedido;
select * from comercial c where not exists(select * from pedido p where p.id_comercial=c.id);
select * from comercial where id not in(select id_comercial from pedido);

select * from producto;
select * from fabricante;
select nombre, precio from producto where id_fabricante = ( select id from fabricante where nombre="Lenovo");
select nombre from fabricante where id = (select id_fabricante from producto order by precio desc limit 1) ;
select * from fabricante f where not exists(select * from producto where f.id=id_fabricante);

select * from asignatura;
select * from profesor;
select * from asignatura join profesor;
select * from asignatura join profesor on dni=profesor;

select distinct nombre, apellido1 from comercial c join pedido p on p.id_comercial=c.id;
select distinct nombre, apellido1, p.total from comercial c join pedido p on p.id_comercial=c.id where total>600;

select p.nombre, precio, f.nombre from producto p join fabricante f on f.id=p.id_fabricante where f.nombre="Lenovo";
select f.nombre from fabricante f join producto p on f.id=p.id_fabricante order by precio desc limit 1;
select f.nombre from fabricante f join producto p on f.id=p.id_fabricante where p.nombre like "Impresora%";

select * from asignatura;
select * from profesor;
select distinct p.nombre, apellido, email from profesor p join asignatura a on p.dni=a.profesor;
select a.nombre, curso, profesor from asignatura a join profesor p on p.dni=a.profesor  where ciclo = "DAM"  and p.email not like "%ufv.es%";

select * from pedido;
select distinct nombre, apellido1, apellido2, comisión from comercial c join pedido p on c.id=p.id_comercial where comisión<0.11 and comisión>0.05;