package br.com.poo.projetoindividual.entities;

public class Pessoa {
	private Integer id;
	private String nome;
	private Integer cpf;
	private Double nascimento;
	private Integer fkEnd;
	
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

