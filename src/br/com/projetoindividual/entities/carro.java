package br.com.projetoindividual.entities;

public class carro {
	private String nome;
	private String modelo;
	private String marca;
	private String placa;
	private int anoFabricacao;
	private float valor;

	public carro() {
		super();
	}

	public carro(String nome, String modelo, String marca, String placa, int anoFabricacao, float valor) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
