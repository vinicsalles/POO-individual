package br.com.poo.projetoindividual.entities;

public class Carro {
	private Integer id;
	private String nome;
	private String modelo;
	private String marca;
	private String placa;
	private Integer anoFabricacao;
	private Double valor;
	
	public Carro() {
		super();
		
	}
	
	public Carro(int id, String nome, String modelo, String marca, String placa, int anoFabricacao, double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
