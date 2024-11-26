package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.coderhouse.models.Curso;
import com.coderhouse.repositories.CursoRepository;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

	
	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping
	public List<Curso> getAllCursos() {
		return cursoRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Curso> getCursoById(@PathVariable Long id) {
		if (cursoRepository.existsById(id)) {
			Curso curso = cursoRepository.findById(id).get();
			return ResponseEntity.ok(curso);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	public Curso createCurso(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
}
