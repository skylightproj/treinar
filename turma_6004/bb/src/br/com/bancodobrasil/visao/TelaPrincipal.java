package br.com.bancodobrasil.visao;

import javax.swing.JOptionPane;

import br.com.bancodobrasil.modelo.Cliente;
import br.com.bancodobrasil.modelo.banco.Conta;

public class TelaPrincipal {
	
	public void init() {
		Conta c = null;
		Integer opcao = -1;
		
		do {
			
			String msg = "Digite:\n1-Criar Conta\n"
					+ "2-Depositar\n"
					+ "3-Exibir Saldo\n"
					+ "4-Sacar\n"
					+ "0-Sair";
			String opcaoStr = JOptionPane.showInputDialog(msg);
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 1:
				c = new Conta();
				String numeroContaStr = JOptionPane.showInputDialog("Informe o n�mero da conta"); 
				c.numeroConta = Long.parseLong(numeroContaStr);
				c.proprietario = new Cliente();
				c.proprietario.nome = JOptionPane.showInputDialog("Informe o nome do proprietario da conta");
				String cpfStr = JOptionPane.showInputDialog("Informe o cpf do proprietario da conta");
				c.proprietario.cpf = Long.parseLong(cpfStr);
				break;
			case 2:
				String valorDepositadoStr = JOptionPane.showInputDialog("Valor a ser depositado");
				Double valorDepositado = Double.parseDouble(valorDepositadoStr);
				c.depositar(valorDepositado);
				break;
			case 3:
				Double saldo = c.recuperarSaldo();
				JOptionPane.showMessageDialog(null,"Saldo: " + saldo);
				break;
			case 4:
				String valorSacadoStr = JOptionPane.showInputDialog("Valor a ser sacado");
				Double valorSacado = Double.parseDouble(valorSacadoStr);
				c.sacar(valorSacado);
				break;
			case 0:
				System.out.println("opcao sair 0");
				//Erica
				break;

			default:
				System.out.println("opcao errada");
				break;
			}
			
			
		} while (opcao != 0);
		
	}
	
}
