package br.com.poo.projetoindividual.entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Pessoa {
	private Integer id;
	private String nome;
	private Integer cpf;
	private LocalDate nascimento;
	private Integer fkEnd;
	
	static Map<Integer, Pessoa> mapaPessoas = new HashMap<>();

	
	public Pessoa() {
		super();
	}

	public Pessoa(Integer id, String nome, Integer cpf, LocalDate nascimento, Integer fkEnd) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.fkEnd = fkEnd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Integer getFkEnd() {
		return fkEnd;
	}

	public void setFkEnd(Integer fkEnd) {
		this.fkEnd = fkEnd;
	}
	

	public static Map<Integer, Pessoa> getMapaPessoas() {
		return mapaPessoas;
	}

	public static void setMapaPessoas(Map<Integer, Pessoa> mapaPessoas) {
		Pessoa.mapaPessoas = mapaPessoas;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + ", fkEnd="
				+ fkEnd + "]";
	}
	
}

