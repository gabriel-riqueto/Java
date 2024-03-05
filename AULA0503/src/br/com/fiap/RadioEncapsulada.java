package br.com.fiap;

public class RadioEncapsulada {
	// atributos 1º
	private int volume;
	private float estacao;
	
	// getters & setters 2º	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 100) {
				this.volume = volume;
			}else {
				throw new Exception("Volume fora da faixa permitida");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public float getEstacao() {
		return estacao;
	}
	
	public void setEstacao(float estacao) {
		try {
			if (estacao >= 80.0f && estacao <= 105.0) {
				this.estacao = estacao;
			}else {
				throw new Exception("Estação fora da faixa permitida (80.0 a 105.0");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// metodos 3º
	public void aumentarVolume() {
		if (volume < 100) {
			volume ++;
		} 
		else {
			System.out.println("O volume já está no maximo");
		}
			
	}
	public void diminuirVolume() {
		if (volume > 0) {
			volume --;
		}
		else {
			System.out.println("O volume já está no minimo");
		}
	}
	public void mostrar(){
		System.out.println("Volume: "+ getVolume() + "\nEstação: " + getEstacao());
	}

}
