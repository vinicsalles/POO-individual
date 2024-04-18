package br.com.poo.projetoindividual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.projetoindividual.entities.Endereco;
import br.com.poo.projetoindividual.io.RelatorioIO;

public class EnderecoService {
	public List<Endereco> listarEnd() throws IOException {
		List<Endereco> listaEnderecos = new ArrayList<>();
		for (Endereco end : Endereco.getMapaEnderecos().values()) {
			listaEnderecos.add(end);
		}
		return listaEnderecos;
	}

	public List<Endereco> listarEndTXT() throws IOException {
		List<Endereco> listaEnderecos = new ArrayList<>();
		RelatorioIO.listarEnderecos(listaEnderecos);
		return listaEnderecos;

	}
}
