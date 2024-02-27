package br.com.fiap;

public class TeseFolhaDePagamento {

	public static void main(String[] args) {
		
		FolhaDePagamento pagamento = new FolhaDePagamento();
		
		pagamento.salarioBruto = 5000;
		pagamento.numDeDependentes = 2;
		pagamento.descontoINSS = 10;
		pagamento.valPlanoDeSaude = 50;
		pagamento.calcSalarioLiquido(0);

	}

}
