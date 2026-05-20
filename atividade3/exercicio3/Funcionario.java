package exercicio3;
public class Funcionario {
	
	private int idFuncionario;
	private int salarioFuncionario;
	private String nomeFuncionario;
	
	public Funcionario(int idFuncionario, String nomeFuncionario) {
		
		this.idFuncionario = idFuncionario;
		//this.salarioFuncionario = salarioFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		
	}
	
	public void exibirInformacoes() {
		System.out.println(idFuncionario);
		System.out.println(salarioFuncionario);
		System.out.println(nomeFuncionario);
	}
	
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	
	public String getSalarioFuncionario() {
		return String.format("%03d", salarioFuncionario);
	}
}
/*3 - Escreva um programa em Java para criar uma classe chamada Funcionario com
as variáveis de instância privadas idFuncionario, nomeFuncionario e
salarioFuncionario. Forneça métodos públicos getter e setter para acessar e
modificar as variáveis id e nome, mas forneça apenas um método getter para a
variável salario, que deve retornar uma string formatada.*/

