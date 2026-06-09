package atividade5;

import java.util.Random;

public class JogoTabuleiro extends Jogo {
	Random gerador = new Random();
	
	//atributos
	private String tipoTabuleiro;
	//private int casas = 0;
	private int casasTotal = 20;
	private int casaAtual = 0;
	//private int valorDado = 2;
	private int rodada = 0;
	int valorDado = gerador.nextInt(6) + 1; // será que meu if dentro do while quebra se eu tirar essa linha?
	private String jogadorUm;
	private String jogadorDois;
	//private String j1;
	//private String j2;

	//private int casas;
	
	//construtor
	public JogoTabuleiro(String nome, int numeroJogadores, String tipoTabuleiro, String jogadorUm, String jogadorDois) {
		super(nome, numeroJogadores);
		this.tipoTabuleiro = tipoTabuleiro;
		this.jogadorUm = jogadorUm;
		this.jogadorDois = jogadorDois;
	}
	
	
	public  void andarCasas() {
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