package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	
	@GetMapping("/vistaMatricula")
	private String vistaEstu (Matricula matricula) {
		
		return "vistaInsertarMatri";
	}
	
	
}
