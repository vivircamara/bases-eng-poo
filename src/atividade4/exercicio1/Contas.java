package atividade4.exercicio1;
//import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//caso queira usar o scanner nesta atividade
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira o valor para saque ");
		int saque = scanner.nextInt();
		
		System.out.print("Insira o valor para deposito ");
		int deposito = scanner.nextInt();
		  
		scanner.close();*/
		
		ContaBancaria novaContaBancaria = new ContaBancaria("Lara", 91011, 300);
		ContaEspecial novaContaEspecial = new ContaEspecial("Lara", 5678, 300, 1000);
		ContaPoupanca novaContaPoupanca = new ContaPoupanca("Lara", 1234, 300, 3);

		novaContaPoupanca.sacar(200);
		novaContaPoupanca.depositar(100);
		
		novaContaEspecial.sacar(600);
		novaContaEspecial.depositar(10);
		
		novaContaBancaria.exibirDados();
		novaContaEspecial.exibirDados();
		novaContaPoupanca.exibirDados();
	}

}

/*Exercício 1 – Conta Bancária: Elabore uma classe ContaBancaria, com os seguintes
membros:
• Cliente %
• Número da conta %
• Saldo %
• Método sacar (o saldo não pode ficar negativo) %
• Método depositar %
//////////////////////////////////////////////////////////////////////
Agora acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupança
e ContaEspecial, com as seguintes características a mais:

• Classe ContaPoupança:
	o Dia de rendimento;%
	o Método “calcularNovoSaldo”, recebe a taxa de rendimento da poupança
	e atualiza o saldo.%
• Classe ContaEspecial:
	o Limite;%
	o Redefinição do método sacar, permitindo saldo negativo até o valor do
	limite; %
Após a implementação das classes acima, você deverá implementar uma classe
Contas, contendo o método principal. Nesta classe, você deverá implementar:
1. Incluir dados relativos a(s) conta(s) de um cliente;
2. Sacar um determinado valor da(s) sua(s) conta(s);
3. Depositar um determinado valor na(s) sua(s) conta(s);
4. Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que
possuem conta poupança;%
5. Mostrar os dados da(s) conta(s) de um cliente.%
*/




