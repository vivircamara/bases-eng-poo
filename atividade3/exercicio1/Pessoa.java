package exercicio1;



//import java.util.Scanner;



public class Pessoa {

	//Scanner scanner = new Scanner(System.in);	

	

	private  String  nome;

	private String pais;

	private int idade;	

	





 

	

	

	public Pessoa(String nome, String pais, int idade) {

		

		this.nome = nome;

		this.pais = pais;

		this.idade = idade;

	}

	

		public void exibirDados() {

		System.out.println(nome);

		System.out.println(pais);

		System.out.println(idade);

	}

		





	

	public String getNome() {

		return this.nome;

	}

	

	public String getPais() {

		return this.pais;

	}

	

	public int getIdade() {

		return this.idade;

	}

	

	public void setNome(String nome) {

		this.nome = nome;

	}

	

	public void setPais(String pais) {

		this.pais = pais;

	}

	

	public void setIdade(int idade) {

		this.idade = idade;

	}

}

