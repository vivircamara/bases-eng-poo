package atividade5;

import java.util.Random;

public class JogoTabuleiro extends Jogo {
	Random gerador = new Random();
	
	//atributos
	private String tipoTabuleiro;
	private int casasTotal = 20;
	//private int casaAtual = 0;
	 int casaAtualJ1 = 0;
	 int casaAtualJ2 = 0;
	//private int valorDado = 2;
	private int jogadas = 0;
	private int rodadas;
	int valorDado;
	//= gerador.nextInt(6) + 1; // será que meu if dentro do while quebra se eu tirar essa linha?
	private String jogadorUm;
	private String jogadorDois;
	//private String j1;
	//private String j2;
	
	//construtor
	public JogoTabuleiro(String nome, int numeroJogadores, String tipoTabuleiro, String jogadorUm, String jogadorDois) {
		super(nome, numeroJogadores);
		this.tipoTabuleiro = tipoTabuleiro;
		this.jogadorUm = jogadorUm;
		this.jogadorDois = jogadorDois;
	}
	
	//primeira tentativa de criar o método andarCasas, erro: não considerei os dois jogadores da forma correta ://
/*	public  void andarCasas() {
		System.out.println("Casa incial: " + casaAtual);
		while(casaAtual  < casasTotal) {
			//if(casaAtual <= casasTotal) {
			//(casaAtual + valorDado) <= casasTotal
			if((casaAtual + valorDado) < casasTotal) {
				valorDado = gerador.nextInt(6) + 1;
				casaAtual += valorDado;
				System.out.println("Valor do dado: " + valorDado + " Casa atual: " + casaAtual);
				
			}else {
				casaAtual = casasTotal;
				System.out.println("Valor do dado: " + valorDado + " você chegou a casa final");
				//System.out.println("Fim de jogo");
			}
						//enquanto casa atual for < que o total de casas, então casa atual += valorDado
		//return casaAtual - casasTotal;
		rodada++;
		}	
		//if(casaAtual >= casasTotal) {casaAtual = casasTotal;}
		System.out.println("Rodadas totais realizadas: " + rodada);
		if((rodada % 2) == 0) {
			System.out.println("Jogador 2: " + jogadorDois + " venceu");
		}else {
			System.out.println("Jogador 1: " + jogadorUm + " venceu");
		}
			
			//return casaAtual;	
	} */
	
	//Segunda tentativa, feita com auxílio de pesquisas, levando em conta os dois jogadores
	public void andarCasas() {
	  
	    boolean vezDoJ1 = true; // --> se for true é a vez do J1, se for false é do J2
	    System.out.println("Casa inicial dos jogadores: 0");
	    while(casaAtualJ1 < casasTotal && casaAtualJ2 < casasTotal) {
	        valorDado = gerador.nextInt(6) + 1;
	        
	        jogadas++;
	        System.out.println("JOGADA " + jogadas);
	
	        if (vezDoJ1) {
	            if((casaAtualJ1 + valorDado) < casasTotal) {
	                casaAtualJ1 += valorDado;
	                System.out.println("Vez de: " + jogadorUm + ". Valor do dado: " + valorDado + ". Casa atual: " + casaAtualJ1);
	            } else {
	                casaAtualJ1 = casasTotal;
	                System.out.println("Vez de: " + jogadorUm + ". Valor do dado: " + valorDado + ". Chegou à casa final!");
	            }
	           // rodada++;
	            vezDoJ1 = false; 	            
	        } else {
	            if((casaAtualJ2 + valorDado) < casasTotal) {
	                casaAtualJ2 += valorDado;
	                System.out.println("Vez de: " + jogadorDois + ". Valor do dado: " + valorDado + ". Casa atual: " + casaAtualJ2);
	            } else {
	                casaAtualJ2 = casasTotal;
	                System.out.println("Vez de: " + jogadorDois + ". Valor do dado: " + valorDado + ". Chegou à casa final!");
	            }	
	            	//rodada++;
	 	            vezDoJ1 = true; 
	        }
	    }   
	    
	    System.out.println("--------------------------------------------");
	    if(jogadas % 2 == 0) {
	    	rodadas = (jogadas / 2);
	    } else {
	    	rodadas = (jogadas / 2) + 1;
	    }
	    System.out.println("Rodadas totais realizadas: " + rodadas);
	    if (casaAtualJ1 >= casasTotal) {
	        System.out.println("Jogador 1: " + jogadorUm + " venceu!");
	    } else {
	        System.out.println("Jogador 2: " + jogadorDois + " venceu!");
	    }
	}
	
	//métodos abstratos e concretos
	@Override
	public void iniciar() {
		System.out.println("Jogo de tabuleiro: " + super.nome);
	}
	
	@Override
	public void exibirRegras() {
		System.out.println("Cada jogador deve mover "
				+ "suas peças no tabuleiro");
		//System.out.println(andarCasas());
	}
	
	@Override
	public String toString() {
		return super.toString() + " Tipo tabuleiro: " + tipoTabuleiro;
	}	
}

/*2 - Classe JogoTabuleiro
● Simulação de movimentação de jogadores no tabuleiro; %
● Sorteio de valores de dado;%
● Controle da posição de cada jogador;
● Identificação do jogador vencedor;
● Exibição do número total de rodadas realizadas% --> adicionar contador ou casa atual final / casastotal*/