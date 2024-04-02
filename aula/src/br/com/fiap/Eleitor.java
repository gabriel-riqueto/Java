package br.com.fiap;

import java.time.LocalDate;

public class Eleitor {
	private String nome;
	private int anoNasci;
	private int numTitulo;
	private int zona;
	private int secao;
	
	public Eleitor() {	}//gcfs
	
	//gcuf
	public Eleitor(String nome, int anoNasci, int numTitulo, int secao, int zona) {
		this.nome = nome;
		setAnoNasci(anoNasci);
		this.numTitulo = numTitulo;
		this.secao = secao;
		this.zona = zona;
	}

	//ggas
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasci() {
		return anoNasci;
	}

	public void setAnoNasci(int anoNasci) {
		try {
			int anoAtualMenos16 = LocalDate.now().getYear() - 16;
			if (anoNasci >= 1900 && anoNasci <= anoAtualMenos16) {
				this.anoNasci = anoNasci;
			} else {
				this.anoNasci = 1900;
				throw new Exception("Ano de nascimento inválido");
			}
 		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getNumTitulo() {
		return numTitulo;
	}

	public void setNumTitulo(int numTitulo) {
		this.numTitulo = numTitulo;
	}

	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}
	
	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}
	
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNasci;
	}
	
	
	
}
