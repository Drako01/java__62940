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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.coderhouse.models.Categoria;
import com.coderhouse.services.CategoriaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/categorias")
@Tag(name = "Gestion de Categorias", description = "Endpoints para gestionar a las Categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@Operation(summary = "Obtener Lista de Categorias")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de Categorias obtenida Correctamente", 
					content = {
					@Content(mediaType = "application/json", 
							schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "404", description = "Error al intentar Obtener a las Categorias", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) 
			})
	@GetMapping
	public ResponseEntity<List<Categoria>> getAllCategorias() {
		try {
			List<Categoria> categorias = categoriaService.findAll();
			return ResponseEntity.ok(categorias);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); // 404
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Obtener una Categoria por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Categoria obtenida Correctamente", 
					content = {
					@Content(mediaType = "application/json", 
							schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "404", description = "Error al intentar Obtener la Categoria", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) 
			})
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getCategoriaById(@PathVariable long id) {
		try {
			Categoria categoria = categoriaService.getCategoriaById(id);
			return ResponseEntity.ok(categoria);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Crear una Categoria nueva")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Categoria creada Correctamente", 
					content = {
					@Content(mediaType = "application/json", 
							schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "400", description = "Error al intentar crear la Categoria", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) 
			})	
	@PostMapping
	public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria) {
		try {
			Categoria createdCategoria = categoriaService.createCategoria(categoria);
			return ResponseEntity.status(HttpStatus.CREATED).body(createdCategoria);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Editar una Categoria por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Categoria editada Correctamente", 
					content = {
					@Content(mediaType = "application/json", 
							schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "404", description = "Error al intentar editar la Categoria, o la Categoria no Existe", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) 
			})	
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> updateCategoria(@PathVariable Long id, @RequestBody Categoria categoriaDetails) {
		try {
			Categoria updatedCategoria = categoriaService.updateCategoria(id, categoriaDetails);
			return ResponseEntity.ok(updatedCategoria);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Eliminar una Categoria por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Categoria eliminada Correctamente", 
					content = {
					@Content(mediaType = "application/json", 
							schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "404", description = "Error al intentar editar la Categoria, o la Categoria no Existe", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))) 
			})
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCategoria(@PathVariable Long id) {
		try {
			if (categoriaService.existsById(id)) {
				categoriaService.deleteById(id);
				return ResponseEntity.noContent().build();
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
}
