select * from departamento;
select * from grado;
select * from asignatura;
select * from asignatura;
select * from profesor;
select * from alumno_se_matricula_asignatura;
select * from curso_escolar;
select * from alumno;
select p.nombre as Nombre, concat(p.apellido1," ", p.apellido2) as Apellidos, p.nif as DNI, d.nombre as Departamento from profesor p join departamento d on p.id_departamento=d.id; 
select distinct p.nombre as Nombre, concat(p.apellido1," ", p.apellido2) as Apellidos, p.nif as DNI, concat(anyo_inicio, "-", anyo_fin) as Año from alumno p left join alumno_se_matricula_asignatura a on p.id=a.id_alumno left join curso_escolar c on c.id=a.id_curso_escolar order by p.nombre; 
select distinct asi.nombre as Asignatura, asi.creditos as Creditos, asi.tipo as Tipo, asi.curso as Curso, asi.cuatrimestre as Cuatrimestre, a.nombre as Nombre, concat(a.apellido1," ", a.apellido2) as Apellidos 
	from asignatura asi left join alumno_se_matricula_asignatura asma on asma.id_asignatura=asi.id left join alumno a on asma.id_alumno=a.id order by asi.nombre;
    
select distinct asi.nombre as Asignatura, asi.creditos as Creditos, asi.tipo as Tipo, asi.curso as Curso, asi.cuatrimestre as Cuatrimestre, a.nombre as Nombre, concat(a.apellido1," ", a.apellido2) as Apellidos 
	from asignatura asi left join profesor a on a.id=asi.id_profesor order by asi.nombre;
