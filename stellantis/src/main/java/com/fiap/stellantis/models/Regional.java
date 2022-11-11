package com.fiap.stellantis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Regional")
public class Regional {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id; 
	@Column(nullable = false)
	private String data;
	@Column(nullable = false)
	private Long idVeiculo;
	@Column(nullable = false)
	private Long idLocalizacao;
	
	
	
	public Regional() {

	}



	public Regional(Long id, String data, Long idVeiculo, Long idLocalizacao) {
		super();
		this.id = id;
		this.data = data;
		this.idVeiculo = idVeiculo;
		this.idLocalizacao = idLocalizacao;
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
