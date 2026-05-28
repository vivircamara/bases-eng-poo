package atividade1.exercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imc novoImc = new Imc(120, 1.60);
		novoImc.exibirImc();
	}

}

/*3 - Faça um programa para determinar o Índice de Massa Corporal (IMC) de uma pessoa.
O seu programa deve informar a classificação do IMC de acordo com a seguinte tabela:
INFORMAÇÕES DA TABELA

 IMC < 16
-> Magreza grave%

IMC 16 a < 17
-> Magreza moderada%

IMC 17 a < 18,5
-> Magreza leve%

IMC 18,5 a < 25
-> Saudável%

IMC 25 a < 30
-> Sobrepeso%

IMC 30 a < 35
-> Obesidade Grau I%

IMC 35 a < 40
-> Obesidade Grau II (severa)%

IMC ≥ 40
-> Obesidade Grau III (mórbida)
*/
 
//imc = peso / (altura * altura)
//O Índice de Massa Corporal (IMC) calcula-se dividindo o seu peso (em kg) pela sua altura elevada ao quadrado (em metros)