package atividade2.exercicio3;

public class Triangulo {
	 String titulo;
	 int a;
	 int b;
	 int c;
	 
	 
	 public Triangulo( String titulo, int lado1, int lado2, int lado3) {
		 this.titulo = titulo;
		 this.a = lado1;
		 this.b = lado2;
		 this.c = lado3;				 
	 }
	 
	 public double calcularMedidas() {
		 double p = (a  + b + c) / 2;
		 double radicando = p * (p - a)  * (p - b) * (p -c);
		 double area = Math.sqrt(radicando);
		 return area;
	 }
	 
	 public void exibirInformacoes() {
		 System.out.println("Triângulo " + titulo);
		 System.out.printf("Área do triângulo: %.0fu²\n", calcularMedidas());
	 }
}
