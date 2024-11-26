package com.coderhouse.dtos;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Modelo de Inscripcion de Alumnos DTO", title = "Inscripciones DTO")
public class InscripcioDTO {

	@Schema(description = "Alumno ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private Long alumnoId;
	
	@Schema(description = "Listado de ID´s de Cursos", requiredMode = Schema.RequiredMode.REQUIRED, example = "['1', '2', '3']")
	private List<Long> cursoIds;
	
}
