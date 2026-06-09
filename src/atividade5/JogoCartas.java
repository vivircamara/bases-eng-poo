package atividade5;

public class JogoCartas extends Jogo {
	//atributo
	private String tipoBaralho;
	
	//construtor da classe
	public JogoCartas(String nome, int numeroJogadores, String tipoBaralho) {
		super(nome, numeroJogadores);
		this.tipoBaralho = tipoBaralho;
	}
	
	//consumir os métodos concretos e abstratos
	@Override
	public void iniciar() {
		//comportamento específico
		System.out.println("Jogo de Cartas: " + super.nome);
		//lógica de negócio
	}
	
	@Override
	public void exibirRegras() {
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
● Validação da quantidade mínima e máxima de jogadores;
● Simulação de distribuição de cartas para os jogadores;
● Definição automática da quantidade de cartas por jogador;
● Exibição do nome do vencedor de uma rodada (pode ser aleatório);
● Exibição do total de cartas restantes no baralho.
*/