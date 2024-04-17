package br.com.poo.projetoindividual.services;

import java.io.IOException;
import java.util.InputMismatchException;
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

	public static void submenuConsole() throws IOException, InterruptedException {
		PessoaController pessoaController = new PessoaController();
		CarroController carroController = new CarroController();
		EnderecoController enderecoController = new EnderecoController();
		Util.customizer();

		logger.log(Level.INFO,
				() -> "\n\n ------------------Gerador de Relatórios:------------------\n\n"
						+ "\t\t[1] Gerar lista de Pessoas\n" + "\t\t[2] Gerar lista de Carros\n"
						+ "\t\t[3] Gerar lista de Endereços\n" + "\t\t[4] Gerar lista de Pessoas e Endereços\n"
						+ "\t\t[0] Voltar\n" + "\n\n----------------------------------------------------------- "
						+ "\n\n\t\tDigite uma opção:");
		try {
			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				Thread.sleep(1000);
				logger.log(Level.INFO, () -> "Lista os nomes das Pessoas:\n ");
				pessoaController.listarNomePessoas();
				logger.log(Level.INFO, () -> "\n\n");
				submenuConsole();

				break;

			case 2:
				Thread.sleep(1000);
				Util.customizer();
				logger.log(Level.INFO, () -> "Lista os Carros:\n ");
				carroController.listarCarros();
				logger.log(Level.INFO, () -> "\n\n");
				submenuConsole();

				break;

			case 3:
				Thread.sleep(1000);
				Util.customizer();
				logger.log(Level.INFO, () -> "Lista de Endereços:\n ");
				enderecoController.listarEnderecos();
				logger.log(Level.INFO, () -> "\n\n");
				submenuConsole();
				break;

			case 4:
				Thread.sleep(1000);
				Util.customizer();
				logger.log(Level.INFO, () -> "Lista os Pessoas e Endereços:\n ");
				pessoaController.listarPessoEnd();
				logger.log(Level.INFO, () -> "\n\n");
				submenuConsole();

				break;

			case 0:
				Thread.sleep(1000);
				Util.customizer();
				MenuService.menu();
				break;

			default:
				Util.customizer();
				logger.log(Level.INFO, () -> "Opção Inválida");
				submenuConsole();
				break;
			}
		} catch (InputMismatchException e) {
			Util.customizer();
			logger.log(Level.INFO, () -> "Opção Inválida");
			sc.nextLine();
			Thread.sleep(1000);
			SubMenuService.submenuConsole();
		}
	}

	public static void submenuTXT() throws IOException, InterruptedException {
		PessoaController pessoaController = new PessoaController();
		CarroController carroController = new CarroController();
		EnderecoController enderecoController = new EnderecoController();
		Util.customizer();

		logger.log(Level.INFO,
				() -> "\n\n ------------------Gerador de Relatórios:------------------\n\n"
						+ "\t\t[1] Gerar lista de Pessoas\n" + "\t\t[2] Gerar lista de Carros\n"
						+ "\t\t[3] Gerar lista de Endereços\n" + "\t\t[4] Gerar lista de Pessoas e Endereços\n"
						+ "\t\t[0] Voltar\n" + "\n\n----------------------------------------------------------- "
						+ "\n\n\t\tDigite uma opção:");

		try {
			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				Thread.sleep(1000);
				logger.log(Level.INFO, () -> "Lista TXT De nomes Criada com Sucesso!!:\n ");
				pessoaController.listarNomesPessoasTXT();
				logger.log(Level.INFO, () -> "\n\n");
				submenuTXT();

				break;

			case 2:
				Thread.sleep(1000);
				Util.customizer();
				logger.log(Level.INFO, () -> "Lista os Carros:\n ");
				carroController.listarCarrosTXT();
				logger.log(Level.INFO, () -> "\n\n");
				submenuTXT();

				break;

			case 3:
				Thread.sleep(1000);
				Util.customizer();
				logger.log(Level.INFO, () -> "Lista de Endereços:\n ");
				enderecoController.listarEnderecosTXT();
				logger.log(Level.INFO, () -> "\n\n");
				submenuTXT();
				break;

			case 4:
				Thread.sleep(1000);
				Util.customizer();
				logger.log(Level.INFO, () -> "Lista os Pessoas e Endereços:\n ");
				pessoaController.listarPessoEndTXT();
				logger.log(Level.INFO, () -> "\n\n");
				submenuTXT();

				break;

			case 0:
				Thread.sleep(1000);
				Util.customizer();
				MenuService.menu();
				break;

			default:
				Thread.sleep(1000);
				Util.customizer();
				logger.log(Level.INFO, () -> "Opção Inválida");
				submenuTXT();
				break;
			}
		} catch (InputMismatchException e) {
			Thread.sleep(1000);
			Util.customizer();
			logger.log(Level.INFO, () -> "Opção Inválida");
			sc.nextLine();
			Thread.sleep(1000);
			SubMenuService.submenuTXT();
		}
	}
}
