package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;

@SpringBootApplication
public class Clase08Application implements CommandLineRunner {

	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try {

			Curso curso1 = new Curso("Java");
			Curso curso2 = new Curso("HTML5");
			Curso curso3 = new Curso("CSS3");
			Curso curso4 = new Curso("JavaScript");

			Alumno alumno1 = new Alumno("Alejandro", " Di Stefano", 22333444, "L22333444");
			Alumno alumno2 = new Alumno("Martin", "Ferreyra", 33555222, "L33555222");
			Alumno alumno3 = new Alumno("Rodrigo", "Berger", 21333444, "L21333444");
			Alumno alumno4 = new Alumno("Maria Rocio", "Ahumada", 55333444, "L55333444");

			dao.persistirAlumno(alumno1);
			dao.persistirAlumno(alumno2);
			dao.persistirAlumno(alumno3);
			dao.persistirAlumno(alumno4);

			dao.persistirCurso(curso1);
			dao.persistirCurso(curso2);
			dao.persistirCurso(curso3);
			dao.persistirCurso(curso4);

		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}

}
