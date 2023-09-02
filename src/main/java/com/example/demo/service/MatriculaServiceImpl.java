package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired 
	private IMateriaRepository iMateriaRepository;
	
	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardarMatri(Matricula matricula) {
	
		Estudiante estu1= this.estudianteRepository.buscarPorCedula(matricula.getEstudiante().getCedula());
		estu1.setMatricula(matricula);
		
		Materia m1=this.iMateriaRepository.buscarPorCodigo(matricula.getMaterias().get(0).getCodigo());
		Materia m2=this.iMateriaRepository.buscarPorCodigo(matricula.getMaterias().get(1).getCodigo());
		Materia m3=this.iMateriaRepository.buscarPorCodigo(matricula.getMaterias().get(2).getCodigo());
		Materia m4=this.iMateriaRepository.buscarPorCodigo(matricula.getMaterias().get(3).getCodigo());
		List<Materia>listaM = new ArrayList<>();
		listaM.add(m1);
		listaM.add(m2);
		listaM.add(m3);
		listaM.add(m4);
		matricula.setMaterias(listaM);
		this.iMatriculaRepository.insertarMatri(matricula);
		
		
	}
	
	
	
}
