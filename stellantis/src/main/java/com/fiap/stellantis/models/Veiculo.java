package com.fiap.stellantis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Veiculo")
public class Veiculo {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id;
	@Column(nullable = false)
	private String placa;
	@Column(nullable = false)
	private String modelo;
	@Column(nullable = false)
	private String marca;
	private double quilometragem;
	
	public Veiculo() {
	}
	public Veiculo(Long id, String placa, String modelo, String marca, double quilometragem) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.quilometragem = quilometragem;
	}
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
