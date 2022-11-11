package com.fiap.stellantis.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class RegionalDTO {

	private Long id; 
	@NotBlank
	@NotNull
	private String data;
	@NotBlank
	@NotNull
	private Long idVeiculo;
	@NotBlank
	@NotNull
	private Long idLocalizacao;
	
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
	public Long getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(Long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public Long getIdLocalizacao() {
		return idLocalizacao;
	}
	public void setIdLocalizacao(Long idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}
	
	
	
}
