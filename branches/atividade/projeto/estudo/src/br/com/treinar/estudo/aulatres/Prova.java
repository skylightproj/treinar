package br.com.treinar.estudo.aulatres;

import br.com.treinar.estudo.modelo.Atleta;

public class Prova {

	public static void main(String[] args) {
		Atleta a = new Atleta();
		System.out.println("O Atleta est� " + a.recuperarStatus());
		a.correr();
		System.out.println("O Atleta est� " + a.recuperarStatus());
	}
	
}
