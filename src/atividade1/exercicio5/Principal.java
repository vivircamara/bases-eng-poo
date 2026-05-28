package atividade1.exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha entre: \n 1-Pizza\n 2- Hambúrguer\n 3-Salada\n 4-Bebida");
		int escolha = scanner.nextInt(); 
		
		scanner.close();

		
		Menu novoMenu = new Menu(escolha);
		novoMenu.selecionarOpcao();
	
	
		
		
	}

}

//Como utilizar o switch
//utlizar o JOptionPane em outra oportunidade
/*5 – Crie um programa que simule um menu de um restaurante. O programa deve
apresentar opções de pratos e permitir ao usuário escolher um prato para ver a
descrição e o preço. O menu inclui:
• Pizza
• Hambúrguer
• Salada
• Bebida
Cada prato tem uma descrição e um preço associado.*/