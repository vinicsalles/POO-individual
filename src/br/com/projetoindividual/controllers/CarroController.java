package br.com.projetoindividual.controllers;

import br.com.projetoindividual.services.CarroService;

public class CarroController {
	CarroService carroService = new CarroService();
	
	public void listarCarro() {
		carroService.listarCarro();
	}
}
