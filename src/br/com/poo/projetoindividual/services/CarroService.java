package br.com.poo.projetoindividual.services;

import br.com.poo.projetoindividual.entities.Carro;

public class CarroService {
	Carro carro = new Carro();
	
	
	public void listarCarro() {
		carro.setNome("Supra");
		carro.setMarca("Toyota");
		carro.setModelo("Sedã");
		carro.setPlaca("KTR8732");
		carro.setAnoFabricacao(2020);
		carro.setValor(10.0000);
		
		System.out.println(
				carro.getNome()+ "\n"+
				carro.getMarca()+ "\n"+
				carro.getModelo()+ "\n"+
				carro.getPlaca()+ "\n"+
				carro.getAnoFabricacao()+ "\n"+
				String.format("%.3f", carro.getValor())
				);
	}
}
