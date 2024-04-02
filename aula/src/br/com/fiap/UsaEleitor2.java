package br.com.fiap;

import java.time.LocalDate;
import java.util.Scanner;

public class UsaEleitor2 {

	public static void main(String[] args) {
		int anoAtual = LocalDate.now().getYear();
		Eleitor eleitor1 = new Eleitor();
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite informações de eleitor 1");
			System.out.print("Nome: ");
			eleitor1.setNome(scan.nextLine());
			System.out.print("Idade: ");
			eleitor1.setAnoNasci(scan.nextInt());
			System.out.print("Número do titulo: ");
			eleitor1.setNumTitulo(scan.nextInt());
			System.out.print("Zona eleitoral: ");
			eleitor1.setZona(scan.nextInt());
			System.out.print("Seção eleitoral: ");
			eleitor1.setSecao(scan.nextInt());
		} catch (Exception e) {
			System.out.println("Algo deu errado com eleitor 1");
		}
		
		String nome = null;
		int anoNasci = 0, numTitulo = 0, zona = 0, secao = 0;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite informações de eleitor 2");
			System.out.print("Nome: ");
			nome = scan.nextLine();
			System.out.print("Ano de nascimento: ");
			anoNasci =scan.nextInt();
			System.out.print("Número do titulo: ");
			numTitulo = scan.nextInt();
			System.out.print("Zona eleitoral: ");
			zona = scan.nextInt();
			System.out.print("Seção eleitoral: ");
			secao = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Algo deu errado com eleitor 2");
		}
		
		Eleitor eleitor2 = new Eleitor(nome, anoNasci, numTitulo, zona, secao);
		
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
