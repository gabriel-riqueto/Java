package br.com.fiap;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
			String frase = "O rato roeu a roupa do rei de Roma";
			JOptionPane.showMessageDialog(null, frase);
			//Exibindo a quant de carac
			int qtChar = frase.length();
			JOptionPane.showMessageDialog(null, qtChar);
			// Exibindo a frase em maiucula
			String maiuscula = frase.toUpperCase();
			JOptionPane.showMessageDialog(null, maiuscula);
			// Exibindo a frase em minuscula
			String minuscula = frase.toLowerCase();
			JOptionPane.showMessageDialog(null, minuscula);
			// Obtendo a palavra Roma
			String palavra = frase.substring(30, 34);
			JOptionPane.showMessageDialog(null, palavra);
			// Substitui a palavra roupa por parede 
			String frase2 = frase.replace("roupa", "parede");
			JOptionPane.showMessageDialog(null, frase2);
	}

}
