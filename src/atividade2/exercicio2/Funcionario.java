package atividade2.exercicio2;

public class Funcionario {
	
	String nome;
	int salarioAntigo;
	
	public Funcionario(String nome,	int salario) {
		this.nome = nome;
		this.salarioAntigo = salario;
	}
	
	public double concederSalario() {
		double salarioNovo;
		if(1 < salarioAntigo && salarioAntigo <= 1000 ) {
			 salarioNovo = salarioAntigo * 1.15;
			 return salarioNovo;
		}
		if(1000 < salarioAntigo && salarioAntigo <= 1500 ) {
			 salarioNovo = salarioAntigo * 1.10;
			 return salarioNovo;
		}
		if(1500 < salarioAntigo && salarioAntigo <= 2000 ) {
			 salarioNovo = salarioAntigo * 1.05;
			 return salarioNovo;
		}
		return 0;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Salário antigo: " + salarioAntigo);
		System.out.printf("Salário novo: %.0f", concederSalario());

	}
}

/*Se o salário do funcionário estiver entre 1 e 1000, aplique um aumento de 15%; 
•	Se o salário do funcionário estiver entre 1001 e 1500, aplique um aumento de 10%; 
•	Se o salário do funcionário estiver entre 1501 e 2000, aplique um aumento de 5%. */