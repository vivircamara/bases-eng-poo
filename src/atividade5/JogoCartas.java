package atividade5;

import java.util.Random;
import java.util.Scanner;

public class JogoCartas extends Jogo {
	//atributo
	private String tipoBaralho;
	private Scanner leitor;
	private int cartasJ1 = 5;
	private int cartasJ2 = 5;
	private int cartas = 5;
	private int cartasPorJogador;
	private String J1;
	private String J2;
	private int rodada = 0;
	
	//construtor da classe
	public JogoCartas(String nome, int numeroJogadores, String tipoBaralho, Scanner leitor) {
		super(nome, numeroJogadores);
		this.tipoBaralho = tipoBaralho;
		this.leitor= leitor;
		//numeroJogadores = leitor.nextInt();
	}
	
	
	//consumir os métodos concretos e abstratos
	@Override
	public void iniciar() {
	  //Validação da quantidade mínima e máxima de jogadores, com base no Poker Five-Card Draw 
		if(numeroJogadores > 10) {
			System.out.println("Quantidade excedida de jogadores. O número de jogadores deve estar entre 2 e 10");
		}else if (numeroJogadores < 2) {
			System.out.println("Quantidade pequena de jogadores. O número de jogadores deve estar entre 2 e 10");
		}
		
	    System.out.println("Digite o nome do primeiro jogador");
		J1 = leitor.next();
		
		System.out.println("Digite o nome do segundo jogador");
		J2 = leitor.next();
		
		//claudia e lara

		
	
		
		//Definição automática da quantidade de cartas por jogador
		cartasPorJogador = 52 / numeroJogadores;
		System.out.println("Cada jogador recebe durante o jogo, no máximo: " + cartasPorJogador + " cartas");
		//Simulação de distribuição de cartas para os jogadores
		while (cartasJ1 <= cartasPorJogador || cartasJ2 <= cartasPorJogador) {
			rodada++;
			System.out.println("Rodada " + rodada);
			//System.out.println("Jogador(a) " + J1 + " possui: " + cartasJ1 + " cartas");
			//cartasJ1 += cartas;
			System.out.println(J1 + ": " + cartasJ2 + " cartas");
			cartasJ1++;
			
			//System.out.println("Jogador(a) " + J2 + " possui: " + cartasJ2 + " cartas");
			//cartasJ2 += cartas;
			System.out.println(J2 + ": " + cartasJ2 + " cartas");
			cartasJ2++;
			
			//Exibição do total de cartas restantes no baralho.
			int cartasRestantes = 52 - (rodada * cartasJ1);
			System.out.println("Cartas restantes no baralho: " + cartasRestantes);
			System.out.println("\n");
		}
		
		
		//Sorteando o vencedor
        String[] nomes = {J1, J2};
        Random gerador = new Random();
        int indiceAleatorio = gerador.nextInt(2);
        System.out.println("O jogador vencedor foi: " + nomes[indiceAleatorio]);
		
		
	}
	
	@Override
	public void exibirRegras() {
		System.out.println("Jogo de Cartas: " + super.nome);
		System.out.println("Cada jogador deve jogar"
				+ " uma carta por vez");
	}
	
	@Override
	public String toString() {
		return super.toString()+
				" Tipo baralho: " + tipoBaralho;
	}
}

/*1 - Classe JogoCartas
● Implemente no método iniciar() uma lógica contendo:%
● Validação da quantidade mínima e máxima de jogadores;%
● Definição automática da quantidade de cartas por jogador;% --> dependendo da quantidade de jogador dentro do jogo cada um vai ter mais ou menos cartas
● Simulação de distribuição de cartas para os jogadores;%
● Exibição do nome do vencedor de uma rodada (pode ser aleatório);%
● Exibição do total de cartas restantes no baralho.
*/

//Como fazer para o usuário definir a quantidade de jogadores e a apartir disso o console pedir exatamente aquela quantidade de nomes?

/*Validação da quantidade de jogadores: O seu programa precisa de um "filtro". Antes do jogo começar, você tem que checar se a quantidade de jogadores faz sentido (por exemplo, não dá para jogar Poker sozinho e nem com 50 pessoas na mesma mesa). Se o número estiver fora do limite que você inventar (ex: mínimo 2, máximo 5), o jogo nem deve iniciar. %

Definição automática de cartas por jogador: Aqui é uma regra matemática simples. Se você tem um baralho (geralmente com 52 cartas), quanto mais pessoas jogando, menos cartas cada uma pode receber para o baralho não acabar. O professor quer que o seu código faça essa conta sozinho: Total de Cartas / Quantidade de Jogadores.

Simulação de distribuição: É apenas mostrar no console (via System.out.println) o texto avisando que as cartas estão sendo entregues para os jogadores que estão na mesa.

Exibição do nome do vencedor da rodada (pode ser aleatório): Como o enunciado diz "pode ser aleatório", você não precisa criar uma lógica para ver quem tem a melhor mão de cartas. Você só precisa usar o seu gerador de sorteio (Random) para escolher, de forma aleatória, o nome de um dos jogadores que estão na mesa e printar: "O jogador X venceu a rodada!".

Exibição do total de cartas restantes: No final, o programa precisa fazer uma subtração simples e mostrar na tela: Total do Baralho - (Cartas por jogador * Quantidade de jogadores). É só para mostrar quantas cartas sobraram na mesa sem dono.*/

// adicionar um JOption pane com a opção de iiciar outra rodada e assim distribuir novamente 5 cartas para cada jogador?



