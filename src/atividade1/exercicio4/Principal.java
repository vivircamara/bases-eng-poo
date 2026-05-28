package atividade1.exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite dois valores:");
		double valor1 = scanner.nextDouble(); 
		double valor2 = scanner.nextDouble(); 
		
		System.out.println("Escolha entre 1(somar), 2(subtrair), 3(multiplicar) 4(dividir):");
		int escolha = scanner.nextInt(); 
		
		scanner.close();
		//System.out.println("Valores: " + valor1 + " " + valor2);
		
		Operacao novaOperacao = new Operacao(valor1, valor2, escolha);
		//novaOperacao.realizarOperacao();
		novaOperacao.mostrarResultado();
		
	
		
		
	}

}

/*4 - Crie um programa que pede ao usuário para digitar dois números%
  e, em seguida, escolher uma operação matemática (+, -, *, /). Apresente o resultado da operação
escolhida pelo usuário.*/