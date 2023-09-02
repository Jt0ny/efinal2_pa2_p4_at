package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "materia")
public class Materia {
	

	@GeneratedValue(generator ="seq_materia",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_materia",sequenceName = "seq_materia",allocationSize = 1)
	@Id
	@Column(name = "mate_id")
	private Integer id;	
	
	@Column(name = "mate_nombre")
	private String nombre;
	
	@Column(name = "mate_codigo")
	private String codigo;
	
	@Column(name = "mate_num_creditos")
	private Integer numCreditos;
	
	@Column(name = "mate_cedula_profe")
	private String cedulaProfe;
	
	@ManyToOne
	@JoinColumn(name="mate_id_matr")
	private Matricula matricula;

	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", numCreditos=" + numCreditos
				+ ", cedulaProfe=" + cedulaProfe + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getNumCreditos() {
		return numCreditos;
	}

	public void setNumCreditos(Integer numCreditos) {
		this.numCreditos = numCreditos;
	}

	public String getCedulaProfe() {
		return cedulaProfe;
	}

	public void setCedulaProfe(String cedulaProfe) {
		this.cedulaProfe = cedulaProfe;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
	
	

}
