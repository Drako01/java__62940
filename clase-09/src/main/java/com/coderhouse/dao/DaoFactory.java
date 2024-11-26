package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.models.Alumno;
import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void persistirAlumno(Alumno alumno) {
		em.persist(alumno);
	}

	@Transactional
	public void persistirCurso(Curso curso) {
		em.persist(curso);
	}

	@Transactional
	public void persistirCategoria(Categoria categoria) {
		em.persist(categoria);
	}

	@Transactional
	public Curso getCursoById(Long cursoId) throws Exception {
		try {

			TypedQuery<Curso> query = em.createQuery("SELECT c FROM Curso c WHERE c.id = :id", Curso.class);
			return query.setParameter("id", cursoId).getSingleResult();
		} catch (Exception e) {
			throw new Exception("El Curso no existe.!");
		}
	}

	@Transactional
	public Categoria getCategoriaById(Long categoriaId) throws Exception {
		try {

			TypedQuery<Categoria> query = em.createQuery("SELECT ca FROM Categoria ca WHERE ca.id = :id",
					Categoria.class);
			return query.setParameter("id", categoriaId).getSingleResult();
		} catch (Exception e) {
			throw new Exception("El Categoria no existe.!");
		}
	}

	@Transactional
	public void asignarCategoriaACurso(Long cursoId, Long categoriaId) throws Exception {

		// Obtener el Curso por el Id
		Curso curso = getCursoById(cursoId);
		if (curso == null) {
			throw new Exception("El curso con id: " + cursoId + " no Existe.!");
		}

		// Obtener el Categoria por el Id
		Categoria categoria = getCategoriaById(categoriaId);
		if (categoria == null) {
			throw new Exception("El Categoria con id: " + categoriaId + " no Existe.!");
		}
		
		curso.setCategoria(categoria);
		
		//Persistir datos
		em.merge(curso);		

	}

}
