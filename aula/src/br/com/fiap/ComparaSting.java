package br.com.fiap;

import javax.swing.JOptionPane;

public class ComparaSting {

	public static void main(String[] args) {
		String senha;
		senha = JOptionPane.showInputDialog("Digite sua senha");
		// Diff minuscula de mauscula
		if (senha.equals("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null, "Teste 1: Acesso autorizado!");
		} else {
			JOptionPane.showMessageDialog(null, "Teste 1: Acesso negado!");
		}
		// Sem diff minuscula de mauscula
		if (senha.equalsIgnoreCase("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null, "Teste 2: Acesso autorizado!");
		} else {
			JOptionPane.showMessageDialog(null, "Teste 2: Acesso negado!");
		}
	}
	
}
