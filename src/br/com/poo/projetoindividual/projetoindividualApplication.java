package br.com.poo.projetoindividual;

import java.io.IOException;

import br.com.poo.projetoindividual.io.RelatorioIO;
import br.com.poo.projetoindividual.services.PessoaService;



public class projetoindividualApplication {

	public static void main(String[] args) throws IOException {
		PessoaService pessoa = new PessoaService();
			RelatorioIO.leitor("banco");
			RelatorioIO.listarNomesPessoas(pessoa.listaNomesPessoas());
	}

}
