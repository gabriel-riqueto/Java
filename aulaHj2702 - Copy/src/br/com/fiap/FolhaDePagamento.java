package br.com.fiap;

public class FolhaDePagamento {
	
	public double salarioBruto;
	public int numDeDependentes;
	public double descontoINSS;
	public double valPlanoDeSaude;
	
	public void calcSalarioLiquido (double liquido) {
		liquido = salarioBruto - ((valPlanoDeSaude * (numDeDependentes+1) + (descontoINSS*salarioBruto)/100));
		System.out.println("Seu salario liquido atual é de: "+liquido);
	}
}
