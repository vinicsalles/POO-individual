package br.com.poo.projetoindividual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.projetoindividual.util.Util;
import br.com.poo.projetoinvidual.enums.TipoRegistro;

public class RelatorioIO {
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	private static Logger logger = Util.setupLogger();

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			String[] dados = linha.split(";");
			if (dados[0].equalsIgnoreCase(TipoRegistro.PESSOA.name())) {
				Pessoa pessoa = new Pessoa(Integer.parseInt(dados[1]), Integer.parseInt(dados[2]), Integer.parseInt(dados[4]));
			}else if(dados[0].equalsIgnoreCase(TipoRegistro.CARRO.name())) {
				Carro carro = new Carro(Integer.parseInt(dados[1]),dados[2],dados[3], dados[4], dados[5],Integer.parseInt(dados[6]),Float.parseFloat(dados[7]));
			}
			else if(dados[0].equalsIgnoreCase(TipoRegistro.ENDERECO.name())) {
				Endereco endereco = new Endereco(Integer.parseInt(dados[1]),Double.parseDouble(dados[2]),Integer.parseInt(dados[3]),dados[4],dados[5],dados[6],dados[7]);
			}
			else {
				break;
			}
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		Scanner sc = new Scanner(System.in);
		Util.customizer();
		logger.log(Level.INFO, () -> "Escreva o nome do arquivo: ");
		String nome = sc.next();

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + path + EXTENSAO));
		String linha = "";

		logger.log(Level.INFO, () -> "Escreva algo: ");
		Scanner s = new Scanner(System.in);
		linha = s.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
		sc.close();
	}
}
