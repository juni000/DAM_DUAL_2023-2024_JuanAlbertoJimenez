use empleados;
select * from departamento;
delimiter  // 
create procedure dpto_gasto_mayor_presupuesto()
	begin
		select * from departamento where gastos > presupuesto;
    end //
delimiter ;
delimiter  // 
create procedure dpto_gasto_mayor_x(in x int)
	begin
		select * from departamento where gastos > x;
    end //
delimiter ;
call dpto_gasto_mayor_presupuesto();
call dpto_gasto_mayor_x(1000);






