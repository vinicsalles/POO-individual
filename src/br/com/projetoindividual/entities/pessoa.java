package br.com.projetoindividual.entities;

public class pessoa {
	private String nome;
	private int cpf;
	private double nascimento;

	public pessoa() {
		super();
	}

	public pessoa(String nome, int cpf, double nascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getNascimento() {
		return nascimento;
	}

	public void setNascimento(double nascimento) {
		this.nascimento = nascimento;
	}
}

