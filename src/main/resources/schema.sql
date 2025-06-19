CREATE TABLE alumno(
	id INT NOT NULL AUTO_INCREMENT,
	nombre varchar(255),
	apellido varchar(255),
	email varchar(255),
	tipo int,
	edad int,
	CONSTRAINT pk_alumno_1 PRIMARY KEY(id)
);


CREATE TABLE profesor(
	id INT NOT NULL AUTO_INCREMENT,
	nombre varchar(255),
	apellido varchar(255),
	telefono varchar(255),
	email varchar(255),
	CONSTRAINT pk_profesor_1 PRIMARY KEY(id)
);



CREATE TABLE materia(
	id INT NOT NULL AUTO_INCREMENT,
	nombre varchar(255),
	material varchar(255),
	area varchar(255),
	CONSTRAINT pk_profesor_1 PRIMARY KEY(id)
);



CREATE TABLE evaluacion(
	idAlumno INT NOT NULL,
	idMateria INT NOT NULL,
	cal1 decimal(5,2),
	cal2 decimal(5,2),
	cal3 decimal(5,2),
	CONSTRAINT fk_evaluacion_1 FOREIGN KEY(idAlumno) REFERENCES alumno(id),
	CONSTRAINT fk_evaluacion_2 FOREIGN KEY(idMateria) REFERENCES materia(id)
);

CREATE TABLE boleta(
	id int not null auto_increment,
	fecha datetime default CURRENT_TIMESTAMP,
	idAlumno int not null,
	promedio decimal(5,2),
	CONSTRAINT pk_boleta_1 PRIMARY KEY(id),
	CONSTRAINT fk_boleta_1 FOREIGN KEY(idAlumno) REFERENCES alumno(id)
);
