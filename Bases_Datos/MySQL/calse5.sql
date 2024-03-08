select * from cliente;
select * from pedido;
select * from comercial;

select distinct nombre, concat(apellido1," ", apellido2) as apellidos from cliente c join pedido p on p.id_cliente=c.id order by nombre;
select distinct * from cliente c join pedido p on p.id_cliente=c.id order by nombre;
select * from comercial c join pedido p on p.id_comercial=c.id order by nombre;
select distinct * from cliente c join pedido p on p.id_cliente=c.id join comercial co on p.id_comercial=co.id;
select * from cliente c join pedido p on p.id_cliente=c.id where year(p.fecha)=2017 and p.total between 300 and 1000;
select distinct c.nombre, concat(c.apellido1," ", c.apellido2) as apellidos from comercial c join pedido p on p.id_comercial=c.id join cliente cl on p.id_cliente=cl.id where cl.nombre="María";