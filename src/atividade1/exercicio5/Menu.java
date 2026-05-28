package atividade1.exercicio5;

public class Menu {
	
	int escolha;
	
	public Menu(int escolha) {
		this.escolha = escolha;
	}
	
	//Escolha entre: \n 1-Pizza\n 2- Hambúrguer\n 3-Salada 4-Bebida
	public void selecionarOpcao() {
		if(escolha == 1) {
			System.out.println("Você escolheu a pizza!");
			System.out.println("Descrição: pizza pronta para assar com muzzarela, presunto e tomate seco");
			System.out.println("Preço: 28 reais");
		}
		if(escolha == 2) {
			System.out.println("Você escolheu o hambúrguer!");
			System.out.println("Descrição: hambúrguer de microondas com pão tradicional, rodela de carne, queijo cheddar e molho");
			System.out.println("Preço: 12 reais");
		}
		if(escolha == 3) {
			System.out.println("Você escolheu a salada!");
			System.out.println("Descrição: salada fria com queijo prato, tomate cereja, frango desfiado, pão torrado, alface e rucúla");
			System.out.println("Preço: 6 reais");
		}
		if(escolha == 4) {
			System.out.println("Você escolheu a bebida!");
			System.out.println("Descrição: monster ou coca-cola zero (500ml)");
			System.out.println("Preço: 10 reais");
		}
	}
}
