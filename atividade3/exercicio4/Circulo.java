package exercicio4;

public class Circulo {
	
	private int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	public double calcularArea(){
		//double area;
		double pi = 3.14;
		return  pi * Math.pow(raio, 2);
	}
	
	public double calcularPerimetro(){
		//double area;
		double pi = 3.14;
		return  2 * pi * raio;
	}
	
	public void imprimirFormulas() {
		System.out.printf("Área do círculo: %.2f\n", calcularArea());
		System.out.printf("Perímetro do círculo: %.2f\n",calcularPerimetro());

	}
}

// area do circulo = pi* (r ^ 2)
//perimetro do circulo = 2 * pi * r

/*4 - Escreva um programa em Java para criar uma classe chamada Circulo com uma
variável de instância privada raio. Forneça métodos públicos getter e setter para
acessar e modificar a variável raio. Além disso, implemente dois métodos
chamados calcularArea() e calcularPerimetro(), que retornem a área e o perímetro
calculados com base no valor atual do raio.*/