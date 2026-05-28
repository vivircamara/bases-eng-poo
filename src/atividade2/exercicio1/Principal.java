package atividade2.exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do item:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o preço do item:");
		int preco = scanner.nextInt();
		
		System.out.println("Digite a quantidade no estoque:");
		int qtd = scanner.nextInt();
		
		System.out.println("Digite valor para retirar:");
		int saida = scanner.nextInt();
		
		System.out.println("Digite valor para adicionar:");
		int entrada = scanner.nextInt();
		
		scanner.close();
		
		
		//Produto novoProduto = new Produto("escova", 24, 10);
		Produto novoProduto = new Produto(nome, preco, qtd);
		
		novoProduto.exibirDados();
		/*novoProduto.entradaEstoque(20);
		novoProduto.saidaEstoque(50);
		novoProduto.saidaEstoque(10);*/
		
		novoProduto.entradaEstoque(entrada);
		novoProduto.saidaEstoque(saida);
		novoProduto.saidaEstoque(saida);

	}

}


/*1 – Crie um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). 
Em seguida: 
•	Mostre os dados do produto (nome, preço, quantidade no estoque, valor total no estoque); 
•	Realize uma entrada no estoque e mostre novamente os dados do produto; 
•	Realize uma saída no estoque e mostre novamente os dados do produto. O programa deve realizar a seguinte validação: 
o	Se a quantidade informada exceder a quantidade disponível no estoque, apresente uma mensagem ao usuário, informando tal situação. 
*/