package br.com.poo.projetoindividual;

import java.io.IOException;

import br.com.poo.projetoindividual.io.RelatorioIO;
import br.com.poo.projetoindividual.services.MenuService;

public class projetoindividualApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		RelatorioIO.leitor("banco");
		MenuService.menu();
	}

}
