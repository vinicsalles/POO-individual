package br.com.poo.projetoindividual.entities;

import java.util.HashMap;
import java.util.Map;

public class Carro {
	private Integer id;
	private String nome;
	private String modelo;
	private String marca;
	private String placa;
	private Integer anoFabricacao;
	private Double valor;

	static Map<Integer, Carro> mapaCarros = new HashMap<>();

	public Carro() {
		super();

	}

	public Carro(int id, String nome, String modelo, String marca, String placa, int anoFabricacao, Double valor) {
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double d) {
		this.valor = d;
	}

	public static Map<Integer, Carro> getMapaCarros() {
		return mapaCarros;
	}

	public static void setMapaCarros(Map<Integer, Carro> mapaCarros) {
		Carro.mapaCarros = mapaCarros;
	}

	@Override
	public String toString() {
		return "Carro: Nome:  " + nome + ", Placa: " + placa + ", Ano: " + anoFabricacao + ", Preço: " + valor + "\n";
	}

}
