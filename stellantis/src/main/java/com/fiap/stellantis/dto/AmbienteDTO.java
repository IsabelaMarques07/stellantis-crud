package com.fiap.stellantis.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class AmbienteDTO {

	private Long id; 
	@NotBlank
	@NotNull
	private String data;
	@NotBlank
	@NotNull
	private String qualidadeDoAr;
	@NotBlank
	@NotNull
	private String cidade;
	@NotBlank
	@NotNull
	private String temperatura;
	@NotBlank
	@NotNull
	private String estado;
	@NotBlank
	@NotNull
	private String distrito;
	

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
