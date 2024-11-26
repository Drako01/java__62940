package com.coderhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhouse.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
