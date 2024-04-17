package br.com.poo.projetoindividual.services;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.poo.projetoindividual.util.Util;

public class MenuService {
	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);

	public static void menu() throws IOException, InterruptedException {
		Util.customizer();
		logger.log(Level.INFO, "\n\n ------------------Gerador de Relatórios:------------------\n\n" + "\t\t[1] Relatórios Impressos: \n" + "\t\t[2] Relatórios Console\n"
				+ "\t\t[0] Sair\n" + "\n\n----------------------------------------------------------- " + "\n\n\t\tDigite uma opção:");
		try {
			int opcao = sc.nextInt();

			switch (opcao) {
			

			case 1:
				Thread.sleep(1000);
				SubMenuService.submenuTXT();
				break;

			case 2:
				Thread.sleep(1000);
				SubMenuService.submenuConsole();
				break;

			case 0:
				Thread.sleep(1000);
				Util.customizer();
				logger.log(Level.INFO, () -> "Obrigado Volte Sempre");
				break;
		
			default:
				Util.customizer();
				logger.log(Level.INFO, () -> "Opção Inválida");
				MenuService.menu();
				break;
			}
		}catch(InputMismatchException e) {
			Util.customizer();
			logger.log(Level.INFO, () -> "Opção Inválida");
			sc.nextLine();
			Thread.sleep(1000);
			MenuService.menu();
		}
			
		}
	
}
