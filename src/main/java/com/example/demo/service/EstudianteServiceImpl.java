package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@ Autowired
	private IEstudianteRepository estudianteRepository;
	
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardarEstu(Estudiante estudiante) {
		this.estudianteRepository.insertarEstu(estudiante);
		
	}

}
