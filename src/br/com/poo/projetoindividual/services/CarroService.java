package br.com.poo.projetoindividual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.projetoindividual.entities.Carro;
import br.com.poo.projetoindividual.io.RelatorioIO;

public class CarroService {
	
	public List<Carro> listarCarros() throws IOException {
		List<Carro> listaCarros = new ArrayList<>();
		for(Carro carro : Carro.getMapaCarros().values()) {
			listaCarros.add(carro);
		}
		RelatorioIO.listarNomesCarros(listaCarros);
		return listaCarros;
	}

	
}
