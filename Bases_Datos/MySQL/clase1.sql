select * from asignatura where profesor is null;
select nombre, ciclo, curso from asignatura where curso = 1;
select nombre, horas from asignatura where horas between 100 and 200;
select nombre, horas, curso from asignatura where curso=1 and horas>=100 and horas<=200;
select nombre, horas, curso from asignatura where curso=1 and horas between 100 and 200;
select nombre, horas from asignatura where horas=120 or horas=140 or horas=160;
select nombre, horas from asignatura where horas in(120,140,160);
select nombre, email from alumno where email like "%@gmail%";
select nombre, codigo from asignatura where codigo like "______";
select nombre, year(fecha_nacimiento) as año, month(fecha_nacimiento) as mes, day(fecha_nacimiento) as dia from alumno where day(fecha_nacimiento)=8;
select nombre, fecha_nacimiento from alumno where day(fecha_nacimiento) > 15;
select nombre,fecha_nacimiento from alumno where month(fecha_nacimiento) = 4;
select nombre, apellido, fecha_nacimiento from alumno order by 2;
select nombre, apellido, fecha_nacimiento from alumno order by apellido;
select * from asignatura order by ciclo asc, curso asc;
select * from asignatura where curso=1 and ciclo="DAM";
select * from asignatura where codigo like "%LM";
select nombre, curso from asignatura where ciclo='DAM' order by curso asc, nombre asc;
select nombre, ciclo from asignatura where profesor!="63254157C" order by ciclo, curso;
select nombre, apellido from alumno order by fecha_nacimiento desc;
select * from alumno order by fecha_nacimiento desc limit 1;
select nombre, apellido from alumno order by fecha_nacimiento asc limit 2,5;