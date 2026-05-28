package atividade2.exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do seu funcionário:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o valor do salário dele:");
		int salario = scanner.nextInt();
		
		scanner.close();
		
		Funcionario novoFuncionario = new Funcionario(nome, salario);
		novoFuncionario.exibirInformacoes();

	}

}

/*2 - Faça um programa que leia os dados de um funcionário (nome e salário). Em seguida, aplique um aumento com base no salário do funcionário 
 
•	Se o salário do funcionário estiver entre 1 e 1000, aplique um aumento de 15%; 
•	Se o salário do funcionário estiver entre 1001 e 1500, aplique um aumento de 10%; 
•	Se o salário do funcionário estiver entre 1501 e 2000, aplique um aumento de 5%. 
Ao final imprima o salário antigo e o atual do funcionário, de acordo com o aumento estabelecido. 
*/