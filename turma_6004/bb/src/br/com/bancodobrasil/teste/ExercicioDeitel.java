//Deitel, Java: Como Programar, Exerc�cio 2.6, Cap.2, p�g. 50

package br.com.bancodobrasil.teste;

import java.util.Scanner;

public class ExercicioDeitel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int soma;
		int mult;
		int sub;
		int div;
		
		System.out.println("Informe o primeiro inteiro: ");
		num1 = input.nextInt();
		
		System.out.println("Informe o segundo inteiro: ");
		num2 = input.nextInt();
		
		soma = num1 + num2;
		System.out.println("A SOMA �: " + soma);
		
		mult = num1 * num2;
		System.out.println("O PRODUTO �: " + mult);
		
		sub = num1 - num2;
		System.out.println("A DIFEREN�A �: " + sub);
		
		div = num1 / num2;
		System.out.println("A DIVIS�O �: " + div);
		
	}

}
