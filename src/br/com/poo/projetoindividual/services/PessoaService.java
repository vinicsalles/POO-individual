package br.com.poo.projetoindividual.services;

import java.util.ArrayList;
import java.util.List;

import br.com.poo.projetoindividual.entities.Pessoa;

public class PessoaService {
	
	
	public List<String> listaNomesPessoas(){
		//Croa uma instância de lista vazia do tipo String
		List<String> listaNomesPessoas = new ArrayList<>();
		//Cria um foreach para percorrer o mapa de Pessoas
		for(Pessoa pessoa : Pessoa.getMapaPessoas().values()) {
			//Adiciona o nome do pessoa na lista ListaNomePessoas
			listaNomesPessoas.add(pessoa.getNome());
			
		}
		return listaNomesPessoas;
	}
	
	
}
