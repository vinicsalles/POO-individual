package br.com.poo.projetoindividual.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.projetoindividual.entities.Endereco;
import br.com.poo.projetoindividual.services.EnderecoService;
import br.com.poo.projetoindividual.util.Util;

public class EnderecoController {
	EnderecoService enderecoService = new EnderecoService();
	static Logger logger = Util.setupLogger();
	public void listarEnderecos() throws IOException {
		List<Endereco> end = enderecoService.listarEnd();
		Util.customizer();
		logger.log(Level.INFO, end + "\n\nLista gerada com Sucesso!!");
	}
	
	public void listarEnderecosTXT() throws IOException {
		enderecoService.listarEndTXT();
	}
}
