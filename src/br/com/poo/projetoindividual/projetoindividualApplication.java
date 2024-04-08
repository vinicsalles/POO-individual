package br.com.poo.projetoindividual;

import br.com.poo.projetoindividual.controllers.CarroController;

public class projetoindividualApplication {

	public static void main(String[] args) {
		CarroController carroController = new CarroController();
		
		carroController.listarCarro();
		
	}

}
