package atividade1.exercicio3;

public class Imc {
	int peso;
	double altura;
	double imc;
	
	public Imc(int peso, double altura) {
		this.peso = peso;
		this.altura  = altura;
		this.imc = peso / (altura * altura);
	}
	
	public void classificarImc() {
		if(imc < 16) {
			System.out.println("Classificação do IMC: Magreza grave");
		} else if(imc < 17) {
			System.out.println("Classificação do IMC: Magreza moderada");
		} else if(imc < 18.5) {
			System.out.println("Classificação do IMC: Magreza leve");
		} else if (imc < 25) {
			System.out.println("Classificação do IMC: Saudável");
		} else if (imc < 30) {
			System.out.println("Classificação do IMC: Sobrepeso");
		} else if (imc < 35) {
			System.out.println("Classificação do IMC: Obesidade Grau I");
		} else if (imc < 40) {
			System.out.println("Classificação do IMC: Obesidade Grau II (severa)");
		} else{
			System.out.println("Classificação do IMC: Obesidade Grau III (mórbida)");
		}		
	}
	
	public void exibirImc() {
		System.out.println("Seu peso: " + peso + "kg");
		System.out.printf("Sua altura: %.2fm\n",  altura);
		System.out.printf("Seu IMC: %.1f\n",  imc);
		classificarImc();
	}
	
}

/*
 IMC < 16
-> Magreza grave

IMC 16 a < 17
-> Magreza moderada

IMC 17 a < 18,5
-> Magreza leve

IMC 18,5 a < 25
-> Saudável

IMC 25 a < 30
-> Sobrepeso

IMC 30 a < 35
-> Obesidade Grau I

IMC 35 a < 40
-> Obesidade Grau II (severa)

IMC ≥ 40
-> Obesidade Grau III (mórbida)
*/
 