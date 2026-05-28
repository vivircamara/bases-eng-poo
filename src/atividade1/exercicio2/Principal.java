package atividade1.exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 3 valores para formar um triângulo:");
		int valor1 = scanner.nextInt();
		int valor2 = scanner.nextInt();
		int valor3 = scanner.nextInt();		
	
		
		Triangulo novoTriangulo = new Triangulo(valor1, valor2, valor3);
		boolean  verificar = novoTriangulo.verificarTriangulo();
		//novoTriangulo.verificarTriangulo();
		
		while(verificar == false) {
			System.out.println("Digite 3 valores para formar um triângulo:");
			 valor1 = scanner.nextInt();
			 valor2 = scanner.nextInt();
			 valor3 = scanner.nextInt();					
			
			 Triangulo outroTriangulo = new Triangulo(valor1, valor2, valor3);
			// maisTriangulo.verificarTriangulo();
			 verificar = outroTriangulo.verificarTriangulo();
			 
		}
		
		scanner.close();
		
	}

}

/*2 - Faça um programa que peça os 3 lados de um triângulo. %
 Assim, o programa deverá informar se os valores podem ser um triângulo.
 Indique, caso os lados formem um triângulo,
  se ele é: equilátero, isósceles ou escaleno. 
  Sabemos que: 
  (IF)• Três lados formam um triângulo quando a soma de quaisquer dois lados for maior
que o terceiro;
• Triângulo Equilátero: três lados iguais;
• Triângulo Isósceles: quaisquer dois lados iguais;
• Triângulo Escaleno: três lados diferentes;
*/

//Exemplo de triângulos que nn existem: lados (1, 2 e 5), lados (4, 4 e 10), lados (3, 3 e 6)
