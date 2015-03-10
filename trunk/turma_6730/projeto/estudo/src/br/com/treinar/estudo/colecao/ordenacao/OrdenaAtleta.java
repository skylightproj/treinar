package br.com.treinar.estudo.colecao.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.estudo.modelo.Atleta;

public class OrdenaAtleta {

	public static void main(String[] args) {
		List<Atleta> atletas = new ArrayList<Atleta>();
		
		Atleta a1 = new Atleta("Afonso Hamm (PP-RS)", 55, 2);
		Atleta a2 = new Atleta("Eduardo da Fonte (PP-PE)", 54, 1); 
		Atleta a3 = new Atleta("An�bal Gomes (PMDB-CE)", 83, 5);
		Atleta a4 = new Atleta("Dilceu Sperafico (PP-PR)", 39, 4);
		Atleta a5 = new Atleta("L�zaro Botelho (PP-TO)", 41, 3);
		
		atletas.add(a1);
		atletas.add(a2);
		atletas.add(a3);
		atletas.add(a4);
		atletas.add(a5);
		
		//Ordena��o padr�o: nome interface comparable
		Collections.sort(atletas);
		
		for (Atleta atleta : atletas) {
			System.out.println(atleta.nome + " - " + atleta.idade + " - " + atleta.velocidade);
		}
		
		CriterioOrdenacaoVelocidadeAtleta criterio = new CriterioOrdenacaoVelocidadeAtleta();
		
		//Ordena��o por velocidade: interface comparator
		Collections.sort(atletas, criterio);
		for (Atleta atleta : atletas) {
			System.out.println(atleta.nome + " - " + atleta.idade + " - " + atleta.velocidade);
		}
		
		Collections.sort(atletas, new Comparator<Atleta>() {
			
			public int compare(Atleta o1, Atleta o2) {
				return 0;
			}
		
		});
		
		
		
	}
	
}
