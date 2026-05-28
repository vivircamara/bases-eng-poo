package atividade4.exercicio2;

public class Peca {
	//atributos
	String nome;
	float custo; 
	float lucro; 
	
	public Peca(String nome, float custo, float lucro) {
		this.nome = nome;
		this.custo = custo;
		this.lucro = lucro;
	}
	
	public float calcularPreco() {
		//float preco;
		
		float preco = custo + lucro;
		return preco;
	}
	
	public void exibirInformacoes() {
		System.out.println("nome da peça: " +  nome);
		//System.out.printf("custo: %.2f ", custo);
		//System.out.printf("lucro: %.2f", lucro);
		System.out.printf("preço: %.2f \n", calcularPreco());


	}


}

/*Classe: Peca
--------------------------------
Atributos:
- nome : String
- custo : float
- lucro : float

Métodos:
-Peca()
- Peca(String nome, float custo, float lucro)
- calcularPreco() : float
- exibir()
*/


