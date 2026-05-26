package atividade4.exercicio1;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;
	
	public ContaPoupanca(String cliente, int numeroConta, int saldo, int diaRendimento) {
		super(cliente, numeroConta, saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public double calcularNovoSaldo() {
		 this.saldo = saldo * 1.005;
		 return saldo;
	}
	
	@Override
	 public void exibirDados() {
		//super.exibirDados();
	    System.out.println("Número da conta poupança: " + numeroConta);
	    System.out.printf("Saldo: %.0f \n",  saldo);		
	    System.out.printf("Novo saldo do cliente com a taxa de tendimento: %.0f",  calcularNovoSaldo());
		System.out.println("Dia de rendimento: " + diaRendimento); 
		

	 }
	 
	

}

/*• Classe ContaPoupança:
	o Dia de rendimento;
	o Método “calcularNovoSaldo”, recebe a taxa de rendimento da poupança
	e atualiza o saldo.*/

//taxa de rendimento da poupança = míseros 0,5% 