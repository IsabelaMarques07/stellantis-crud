package com.fiap.stellantis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Ambiente")
public class Ambiente {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id; 
	@Column(nullable = false)
	private String data;
	@Column(nullable = false)
	private String qualidadeDoAr;
	@Column(nullable = false)
	private String cidade;
	@Column(nullable = false)
	private String temperatura;
	@Column(nullable = false)
	private String estado;
	@Column(nullable = false)
	private String distrito;
	
	public Ambiente() {

	}

	public Ambiente(Long id, String data, String qualidadeDoAr, String cidade, String temperatura, String estado,
			String distrito) {
		super();
		this.id = id;
		this.data = data;
		this.qualidadeDoAr = qualidadeDoAr;
		this.cidade = cidade;
		this.temperatura = temperatura;
		this.estado = estado;
		this.distrito = distrito;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getQualidadeDoAr() {
		return qualidadeDoAr;
	}

	public void setQualidadeDoAr(String qualidadeDoAr) {
		this.qualidadeDoAr = qualidadeDoAr;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	
	
	
	
	
	
}
