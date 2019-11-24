package com.robson.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.robson.cursomc.domain.enums.TipoCliente;

@Entity
public class Banho  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String User;
//	private String email;
	private Double energia;
	private Double agua;
	private Double tempAmbiente;
	private Double tempInAgua;
	private Double tempOutAgua;
	private String inicio;
	private String fim;
	
	public Banho() {
		
	}
	
	public Banho(Integer id, String user, Double energia, Double agua, Double tempAmbiente, Double tempInAgua,
			Double tempOutAgua, String inicio, String 
			fim) {
		super();
		this.id = id;
		User = user;
		this.energia = energia;
		this.agua = agua;
		this.tempAmbiente = tempAmbiente;
		this.tempInAgua = tempInAgua;
		this.tempOutAgua = tempOutAgua;
		this.inicio = inicio;
		this.fim = fim;
	}

//	public List<Pedido> getPedidos() {
//		return pedidos;
//	}
//
//	public void setPedidos(List<Pedido> pedidos) {
//		this.pedidos = pedidos;
//	}
	
	

	public String getUser() {
		return User;
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

	public void setUser(String user) {
		User = user;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return User;
	}

	public void setNome(String nome) {
		this.User = nome;
	}

//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

//	public String getCpfOuCnpj() {
//		return cpfOuCnpj;
//	}
//
//	public void setCpfOuCnpj(String cpfOuCnpj) {
//		this.cpfOuCnpj = cpfOuCnpj;
//	}
//
//
//	public List<Endereco> getEnderecos() {
//		return enderecos;
//	}
//
//	public void setEnderecos(List<Endereco> enderecos) {
//		this.enderecos = enderecos;
//	}
//
//	public Set<String> getTelefones() {
//		return telefones;
//	}
//
//	public void setTelefones(Set<String> telefones) {
//		this.telefones = telefones;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banho other = (Banho) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
