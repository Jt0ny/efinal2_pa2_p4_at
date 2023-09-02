package com.example.demo.repository;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {

	public void insertarMate (Materia materia) ;
	
	public Materia buscarPorCodigo (String codigo);
	

}
