package br.com.projetoindividual;

import br.com.projetoindividual.controllers.CarroController;

public class projetoindividualApplication {

	public static void main(String[] args) {
		CarroController carroController = new CarroController();
		
		carroController.listarCarro();
		
	}

}
