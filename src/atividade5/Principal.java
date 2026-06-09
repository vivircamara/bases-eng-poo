package atividade5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//não conseguimos instanciar o objeto Jogo (classe abstrata)
		//Jogo jogoCartas = new Jogo("Uno", 4);
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Digite o nome do primeiro jogador");
		String j1 = scanner.next();
		
		System.out.println("Digite o nome do segundo jogador");
		String j2 = scanner.next();
		scanner.close();
		
		//j1= Claudio, j2 = Lauro
		JogoTabuleiro jogoTabuleiro = new JogoTabuleiro("Banco imobiliario", 2, "Quadrado", j1, j2);
		jogoTabuleiro.iniciar();
		jogoTabuleiro.exibirRegras();
		jogoTabuleiro.andarCasas();
		
		Jogo jogoCarta = new JogoCartas("Poker", 2, "Padrão");
		jogoCarta.iniciar();
		jogoCarta.exibirRegras();
		
		
	}

}

/*3 - Classe Principal:
● Crie objetos dos dois tipos de jogos; %
● Executar os métodos iniciar() e exibirRegras();%
● Demonstrar claramente o funcionamento da lógica implementada.%
*/