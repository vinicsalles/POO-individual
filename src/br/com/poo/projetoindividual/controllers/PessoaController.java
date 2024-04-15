package br.com.poo.projetoindividual.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.projetoindividual.entities.Endereco;
import br.com.poo.projetoindividual.entities.Pessoa;
import br.com.poo.projetoindividual.services.EnderecoService;
import br.com.poo.projetoindividual.services.PessoaService;
import br.com.poo.projetoindividual.util.Util;

public class PessoaController {
	
	PessoaService pessoaService = new PessoaService();
	EnderecoService enderecoService = new EnderecoService();
	
	static Logger logger = Util.setupLogger();

	
	public void listarNomePessoas() throws IOException{
		List<Pessoa> pessoas = pessoaService.listaNomesPessoas();
		Util.customizer();
		logger.log(Level.INFO, pessoas + "\n\nListar gerada com Sucesso!!");
	}
	
	public void listarNomesPessoasTXT() throws IOException {
		pessoaService.listaNomesPessoasTXT();
	}
	
	public void listarPessoEnd() throws IOException{
		List<Pessoa> pessoas = pessoaService.listaNomesPessoas();
		List<Endereco> enderecos = enderecoService.listarEnd();
		pessoaService.listarPessoaEnd();
		Util.customizer();
		logger.log(Level.INFO, pessoas + "\t");;
		logger.log(Level.INFO, enderecos  +"\n\nListar gerada com Sucesso!!");;
	}
}
