package br.com.fiap;

import java.time.LocalDate;

public class UsaEleitor1 {

	public static void main(String[] args) {
		int anoAtual = LocalDate.now().getYear();
		Eleitor eleitor1 = new Eleitor();
		eleitor1.setNome("Astrogildo");
		eleitor1.setAnoNasci(1990);
		eleitor1.setNumTitulo(123456);
		eleitor1.setZona(123);
		eleitor1.setSecao(456);
		
		Eleitor eleitor2 = new Eleitor("Berisvaldo", 1987, 987654, 987, 654);
		
		System.out.println("\n----Exibindo Informações----");
		System.out.println("Nome: " + eleitor1.getNome());
		System.out.println("Ano de Nascimento: " + eleitor1.getAnoNasci());
		System.out.println("Idade: " + eleitor1.calcularIdade(anoAtual));
		System.out.println("Número do Título: " + eleitor1.getNumTitulo());
		System.out.println("Zona Eleitoral: " + eleitor1.getZona());
		System.out.println("Seção Eleitoral: " + eleitor1.getSecao());
		System.out.println();
		System.out.println("Nome: " + eleitor2.getNome());
		System.out.println("Ano de Nascimento: " + eleitor2.getAnoNasci());
		System.out.println("Idade: " + eleitor2.calcularIdade(anoAtual));
		System.out.println("Número do Título: " + eleitor2.getNumTitulo());
		System.out.println("Zona Eleitoral: " + eleitor2.getZona());
		System.out.println("Seção Eleitoral: " + eleitor2.getSecao());
	}

}
