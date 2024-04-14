package br.com.poo.projetoindividual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.projetoindividual.entities.Pessoa;
import br.com.poo.projetoindividual.io.RelatorioIO;

public class PessoaService {
	
	
	public List<Pessoa> listaNomesPessoas() throws IOException{
		List<Pessoa> listaNomesPessoas = new ArrayList<>();
		for(Pessoa pessoa : Pessoa.getMapaPessoas().values()) {
			listaNomesPessoas.add(pessoa);
		}
		return listaNomesPessoas;
		
	}
	
	
	public List<Pessoa> listaNomesPessoasTXT() throws IOException{
		List<Pessoa> listaNomesPessoas = new ArrayList<>();
		RelatorioIO.listarNomesPessoas(listaNomesPessoas);
		return listaNomesPessoas;
		
	}
	
	public void listarPessoaEnd() throws IOException {
		EnderecoService  enderecoService = new EnderecoService();
		RelatorioIO.listarPessoaEnd(listaNomesPessoas(), enderecoService.listarEnd());
	}
	
	
}
