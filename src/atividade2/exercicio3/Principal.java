package atividade2.exercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo trianguloX = new Triangulo("X", 3, 4, 5);
		Triangulo trianguloY = new Triangulo("Y", 5, 5, 6);
		
		trianguloX.exibirInformacoes();
		trianguloY.exibirInformacoes();
		
		double area1 = trianguloX.calcularMedidas();
		double area2 = trianguloY.calcularMedidas();

		
		if(area1 > area2) {
			System.out.println("Triângulo X é maior");
		}else {
			System.out.println("Triângulo Y é maior");
		}
		
		//como criar um método para definir o maior? ou teria que ser na main de qq forma?
	}

}

/*3 – Crie um programa para ler as medidas dos lados de dois triângulos X e Y.
   Em seguida, apresente o valor das áreas dos dois triângulos 
 
 e informe qual dos triângulos possui a maior área. 
 

A fórmula para calcular a área do triângulo a partir das medidas de seus lados "a", "b" e "c" é a seguinte (fórmula de Heron): 
*/
// ----> Adicionar um scanner dps
//como criar um método para definir o maior? ou teria que ser na main de qq forma?