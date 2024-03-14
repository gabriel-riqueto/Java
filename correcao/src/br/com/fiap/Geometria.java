package br.com.fiap;

public class Geometria {
	
	private float base;
	private float altura;
	private double raio;
	
	public float getBase() {
		return base;
	}
	
	public void setBase(float base) {
		try {
			if (base >= 0.0f && base <= 100.0f) {
				this.base = base;
			}else {
				throw new Exception("Valor fora da faixa");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		try {
			if (altura >= 0.0f && altura <= 100.0f) {
				this.altura = altura;
			}else {
				throw new Exception("Valor fora da faixa");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		try {
			if (raio >= 0.0f && raio <= 100.0f) {
				this.raio = raio;
			}else {
				throw new Exception("Valor fora da faixa");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void calcularAreaQuadrado(float base) {
		setBase(base);
		float area = getBase() * getBase();
		System.out.println("Base: "+getBase());
		System.out.println("Área do quadrado: "+ area);
	}
	
	public void calcularAreaRetangulo(float base, float altura) {
		setBase(base);
		setAltura(altura);
		float area = getBase() * getAltura();
		System.out.println("Base: "+getBase());
		System.out.println("Altura: "+getAltura());
		System.out.println("Área do retângulo: "+ area);
	}
	
	public void calcularAreaTriangulo(float base, float altura) {
		setBase(base);
		setAltura(altura);
		float area = (getBase() * getAltura()) / 2;
		System.out.println("Base: "+getBase());
		System.out.println("Altura: "+getAltura());
		System.out.println("Área do triângulo: "+ area);
	}
	
	public void calcularAreaCirculo(double raio) {
		final double PI = 3.14;
		setRaio(raio);
		double area = PI * Math.pow(getRaio(), 2);
		System.out.println("Raio: "+getRaio());
		System.out.println("Área do círculo: "+ area);
	}

}
