package atividade1.exercicio1;

public class Salario {

	double bonificacao;

	double antigoSalario;

	double novoSalario;

	double bonus; 

	int tempoServico;

	//int liquidoBonus;

	

	public Salario(int tempoServico, double antigoSalario) {

		// TODO Auto-generated constructor stub

		//this.bonificacao = bonificacao;

		this.tempoServico = tempoServico;

		//this.antigoSalario = antigoSalario;

		this.antigoSalario = antigoSalario;

		//this.bonus = bonus;

		

	}

	

	//int bonificacao,	int tempoServico, int antigoSalario, int novoSalario, int bonus

	

	

	void bonificar() {

		if(tempoServico > 5) {

			bonificacao = 0.05;

			novoSalario = antigoSalario * (1 + bonificacao);

		}else {

			bonificacao = 0.013;

			novoSalario = antigoSalario * (1 + bonificacao);

		}

		bonus = antigoSalario * bonificacao;

	}





	void exibirInformacoes() {

		//System.out.println(bonificacao);

		//formatado

		//System.out.println(String.format("%.2f", valor));

		System.out.println(String.format("Antigo salário: %.0f reais",  antigoSalario));

		System.out.println(String.format("Novo salário: %.0f reais",  novoSalario));

		System.out.println(String.format("Valor líquido do bônus: %.0f reais", bonus));

		System.out.println("Tempo de serviço: " + tempoServico + " anos");

	

	}

}



// como fazer para imprimir o valor líquido do bônus?



/*1 - Crie um programa para adicionar uma bonificação de 5% ao seu funcionário se o seu

tempo de serviço for superior a 5 anos. Caso contrário, o funcionário receberá apenas

uma bonificação de 1.3%. Ao final, imprima o antigo salário, valor líquido do bônus, novo

salário e o tempo de serviço do funcionário.

*/

