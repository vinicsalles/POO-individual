package br.com.projetoindividual.entities;

public class Pessoa {
	private String nome;
	private int cpf;
	private double nascimento;
	private int fkEnd;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, int cpf, double nascimento, int fkEnd) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.fkEnd = fkEnd;
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

	public int getFkEnd() {
		return fkEnd;
	}

	public void setFkEnd(int fkEnd) {
		this.fkEnd = fkEnd;
	}
	
}

