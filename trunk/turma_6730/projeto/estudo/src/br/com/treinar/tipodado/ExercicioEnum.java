package br.com.treinar.tipodado;

import javax.swing.JOptionPane;

public class ExercicioEnum {

	public static void main(String[] args) {
		Integer mes = Integer.valueOf(JOptionPane.showInputDialog(null, 
									  "Informe o m�s"));

		Integer limite = Mes.values().length;
		
		if (mes > 0 && mes <= limite) {
			Mes enumMes = Mes.recuperarPorOrdinal(mes - 1);
			JOptionPane.showMessageDialog(null, enumMes + " Quantidade de dias: " + enumMes.getQtdDias());
		} else {
			JOptionPane.showMessageDialog(null, "Indice inv�lido");
		}
	}
	
}
