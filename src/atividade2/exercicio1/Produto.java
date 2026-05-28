package atividade2.exercicio1;

public class Produto {
	
	String nome;
	int preco;
	int qtd;
	int valorEstoque;
	
	public Produto(String nome,	int preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public void exibirDados() {
		int valorEstoque = preco * qtd;
		
		System.out.printf("item: %s\n", nome);
		System.out.println("preço: R$" + preco);
		System.out.println("quantidade: " + qtd);
		System.out.println("valor total no estoque: " + valorEstoque + " reais\n");
	}
	
	public void entradaEstoque(int entrada) {
		qtd = qtd + entrada;
		System.out.printf("Entrada realizada, +%d do seguinte ", entrada);
		exibirDados();
	}
	public void saidaEstoque(int saida) {
		if(saida > qtd) {
			System.out.println("Estoque insuficiente para retirar essa quantidade.\n");
		}else {
			qtd = qtd - saida;
			System.out.printf("Saída realizada, -%d do seguinte ", saida);
			exibirDados();
		}
	}

}
