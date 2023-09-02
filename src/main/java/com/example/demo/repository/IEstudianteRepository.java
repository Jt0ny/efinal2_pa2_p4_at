package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {
	
	public void insertarEstu (Estudiante estudiante) ;
	
	public Estudiante buscarPorCedula (String cedula);
	

}
