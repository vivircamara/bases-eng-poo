package atividade3.exercicio2;

public class Retangulo {
	
	private int comprimento;
	private int largura;
	
	public Retangulo(int comprimento, int largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public int getComprimento() {
		return comprimento;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public void exibirDados() {
		System.out.println(largura);
		System.out.println(comprimento);
	}
	
	
}

/*2 - Escreva um programa em Java para criar uma classe chamada Retangulo com
as variáveis de instância privadas comprimento e largura. Forneça métodos
públicos getter e setter para acessar e modificar essas variáveis.*/