package br.com.reclama.visao;

import javax.swing.JOptionPane;

import br.com.reclama.modelo.Cliente;
import br.com.reclama.modelo.Funcionario;
import br.com.reclama.modelo.ReclamacaoAtendimento;
import br.com.reclama.modelo.ReclamacaoCarga;
import br.com.reclama.modelo.principal.Reclamacao;


public class TelaReclama {

	public Reclamacao reclamacao;
	
	
	public void iniciaReclamacao(){
		
		String menu = "Digite:\n"
				+ "1 - Registrar Reclamação\n"
				+ "2 - Imprimir Reclamação\n"
				+ "0 - Sair";
	String opcaoStr = null;
	
	do {
		
		opcaoStr = JOptionPane.showInputDialog(menu);
		
		switch (opcaoStr) {
		case "1":
			cadastrarReclamacao();
			break;
		case "2":
			mostrarreclamacao();
			break;
			
		default:
			break;
		}
		
		
	 } while (!opcaoStr.equals("0"));
		
	}


	private void cadastrarReclamacao() {
		String menu = "Tipo de Reclamação: \n"
				+ "1 - Reclamação de Atendimento\n"
				+ "2 - Reclamação de Carga\n";
		String optReclama = JOptionPane.showInputDialog(menu);
		switch (optReclama) {
		case "1":
			reclamacao = new ReclamacaoAtendimento();
			cadastrarFuncionario();
			cadastrarCliente();
			cadastrarReclamacaoAtendimento((ReclamacaoAtendimento) reclamacao);
			break;
		case "2":
			reclamacao = new ReclamacaoCarga();
			cadastrarFuncionario();
			cadastrarCliente();
			cadastraReclamacaoCarga((ReclamacaoCarga) reclamacao);
			break;

		default:
			break;
		}
		
				
	}


	private void cadastraReclamacaoCarga(ReclamacaoCarga rec) {
		rec.data = JOptionPane.showInputDialog("Data da reclamacao");
		rec.setNumeroNota(Integer.parseInt(JOptionPane.showInputDialog("Número da Nota")));
		rec.descricao = JOptionPane.showInputDialog("Descricao");
		
	}


	private void mostrarreclamacao() {
		// TODO Auto-generated method stub
		
	}


	private void cadastrarReclamacaoAtendimento(ReclamacaoAtendimento rec) {
		rec.data = JOptionPane.showInputDialog("Data da reclamacao");
		rec.descricao = JOptionPane.showInputDialog("Descricao");
		
	}


	private void cadastrarFuncionario() {
		reclamacao.funcionario = new Funcionario();
				
		reclamacao.funcionario.nome = JOptionPane.showInputDialog("Nome funcionario que cadastra");
		reclamacao.funcionario.setMatricula(Long.parseLong(JOptionPane.showInputDialog("Matricula do funcionario que cadastra")));
		reclamacao.funcionario.sac();
		
	}


	private void cadastrarCliente() {
	
		reclamacao.cliente = new Cliente();	
						
		reclamacao.cliente.setCnpj(Long.parseLong(JOptionPane.showInputDialog("CNPJ do Cliente")));
		reclamacao.cliente.nome = JOptionPane.showInputDialog("Nome do Cliente");
		reclamacao.cliente.setResponsavel(JOptionPane.showInputDialog("Nome do responsável pela reclamação"));
				
	}
	
}
