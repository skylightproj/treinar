package br.com.treinar.humberto;

import java.util.Scanner;

public class ExercicioEnum {
	
	public static void main(String[] args) {
		System.out.print("Insira o n�mero do m�s: ");
		Scanner sc = new Scanner(System.in);
		int numMes = sc.nextInt();
		
		if (numMes > 0 && numMes <= 12) {
			Mes[] meses = Mes.values();
			System.out.println(meses[numMes - 1]);
		
		} else {
			System.out.println("N�mero informado incompat�vel");
		
		}		
			
		sc.close();
				
	}

}
