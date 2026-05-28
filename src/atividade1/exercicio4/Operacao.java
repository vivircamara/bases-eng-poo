package atividade1.exercicio4;

public class Operacao {
	
	double valor1;
	double valor2;
	int escolha;
	double resultado;
	
	public Operacao(double valor1, double valor2, int escolha) {
		this.escolha = escolha;
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	//Escolha entre 1(somar), 2(subtrair), 3(multiplicar) 4(dividir):"
	//O que é melhor? deixar o construtor vazio e passar as variaveis para o metodo? ou Constuir o objeto e depois reutilizar
	//as variaveis dentro do metodo?
	
	public double realizarOperacao() {
		//System.out.println("Escolha: " + escolha);
		if(escolha == 1) {
			resultado = valor1 + valor2;
			return resultado;
		} else if (escolha == 2) {
			resultado = valor1 - valor2;
			return resultado;
		} else if (escolha == 3) {
			resultado = valor1 * valor2;
			return resultado;			
		} else if (escolha == 4) {
			resultado = valor1 / valor2;
			return resultado;			
		} else {
			System.out.println("Digite um valor válido");
			return 0;
		} //Como fazer o tratamento de erros?
	}
	
	
	public void mostrarResultado() {
		System.out.println(realizarOperacao());
		
	}
}
