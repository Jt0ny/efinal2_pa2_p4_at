package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY )
	public void insertarEstu(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Estudiante buscarPorCedula(String cedula) {
		
		 TypedQuery<Estudiante> myQuery =this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.cedula=:datoCedula",Estudiante.class);
		 myQuery.setParameter("datoCedula",  cedula);
		 
		return myQuery.getSingleResult();
	}
	
	

}
