package atividade4.exercicio1;

public class ContaBancaria {
	 protected String cliente;
	 protected int numeroConta;
	 protected double saldo;
	 
	 //entender protect, private, etc
	 
	 public ContaBancaria(String cliente, int numeroConta, int saldo) {
		 this.cliente = cliente;
		 this.numeroConta = numeroConta;
		 this.saldo = saldo;
		 
	 }
	 
	 
	 // Método sacar (o saldo não pode ficar negativo)
	 public double sacar( int saque) {
		
		 this.saldo = saldo - saque;
		 return saldo;
	 }
	 //Método depositar
	 //cammelCase
	 public double depositar(int deposito) {
		 this.saldo = saldo + deposito;
		 return saldo;
	 }
	 //cammelCase
	//Normalmente os métodos do tipo "ação" são sempre return? E depois você faz um sysout dele?

	 public void exibirDados() {
		 System.out.println("Nome do cliente: " + cliente);
		 System.out.println("Número da conta: " + numeroConta);
		 System.out.printf("Saldo: %.0f \n",  saldo);

	 }
	 
	 
}

/*Exercício 1 – Conta Bancária: Elabore uma classe ContaBancaria, com os seguintes
membros:
• Cliente
• Número da conta
• Saldo
• Método sacar (o saldo não pode ficar negativo)
• Método depositar
////////////////////////////////////////////////////////////////////
Agora acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupança
e ContaEspecial, com as seguintes características a mais:
• Classe ContaPoupança:
o Dia de rendimento;
o Método “calcularNovoSaldo”, recebe a taxa de rendimento da poupança
e atualiza o saldo.
• Classe ContaEspecial:
o Limite;
o Redefinição do método sacar, permitindo saldo negativo até o valor do
limite;
///////////////////////////////////////////////////////////////////
Após a implementação das classes acima, você deverá implementar uma classe
Contas, contendo o método principal. Nesta classe, você deverá implementar:
1. Incluir dados relativos a(s) conta(s) de um cliente;
2. Sacar um determinado valor da(s) sua(s) conta(s);
3. Depositar um determinado valor na(s) sua(s) conta(s);
4. Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que
possuem conta poupança;
5. Mostrar os dados da(s) conta(s) de um cliente.*/

