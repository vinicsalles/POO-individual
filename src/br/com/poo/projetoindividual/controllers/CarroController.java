package br.com.poo.projetoindividual.controllers;

import br.com.poo.projetoindividual.services.CarroService;

public class CarroController {
	CarroService carroService = new CarroService();
	
	public void listarCarro() {
		carroService.listarCarro();
	}
}
