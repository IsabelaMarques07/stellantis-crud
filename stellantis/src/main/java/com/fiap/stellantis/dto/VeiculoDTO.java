package com.fiap.stellantis.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class VeiculoDTO {

	private Long id;
	@NotBlank
	@NotNull
	private String placa;
	@NotBlank
	@NotNull
	private String modelo;
	@NotBlank
	@NotNull
	private String marca;
	private double quilometragem;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	
}
