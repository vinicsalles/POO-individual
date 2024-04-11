package br.com.poo.projetoindividual.entities;

import java.util.HashMap;
import java.util.Map;

public class Endereco {
	private Integer id;
	private String rua;
	private Double cep;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	
	static Map<Integer, Endereco> mapaEnderecos = new HashMap<>();

	
	public Endereco() {
		super();
		
	}

	public Endereco(int id, String rua, double cep, int numero, String complemento, String bairro, String cidade,
			String estado) {
		super();
		this.id = id;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public double getCep() {
		return cep;
	}


	public void setCep(double cep) {
		this.cep = cep;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public static Map<Integer, Endereco> getMapaEnderecos() {
		return mapaEnderecos;
	}

	public static void setMapaEnderecos(Map<Integer, Endereco> mapaEnderecos) {
		Endereco.mapaEnderecos = mapaEnderecos;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", cep=" + cep + ", numero=" + numero + ", complemento="
				+ complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
	
	
	
	
}
