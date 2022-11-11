package com.fiap.stellantis.dto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class LocalizacaoDTO {

	private Long id; 
	@NotBlank
	@NotNull
	private String estado;
	@NotBlank
	@NotNull
	private String cidade;
	@NotBlank
	@NotNull
	private String distrito;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	
}
