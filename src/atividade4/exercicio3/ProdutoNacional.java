package atividade4.exercicio3;

public class ProdutoNacional extends Produto {
	//ATRIBUTOS 
	//double imposto;
	//protected static  final  double TAXA = 5;
	//Como fazer para determinar sem usar o construtor o valor do imposto, mesmo usando extends?
	public ProdutoNacional(String descricao, int valor) {
		super(descricao, valor);
		//this.imposto = 10;
		//this.taxa = 5;
		
		//this.imposto = 10; <-- como faço isso funcionar?
	}
	
	
	
	@Override 
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.printf("Taxa: %.0f\n ", TAXA);
		System.out.printf("Preço: %.0f reais",  calcularPrecoTaxa());



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

