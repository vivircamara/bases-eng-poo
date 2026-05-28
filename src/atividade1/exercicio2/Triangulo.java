package atividade1.exercicio2;

public class Triangulo {
	
	int lado1;
	int lado2;
	int lado3;
	
	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public void exibirTriangulo() {
		System.out.printf("Lados do seu triângulo: %d, %d, %d ", lado1, lado2, lado3);	
	}
	
	public void classificarTriangulo() {
		if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
			System.out.println("Seu triângulo é equilátero");
			exibirTriangulo();
		} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
			System.out.println("Seu triângulo é isósceles");
			exibirTriangulo();
		} else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
			System.out.println("Seu triângulo é escaleno");
			exibirTriangulo();
		}
	}
	
	public boolean verificarTriangulo() {
		int soma1 = lado1 + lado2;
		int soma2 = lado2 + lado3;
		int soma3 = lado3 + lado1;
		
		if(soma1 <= lado3) {
			System.out.println("Esse triângulo não existe, tente novamente");
			return false;
		} else if (soma2 <= lado1) {
			System.out.println("Esse triângulo não existe, tente novamente");
			return false;
		} else if(soma3 <= lado2 ) {
			System.out.println("Esse triângulo não existe, tente novamente");
			return false;
		} else {
			classificarTriangulo();
			return true;
		}
	}	
}

/*• Triângulo Equilátero: três lados iguais;
• Triângulo Isósceles: quaisquer dois lados iguais;
• Triângulo Escaleno: três lados diferentes;*/
/*  (IF)• Três lados formam um triângulo quando a soma de quaisquer dois lados for maior
que o terceiro;*/

