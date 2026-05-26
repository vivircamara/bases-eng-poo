package atividade4.exercicio1;

public class ContaEspecial extends ContaBancaria {
	private int limite;
	
	public ContaEspecial(String cliente, int numeroConta, int saldo, int limite) {
		super(cliente, numeroConta, saldo);
		this.limite = limite;
	}
	
	
	@Override
	 public double sacar( double saque) {
		//super.sacar(saque);
		this.saldo = saldo - saque;
		
		if(saque > (limite + saldo)) {
			System.out.println("Saque maior do que seu limite. Tente novamente");
			return 0;
		}else {
			return limite - saque;

		}
	
	 }
	public void exibirDados() {
		 System.out.println("Número da conta especial: " + numeroConta);
		 System.out.printf("Saldo: %.0f \n",  saldo);

	 }
	
}

/*• Classe ContaEspecial:
	o Limite;
	o Redefinição do método sacar, permitindo saldo negativo até o valor do
	limite;*/