package atividade4.exercicio3;

public class ProdutoImportado extends Produto{
	public ProdutoImportado(String descricao, int valor) {
		super(descricao, valor);
	}
	
	@Override 
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.printf("Taxa: %.0f\n", TAXA + TAXA);
		System.out.printf("Preço: %.0f reais",  calcularPrecoImportado());

	}
}
