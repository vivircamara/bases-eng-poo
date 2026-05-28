package atividade4.exercicio3;

public class Produto {
	//atributos
	
	String descricao;
	int valor;
	protected static  final  double  IMPOSTO = 10;
	protected static  final  double TAXA = 5;
	protected static  final  double TAXA_IMPORTADA = 5;

	
	
	//String descricao, int valor, float imposto
	
	public Produto(String descricao, int valor) {
		this.descricao = descricao ;
		this.valor = valor;
		//this.imposto = IMPOSTO;; 
	}
	
	public double calcularPreco() {
		double preco;
		preco = valor * (1 + (IMPOSTO / 100));
		return preco;
	}
	
	public double calcularPrecoTaxa() {
		double preco = calcularPreco();
		double precoTaxa = preco * (1 + (TAXA / 100));
		return precoTaxa;
	}
	
	public double calcularPrecoImportado() {
		double precoTaxa = calcularPrecoTaxa();
		double precoImportado = precoTaxa * (1 + (TAXA / 100));
		return precoImportado;
	}
	
	public void exibirInformacoes() {
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.printf("Imposto: %.2f \n", IMPOSTO);
		//System.out.printf("Preço: %.0f reais",  calcularPreco());
		//System.out.printf("Preço: %.0f reais",  calcularPrecoTaxa());

	}
	
	
}
