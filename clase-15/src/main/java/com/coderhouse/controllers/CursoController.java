package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.dtos.AsignacionCategoriaCursoDTO;
import com.coderhouse.models.Curso;
import com.coderhouse.services.CursoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/cursos")
@Tag(name = "Gestion de Cursos", description = "Endpoints para gestionar Cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@Operation(summary = "Obtener Lista de Cursos")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de Cursos obtenida Correctamente", 
					content = {
					@Content(mediaType = "application/json", 
							schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "404", description = "Error al intentar Obtener a los Cursos", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) })
	@GetMapping
	public ResponseEntity<List<Curso>> getAllCursos() {
		try {
			List<Curso> cursos = cursoService.getAllCursos();
			return ResponseEntity.ok(cursos);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); // 404
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500
		}
	}

	@Operation(summary = "Obtener un Curso por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Curso obtenido Correctamente", content = {
					@Content(mediaType = "application/json", 
							schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "404", description = "Error al intentar Obtener el Curso", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) })
	@GetMapping("/{id}")
	public ResponseEntity<Curso> getCursoById(@PathVariable Long id) {
		try {
			Curso curso = cursoService.getCursoById(id);
			return ResponseEntity.ok(curso);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); // 404
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Creacion de un Curso")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Curso creado Correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "404", description = "Error al intentar obtener el Curso", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) })
	@PostMapping
	public ResponseEntity<Curso> createCurso(@RequestBody Curso curso) {
		try {
			Curso createdCurso = cursoService.createCurso(curso);
			return ResponseEntity.status(HttpStatus.CREATED).body(createdCurso);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Edicion o Modificacion de un Curso por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Curso editado Correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "404", description = "Error al intentar Obtener el Curso", 
			content = @Content),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) })
	@PutMapping("/{id}")
	public ResponseEntity<Curso> updateCurso(@PathVariable Long id, @RequestBody Curso cursoDetails) {
		try {
			Curso updatedCurso = cursoService.updateCurso(id, cursoDetails);
			return ResponseEntity.ok(updatedCurso);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Eliminacion de un Curso por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Curso eliminado Correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "404", description = "Error al intentar Obtener el Curso", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) })
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCurso(@PathVariable Long id) {
		try {
			cursoService.deleteCurso(id);
			return ResponseEntity.noContent().build();
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Asignación de Categoria a un Curso")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Categoria asignada correctamente", content = {
					@Content(mediaType = "application/json", 
							schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "404", description = "Error al intentar obtener el Curso o Categoria", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) })
	@PostMapping("/asignar-categoria")
	public ResponseEntity<Curso> asignarCategoriaACurso(@RequestBody(
						description = "Datos para asignar una categoría a un curso",
					            required = true, 
					            content = @Content(
					                mediaType = "application/json",
					                schema = @Schema(implementation = AsignacionCategoriaCursoDTO.class),
					                examples = @ExampleObject(
					                    name = "Ejemplo de Asignación",
					                    summary = "Datos de entrada para asignar categoría",
					                    value = "{ \"cursoId\": 1, \"categoriaId\": 1 }"
					                )
					            )) 
								AsignacionCategoriaCursoDTO dto) {
		try {

			Curso cursoActualizado = cursoService.asignarCategoriaACurso(dto.getCursoId(), dto.getCategoriaId());
			return ResponseEntity.ok(cursoActualizado);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
