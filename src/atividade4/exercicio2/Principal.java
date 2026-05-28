package atividade4.exercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Peca novaPeca = new Peca("peca1", 20, 10);
		PecaImportada novaPecaImportada = new PecaImportada("peca importada", 20, 10, 5, 3);
		
		novaPeca.exibirInformacoes();
		novaPecaImportada.exibirInformacoes();
		

	}
	//O preço da peça na superclasse é calculado pela soma do custo com o lucro. Enquanto,
	//o preço da peça na subclasse é calculado a partir da soma das taxas ao preço base da
	//peça.
}

/*Exercício 2 – Sistema de Peças: Elabore um sistema que represente peças utilizadas
para montar equipamentos eletrônicos, como computadores por exemplo. Tome como
base o diagrama de classes a seguir:%

O preço da peça na superclasse é calculado pela soma do custo com o lucro. %
 Enquanto,o preço da peça na subclasse é calculado a partir da soma das taxas ao preço base da
peça.
A partir das informações acima, você deverá primeiro identificar a superclasse,
subclasse, os atributos, métodos e assim desenvolver o sistema.
 */

//diagrama

/*Classe: Peca
--------------------------------
Atributos:
- nome : String
- custo : float
- lucro : float

Métodos:
Peca()
- Peca(String nome, float custo, float lucro)
- calcularPreco() : float
- exibir()
                ↑ HERANÇA

Classe: PecaImportada
--------------------------------
Atributos:
- taxaImportacao : float
- taxaFrete : float

Métodos:
- PecaImportada()
- PecaImportada(String nome, float custo, float lucro,
                float taxaImportacao, float taxaFrete)

- calcularPreco() : float
- exibir()*/

