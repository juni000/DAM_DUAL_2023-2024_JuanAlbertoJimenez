use centroestudios;
select * from asignatura;
delimiter //
create procedure profesores_impartiendo(out cantidad int, out sumaH int)
	begin
     select distinct count(a.profesor), sum(horas) into cantidad, sumaH from asignatura a join profesor p where a.profesor=p.dni;
    end//
delimiter ;
call profesores_impartiendo(@cantidad,@sumaH);
select @cantidad,@sumaH;