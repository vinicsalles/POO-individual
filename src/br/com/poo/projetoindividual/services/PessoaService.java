package br.com.poo.projetoindividual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.projetoindividual.entities.Endereco;
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
		List<Endereco> listarEnderecos = new ArrayList<>();
		List<Pessoa> listaNomesPessoas = new ArrayList<>();
		for(Pessoa pessoa : Pessoa.getMapaPessoas().values()) {
			listaNomesPessoas.add(pessoa);
			for(Endereco endereco: Endereco.getMapaEnderecos().values()) {
				listarEnderecos.add(endereco);
			}
		}
	}
	
	public void listarPessoaEndTXT() throws IOException {
		EnderecoService  enderecoService = new EnderecoService();
		RelatorioIO.listarPessoaEnd(listaNomesPessoasTXT(), enderecoService.listarEndTXT());
		
	}
}
