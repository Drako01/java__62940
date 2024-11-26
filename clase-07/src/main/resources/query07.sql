-- https://dev.mysql.com/downloads/file/?id=536356

CREATE DATABASE 
IF NOT 
EXISTS 
coderhouse; -- Creacion de la Base de Datos coderhouse

USE coderhouse;

CREATE TABLE alumnos
( 
	nombre VARCHAR(20),
	apellido VARCHAR(20),
    dni INT(8) UNIQUE
);

SELECT * FROM alumnos;

INSERT INTO alumnos VALUES
("Alejandro", "Di Stefano", 21225555),
("Marcel", "Carabajal", 22555666),
("Gabriel", "Carissimo", 33666555),
("Gary", "Cruz", 8855522);

ALTER TABLE alumnos ADD COLUMN id INTEGER auto_increment NOT NULL PRIMARY KEY;
ALTER TABLE alumnos ADD COLUMN email VARCHAR(40) NULL;

UPDATE alumnos SET email = "alejandro@mail.com" WHERE id = 1;
UPDATE alumnos SET email = "marcelo@mail.com" WHERE id = 2;
UPDATE alumnos SET email = "gabriel@mail.com" WHERE id = 3;
UPDATE alumnos SET email = "gary@mail.com" WHERE id = 4;


DROP TABLE IF EXISTS alumnos;

CREATE TABLE usuarios (
   idx INT PRIMARY KEY AUTO_INCREMENT,
   usuario VARCHAR(20),
   nombre VARCHAR(20),
   sexo VARCHAR(1),
   nivel TINYINT,
   email VARCHAR(50),
   telefono VARCHAR(20),
   marca VARCHAR(20),
   compania VARCHAR(20),
   saldo FLOAT,
   activo BOOLEAN
);

INSERT INTO usuarios 
VALUES 
('1','BRE2271','BRENDA','M','2','brenda@live.com','655-330-5736','SAMSUNG','IUSACELL','100','1'),
('2','OSC4677','OSCAR','H','3','oscar@gmail.com','655-143-4181','LG','TELCEL','0','1'),
('3','JOS7086','JOSE','H','3','francisco@gmail.com','655-143-3922','NOKIA','MOVISTAR','150','1'),
('4','LUI6115','LUIS','H','0','enrique@outlook.com','655-137-1279','SAMSUNG','TELCEL','50','1'),
('5','LUI7072','LUIS','H','1','luis@hotmail.com','655-100-8260','NOKIA','IUSACELL','50','0'),
('6','DAN2832','DANIEL','H','0','daniel@outlook.com','655-145-2586','SONY','UNEFON','100','1'),
('7','JAQ5351','JAQUELINE','M','0','jaqueline@outlook.com','655-330-5514','BLACKBERRY','AXEL','0','1'),
('8','ROM6520','ROMAN','H','2','roman@gmail.com','655-330-3263','LG','IUSACELL','50','1'),
('9','BLA9739','BLAS','H','0','blas@hotmail.com','655-330-3871','LG','UNEFON','100','1'),
('10','JES4752','JESSICA','M','1','jessica@hotmail.com','655-143-6861','SAMSUNG','TELCEL','500','1'),
('11','DIA6570','DIANA','M','1','diana@live.com','655-143-3952','SONY','UNEFON','100','0'),
('12','RIC8283','RICARDO','H','2','ricardo@hotmail.com','655-145-6049','MOTOROLA','IUSACELL','150','1'),
('13','VAL6882','VALENTINA','M','0','valentina@live.com','655-137-4253','BLACKBERRY','AT&T','50','0'),
('14','BRE8106','BRENDA','M','3','brenda2@gmail.com','655-100-1351','MOTOROLA','NEXTEL','150','1'),
('15','LUC4982','LUCIA','M','3','lucia@gmail.com','655-145-4992','BLACKBERRY','IUSACELL','0','1'),
('16','JUA2337','JUAN','H','0','juan@outlook.com','655-100-6517','SAMSUNG','AXEL','0','0'),
('17','ELP2984','ELPIDIO','H','1','elpidio@outlook.com','655-145-9938','MOTOROLA','MOVISTAR','500','1'),
('18','JES9640','JESSICA','M','3','jessica2@live.com','655-330-5143','SONY','IUSACELL','200','1'),
('19','LET4015','LETICIA','M','2','leticia@yahoo.com','655-143-4019','BLACKBERRY','UNEFON','100','1'),
('20','LUI1076','LUIS','H','3','luis2@live.com','655-100-5085','SONY','UNEFON','150','1'),
('21','HUG5441','HUGO','H','2','hugo@live.com','655-137-3935','MOTOROLA','AT&T','500','1');


select * from usuarios;

/*
BLOQUE 1
1.	Listar los nombres de los usuarios
2.	Calcular el saldo máximo de los usuarios de sexo “Mujer”
3.	Listar nombre y teléfono de los usuarios con teléfono NOKIA, BLACKBERRY o SONY
4.	Contar los usuarios sin saldo o inactivos
5.	Listar el login de los usuarios con nivel 1, 2 o 3
6.	Listar los números de teléfono con saldo menor o igual a 300
7.	Calcular la suma de los saldos de los usuarios de la compañia telefónica NEXTEL
8.	Contar el número de usuarios por compañía telefónica
9.	Contar el número de usuarios por nivel
10.	Listar el login de los usuarios con nivel 2
11.	Mostrar el email de los usuarios que usan gmail
12.	Listar nombre y teléfono de los usuarios con teléfono LG, SAMSUNG o MOTOROLA
*/

