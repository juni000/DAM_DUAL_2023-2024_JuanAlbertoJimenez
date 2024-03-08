use jardineria;

select distinct nombre, gama, proveedor, estado, fecha_pedido
	from producto p 
	join detalle_pedido de on p.codigo_producto=de.codigo_producto 
    join pedido pe on pe.codigo_pedido=de.codigo_pedido
	where year(fecha_pedido)=2009 and estado="Pendiente"; 
select * from cliente;
select * from pedido;
select distinct nombre_cliente, telefono from cliente c join pedido p on c.codigo_cliente=p.codigo_cliente where estado="Pendiente" and upper(ciudad)=upper("Madrid");
use tienda;
select * from fabricante;
insert into fabricante
set nombre="LG";
insert into fabricante
set nombre="Apple";
insert into fabricante (nombre) values ("Ninja","Azucar");