package br.com.poo.projetoindividual.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.projetoindividual.entities.Carro;
import br.com.poo.projetoindividual.services.CarroService;
import br.com.poo.projetoindividual.util.Util;

public class CarroController {	
	CarroService carroService = new CarroService();
	static Logger logger = Util.setupLogger();

	public void listarCarros() throws IOException {
		List<Carro> carros = carroService.listarCarros();
		Util.customizer();
		logger.log(Level.INFO, carros + "\n\nListar gerada com Sucesso!!");
	}
	
	public void listarCarrosTXT() throws IOException{
		carroService.listarCarrosTXT();
	}
}