select nombre from usuarios;
select nombre, usuario from usuarios;

select max(saldo), sexo from usuarios where sexo = 'M';
select nombre, telefono from usuarios where marca = 'NOKIA' or marca = 'BLACKBERRY' or marca = 'SONY';
select nombre, telefono, marca from usuarios where marca in('NOKIA', 'BLACKBERRY', 'SONY');

select nombre, usuario from usuarios order by nombre; -- Esto ordena Alfabeticamente en forma ascendente
select nombre, usuario from usuarios order by nombre desc; -- Esto ordena Alfabeticamente en forma descendente
select idx, nombre, usuario from usuarios order by idx desc;


select nombre, email from usuarios where lower(email) like '%@gmail.com%'; -- 11


-- Tabla Estudiantes
CREATE TABLE estudiantes (
    id_estudiante INT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50)
);

-- Tabla Cursos
CREATE TABLE cursos (
    id_curso INT PRIMARY KEY,
    nombre_curso VARCHAR(50),
    id_estudiante INT,
    FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id_estudiante)
);

CREATE TABLE pasaportes (
    id_pasaporte INT PRIMARY KEY,
    id_estudiante INT UNIQUE,
    fecha_expiracion DATE,
    FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id_estudiante)
);

-- Crear tabla Profesores
CREATE TABLE profesores (
    id_profesor INT PRIMARY KEY,
    nombre_profesor VARCHAR(50),
    curso_asignado INT,
    FOREIGN KEY (curso_asignado) REFERENCES cursos(id_curso)
);

INSERT INTO Estudiantes (id_estudiante, nombre, apellido) VALUES 
(1, 'Juan', 'Pérez'),
(2, 'María', 'Gómez'),
(3, 'Carlos', 'López'),
(4, 'Ana', 'Martínez'),
(5, 'Luis', 'Fernández');

INSERT INTO Cursos (id_curso, nombre_curso, id_estudiante) VALUES 
(101, 'Matemáticas', 1),
(102, 'Ciencias', 2),
(103, 'Historia', 3),
(104, 'Matemáticas', 4),
(105, 'Inglés', 5);

INSERT INTO Pasaportes (id_pasaporte, id_estudiante, fecha_expiracion) VALUES 
(1001, 1, '2025-08-30'),
(1002, 2, '2025-08-30'),
(1003, 3, '2027-05-15'),
(1004, 4, '2026-12-01'),
(1005, 5, '2024-11-20');

-- Datos para la tabla Profesores
INSERT INTO Profesores (id_profesor, nombre_profesor, curso_asignado) VALUES 
(1, 'Laura García', 101),
(2, 'Pedro Ramírez', 102),
(3, 'Lucía Díaz', 104); 

/*
INNER JOIN
Combina filas de dos tablas solo si existe una coincidencia en ambas.

Este ejemplo muestra los estudiantes que están inscritos en algún curso. Si un estudiante no está inscrito en ningún curso, no aparecerá en el resultado.

Qué hace: Muestra solo las filas donde hay coincidencias en ambas tablas.
Resultado: Si un estudiante no está inscrito en ningún curso, o si un curso no tiene estudiantes, no aparecerán en el resultado.
Ejemplo: Solo se listarán los estudiantes que están efectivamente inscritos en algún curso.
*/

select estudiantes.nombre, cursos.nombre_curso
FROM estudiantes
inner join cursos on estudiantes.id_estudiante = cursos.id_estudiante;


/*
LEFT JOIN (o LEFT OUTER JOIN)
Incluye todas las filas de la tabla izquierda (en este caso, Estudiantes), aunque no haya coincidencias en la tabla derecha (Cursos).

Este ejemplo muestra todos los estudiantes, incluso aquellos que no están inscritos en ningún curso. Si un estudiante no está en un curso, el valor de nombre_curso será NULL.

Qué hace: Muestra todas las filas de la tabla de la izquierda (Estudiantes), incluso si no tienen coincidencias en la tabla derecha (Cursos).
Resultado: Todos los estudiantes aparecerán en el resultado, y si un estudiante no está inscrito en ningún curso, el valor de nombre_curso será NULL.
Ejemplo: Incluye todos los estudiantes, independientemente de si están o no en un curso.
*/

select estudiantes.nombre, cursos.nombre_curso
from estudiantes
left join cursos on estudiantes.id_estudiante = cursos.id_estudiante;


/*
FULL JOIN (o FULL OUTER JOIN)
Combina todas las filas de ambas tablas y muestra las coincidencias, así como las filas no coincidentes de cada lado.

Muestra todos los estudiantes y todos los cursos, combinándolos cuando hay coincidencias y mostrando NULL cuando no las hay.

Qué hace: Muestra todas las filas de ambas tablas, tanto si hay coincidencias como si no las hay.
Resultado: Incluye tanto los estudiantes que no están inscritos en ningún curso como los cursos que no tienen estudiantes inscritos, mostrando NULL donde no hay coincidencias.
Ejemplo: Lista todos los estudiantes y todos los cursos, combinando las coincidencias y mostrando NULL cuando no las hay.
*/


SELECT estudiantes.nombre, cursos.nombre_curso
FROM estudiantes
LEFT JOIN cursos
ON estudiantes.id_estudiante = cursos.id_estudiante
UNION
SELECT estudiantes.nombre, cursos.nombre_curso
FROM estudiantes
RIGHT JOIN cursos
ON estudiantes.id_estudiante = cursos.id_estudiante;

