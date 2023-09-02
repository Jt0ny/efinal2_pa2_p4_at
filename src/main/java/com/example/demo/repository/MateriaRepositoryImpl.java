package com.example.demo.repository;

import org.springframework.stereotype.Repository;


import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MateriaRepositoryImpl implements IMateriaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY )
	public void insertarMate(Materia materia) {
		this.entityManager.persist(materia);
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Materia buscarPorCodigo(String codigo) {
		
		TypedQuery<Materia> myQuery =this.entityManager.createQuery("SELECT m FROM Materia m WHERE m.codigo=:datoCodigo",Materia.class);
		 myQuery.setParameter("datoCodigo",  codigo);
		 
		return myQuery.getSingleResult();
	}

}
