package br.com.poo.projetoindividual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.projetoindividual.entities.Carro;
import br.com.poo.projetoindividual.entities.Endereco;
import br.com.poo.projetoindividual.entities.Pessoa;
import br.com.poo.projetoindividual.util.Util;
import br.com.poo.projetoinvidual.enums.TipoRegistro;

public class RelatorioIO {
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	private static Logger logger = Util.setupLogger();
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	static DateTimeFormatter dtfBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");
				if (dados[0].equalsIgnoreCase(TipoRegistro.PESSOA.name())) {
					Pessoa pessoa = new Pessoa(Integer.parseInt(dados[1]), dados[2], Integer.parseInt(dados[3]),
							LocalDate.parse(dados[4], dtf), Integer.parseInt(dados[5]));
					Pessoa.getMapaPessoas().put(Integer.parseInt(dados[1]), pessoa);
					logger.log(Level.INFO, pessoa::toString);
				} else if (dados[0].equalsIgnoreCase(TipoRegistro.CARRO.name())) {
					Carro carro = new Carro(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], dados[5],
							Integer.parseInt(dados[6]), Double.parseDouble(dados[7]));
					Carro.getMapaCarros().put(Integer.parseInt(dados[1]), carro);
					logger.log(Level.INFO, carro::toString);
				} else if (dados[0].equalsIgnoreCase(TipoRegistro.ENDERECO.name())) {
					Endereco endereco = new Endereco(Integer.parseInt(dados[1]), dados[2], Double.parseDouble(dados[3]),
							Integer.parseInt(dados[4]), dados[5], dados[6], dados[7], dados[8]);
					Endereco.getMapaEnderecos().put(Integer.parseInt(dados[1]), endereco);
					logger.log(Level.INFO, endereco::toString);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

	public static void listarNomesPessoas(List<String> nomesPessoas) throws IOException {
		String nome = "lista-nomes-pessoas";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));
		buffWrite.append("\n--------------RELATÓRIO : LISTA NOMES PESSOAS---------------");
		if (!nomesPessoas.isEmpty()) {
			for (String nomePessoa : nomesPessoas) {
				buffWrite.append(nomePessoa + "\n");
			}
		}
		LocalDateTime ldt = LocalDateTime.now();
		buffWrite.append("Data da Requisição: " + dtfBr.format(ldt));
		buffWrite.append("--------------FIM DA LISTA DE NOMES PESSOAS--------------- ");
		buffWrite.close();
	}
}
