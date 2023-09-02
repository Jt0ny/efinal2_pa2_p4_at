package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {
	
	

	@GeneratedValue(generator ="seq_matricula",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_matricula",sequenceName = "seq_matricula",allocationSize = 1)
	@Id
	@Column(name = "matr_id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="matr_id_estu")
	private Estudiante estudiante;
	
	@OneToMany(mappedBy = "matricula")
	private List<Materia> materias;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	
}
