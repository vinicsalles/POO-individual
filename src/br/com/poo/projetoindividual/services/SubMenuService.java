package br.com.poo.projetoindividual.services;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.projetoindividual.controllers.CarroController;
import br.com.poo.projetoindividual.controllers.EnderecoController;
import br.com.poo.projetoindividual.controllers.PessoaController;
import br.com.poo.projetoindividual.util.Util;

public class SubMenuService {
	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);

	public static void submenuConsole() throws IOException {
		PessoaController pessoaController = new PessoaController();
		CarroController carroController = new CarroController();
		EnderecoController enderecoController = new EnderecoController();
		Util.customizer();

		logger.log(Level.INFO, () -> "\n\n ------------------Gerador de Relatórios:------------------\n\n" + "\t\t[1] Gerar lista de Pessoas\n" + "\t\t[2] Gerar lista de Carros\n"
				+ "\t\t[3] Gerar lista de Endereços\n"+ "\t\t[4] Gerar lista de Pessoas e Endereços\n" + "\t\t[0] Sair\n" + "\n\n----------------------------------------------------------- " + "\n\n\t\tDigite uma opção:");

		int opcao = sc.nextInt();

		switch (opcao) {

		case 1:
			logger.log(Level.INFO, () -> "Lista os nomes das Pessoas:\n ");
			pessoaController.listarNomePessoas();
			logger.log(Level.INFO, () -> "\n\n");
			submenuConsole();
			
			break;

		case 2:
			Util.customizer();
			logger.log(Level.INFO, () -> "Lista os Carros:\n ");
			carroController.listarCarros();
			logger.log(Level.INFO, () -> "\n\n");
			submenuConsole();

			break;

		case 3:

			Util.customizer();
			logger.log(Level.INFO, () -> "Lista de Endereços:\n ");
			enderecoController.listarEnderecos();
			logger.log(Level.INFO, () -> "\n\n");
			submenuConsole();
			break;
			
		case 4:
			Util.customizer();
			logger.log(Level.INFO, () -> "Lista os Pessoas e Endereços:\n ");
			pessoaController.listarPessoEnd();
			logger.log(Level.INFO, () -> "\n\n");
			submenuConsole();
		
			break;
			
		case 0:
			Util.customizer();
			MenuService.menu();
			break;

		default:
			Util.customizer();
			logger.log(Level.INFO, () -> "Opção Inválida");
			submenuConsole();
			break;
		}
	}
	public static void submenuTXT() throws IOException {
		PessoaController pessoaController = new PessoaController();
		CarroController carroController = new CarroController();
		EnderecoController enderecoController = new EnderecoController();
		Util.customizer();

		logger.log(Level.INFO, () -> "\n\n ------------------Gerador de Relatórios:------------------\n\n" + "\t\t[1] Gerar lista de Pessoas\n" + "\t\t[2] Gerar lista de Carros\n"
				+ "\t\t[3] Gerar lista de Endereços\n"+ "\t\t[4] Gerar lista de Pessoas e Endereços\n" + "\t\t[0] Sair\n" + "\n\n----------------------------------------------------------- " + "\n\n\t\tDigite uma opção:");

		int opcao = sc.nextInt();

		switch (opcao) {

		case 1:
			logger.log(Level.INFO, () -> "Lista TXT De nomes Criada com Sucesso!!:\n ");
			pessoaController.listarNomesPessoasTXT();
			logger.log(Level.INFO, () -> "\n\n");
			submenuTXT();
			
			break;

		case 2:
			Util.customizer();
			logger.log(Level.INFO, () -> "Lista os Carros:\n ");
			carroController.listarCarros();
			logger.log(Level.INFO, () -> "\n\n");
			submenuTXT();

			break;

		case 3:

			Util.customizer();
			logger.log(Level.INFO, () -> "Lista de Endereços:\n ");
			enderecoController.listarEnderecos();
			logger.log(Level.INFO, () -> "\n\n");
			submenuTXT();
			break;
			
		case 4:
			Util.customizer();
			logger.log(Level.INFO, () -> "Lista os Pessoas e Endereços:\n ");
			pessoaController.listarPessoEnd();
			logger.log(Level.INFO, () -> "\n\n");
			submenuTXT();
		
			break;
			
		case 0:
			Util.customizer();
			MenuService.menu();
			break;

		default:
			Util.customizer();
			logger.log(Level.INFO, () -> "Opção Inválida");
			submenuTXT();
			break;
		}
	}
}
