package atividade4.exercicio2;

public class PecaImportada extends Peca{
	//Atributos
	
	float taxaImportacao;
	float taxaFrete;
	
	public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete) {
		super(nome,  custo, lucro);
		this.taxaImportacao = taxaImportacao;
		this.taxaFrete = taxaFrete;
		
	}
	
	@Override
	public float calcularPreco() {
		//float preco;
		
		float preco = taxaImportacao + taxaFrete + custo + lucro;
		return preco;
	}	
	
	//Como posso fazer para reaproveitar o método calcular preco e a variavel preco no novo metodo calcular preco taxa? assim --> 
	//float precoTaxa = taxaImportacao + taxaFrete + preco
	
	/*public float calcularPrecoTaxa() {
		//float preco;
		
		float precoTaxa = taxaImportacao + taxaFrete + preco;
		return precoTaxa;
	}*/
	
	@Override
	public void exibirInformacoes() {
		System.out.println("nome da peça: " +  nome);
		System.out.printf("preço: %.2f ", calcularPreco());
	}

}

/*
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