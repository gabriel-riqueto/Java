package br.com.fiap;

import java.util.Scanner;

public class UsaGeometria {

	public static void main(String[] args) {
		Geometria geo = new Geometria();
		int escolha = 0;
		Scanner scan;
		System.out.println("faça sua escolha:");
		System.out.println("(1) cálculo da área do quadrado");
		System.out.println("(2) cálculo da área do retângulo");
		System.out.println("(3) cálculo da área do triângulo");
		System.out.println("(4) cálculo da área do circulo");
		try {
			scan = new Scanner(System.in);
			escolha = scan.nextInt();
			if (escolha == 1) {
				System.out.println("Digite o valor da base");
				geo.setBase(scan.nextFloat());
				geo.calcularAreaQuadrado(geo.getBase());
			} else if (escolha == 2) {
				System.out.println("Digite o valor da base");
				geo.setBase(scan.nextFloat());
				System.out.println("Digite o valor da altura");
				geo.setAltura(scan.nextFloat());
				geo.calcularAreaRetangulo(geo.getBase(), geo.getAltura());
			}else if (escolha == 3) {
				System.out.println("Digite o valor da base");
				geo.setBase(scan.nextFloat());
				System.out.println("Digite o valor da altura");
				geo.setAltura(scan.nextFloat());
				geo.calcularAreaTriangulo(geo.getBase(), geo.getAltura());
			}else if (escolha == 4) {
				System.out.println("Digite o valor do raio");
				geo.setRaio(scan.nextDouble());
				geo.calcularAreaCirculo(geo.getRaio());
			}else {
				throw new Exception("Escolha incorreta");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
