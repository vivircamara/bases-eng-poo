package atividade4.exercicio3;

public class ProdutoEstadual extends Produto{
	//atributos
	//double imposto;
	//Como fazer para determinar sem usar o construtor o valor do imposto, mesmo usando extends?
	public ProdutoEstadual(String descricao, int valor) {
		super(descricao, valor);
		
		//this.imposto = 10; <-- como faço isso funcionar?
	}
	
	//não é necessário reescrever e usar override para códigos exatamente iguais
	
	/*public double calcularPreco() {
		double preco;
		preco = valor * (1 + (IMPOSTO / 100));
		return preco;
	}*/
	
	@Override 
	public void exibirInformacoes() {
		super.exibirInformacoes();
		//System.out.printf("Imposto (%): %.0f \n", imposto);
		System.out.printf("Preço: %.0f reais",  calcularPreco());
	}
	
	
}
 /*• Estadual: descricao, valor, imposto;
• Nacional: descricao, valor, imposto, taxa;
• Importado: descricao, valor, imposto, taxa, taxaImportacao;
O imposto do produto estadual é de 10%. 
O imposto do produto nacional é de 10% e taxa de 5%.
 O imposto do produto importado é de 10%, taxa de 5% e taxa de importação de 5%.
 Desenvolva o sistema com base nas informações passadas para apresentar o
valor final do produto.*/

/*O imposto do produto estadual é de 10%. 
O imposto do produto nacional é de 10% e taxa de 5%.
 O imposto do produto importado é de 10%, taxa de 5% e taxa de importação de 5%.
 Desenvolva o sistema com base nas informações passadas para apresentar o
valor final do produto.*/
