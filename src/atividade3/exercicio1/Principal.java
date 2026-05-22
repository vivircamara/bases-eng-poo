package atividade3.exercicio1;

import java.util.Scanner;





public class Principal {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		Scanner scanner = new Scanner(System.in);



        // Lendo um texto (String)

        System.out.print("Digite o seu nome: ");

         String nome = scanner.nextLine();



         System.out.print("Digite o seu país de origem: ");

         String pais = scanner.nextLine();

         

        // Lendo um número inteiro (int)

        System.out.print("Digite a sua idade: ");

         int idade = scanner.nextInt();



        // Exibindo os dados lidos

        //System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");



        // Fechando o Scanner

        scanner.close();

		

		Pessoa novaPessoa = new Pessoa(nome, pais, idade);

		

		

		//novaPessoa.setNome("Eduarda");

		novaPessoa.exibirDados();

		

		//tentando  pegar dados com o scanner

		

		

	}



}