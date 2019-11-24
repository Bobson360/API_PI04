package com.robson.cursomc.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.robson.cursomc.domain.Banho;

public class BanhoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
//	@NotEmpty(message = "Preenchimento obrigatório")
//	@Length(min = 5, max = 80, message = "O tamanho deve ser entre 5 e 80 caracteres")
//	private String nome;
//	
//	@NotEmpty(message = "Preenchimento obrigatório")
//	@Email(message = "Email invalido")
//	private String email;
	
	private String user;
	private Double energia;
	private Double agua;
	private Double tempAmbiente;
	private Double tempInAgua;
	private Double tempOutAgua;
	private String inicio;
	private String fim;

	public BanhoDTO() {
		
	}

	public BanhoDTO(Banho obj) {
		id = obj.getId();
		user = obj.getUser();
		energia = obj.getEnergia();
		agua = obj.getAgua();
		tempAmbiente = obj.getTempAmbiente();
		tempInAgua = obj.getTempInAgua();
		tempOutAgua = obj.getTempOutAgua();
		inicio = obj.getInicio();
		fim = obj.getFim();
		
	}
	
	
	public String getInicio() {
		return inicio;
	}
	
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	
	public String getFim() {
		return fim;
	}
	
	public void setFim(String fim) {
		this.fim = fim;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Double getEnergia() {
		return energia;
	}

	public void setEnergia(Double energia) {
		this.energia = energia;
	}

	public Double getAgua() {
		return agua;
	}

	public void setAgua(Double agua) {
		this.agua = agua;
	}

	public Double getTempAmbiente() {
		return tempAmbiente;
	}

	public void setTempAmbiente(Double tempAmbiente) {
		this.tempAmbiente = tempAmbiente;
	}

	public Double getTempInAgua() {
		return tempInAgua;
	}

	public void setTempInAgua(Double tempInAgua) {
		this.tempInAgua = tempInAgua;
	}

	public Double getTempOutAgua() {
		return tempOutAgua;
	}

	public void setTempOutAgua(Double tempOutAgua) {
		this.tempOutAgua = tempOutAgua;
	}
	
	

//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	

}
