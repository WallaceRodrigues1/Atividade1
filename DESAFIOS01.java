package aula3;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args ) {
		Scanner imput = new Scanner(System.in);
				
		System.out.print("Digite o nome da pessoa: ");
		
		String nome = imput.nextLine();
		
		System.out.print("Digite o signo de: ");
		
		String signo = imput.nextLine();
		
		System.out.print("Digite a idade de: ");
		
		int idade = imput.nextInt();
		
		System.out.print("O " + nome + " Com signo de " + signo + " Tem " + idade + " anos.");
			imput.close();
	
	}

}
