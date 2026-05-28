package atividade4.exercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ProdutoEstadual novoProdutoEstadual = new ProdutoEstadual("Estadual", 20);
		//ProdutoNacional novoProdutoNacional = new ProdutoNacional("Nacional", 20);
		ProdutoImportado novoProdutoImportado = new ProdutoImportado("Importado", 20);
		//Produto novoProduto = new Produto();
		
		//novoProdutoEstadual.exibirInformacoes();
		//novoProdutoNacional.exibirInformacoes();
		novoProdutoImportado.exibirInformacoes();
		//novoProduto.exibirInformacoes();
	}

}

/*Exercício 3 – Tipos de produtos: Construa um sistema que gerencia três tipos de
produtos, que são vendidos em três níveis: Estadual, Nacional e Importado. % 
Cada um possui um tipo diferente de tributação e taxas, as quais deverão ser levadas em conta
para calcular o valor final do produto. Considere que o produto estadual, o produto
nacional e o produto importado são do tipo produto, que seria a classe de mais alto nível
(mais geral).
Os atributos são:
• Estadual: descricao, valor, imposto;
• Nacional: descricao, valor, imposto, taxa;
• Importado: descricao, valor, imposto, taxa, taxaImportacao;
O imposto do produto estadual é de 10%. 
O imposto do produto nacional é de 10% e taxa de 5%.
 O imposto do produto importado é de 10%, taxa de 5% e taxa de importação de 5%.
 Desenvolva o sistema com base nas informações passadas para apresentar o
valor final do produto.*/