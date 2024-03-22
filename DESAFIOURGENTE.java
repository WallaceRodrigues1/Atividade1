package Atividade4;
import java.util.Scanner;
public class Exercicio03{
	
	public static void main(String [] args ) {
		
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Solicite a idade: ");
	int idade = scanner.nextInt();
	
	System.out.println("Solicite a o batimento cardíaco: ");
	int batimento = scanner.nextInt();
	
	if( idade >= 60 && batimento >= 150) {
	
	System.out.println("URGENTE ");
	
	}
	else if (idade >= 60 && batimento <= 150) {
	
	System.out.println("Urgência moderada!");
	
	}if (idade <= 60 && batimento > 150) {
	
	System.out.println("Urgência moderada ");
	
    } if ( idade <= 60 && batimento <= 150) {
	
	System.out.println("Não urgente ");
	}
	
	
    
	 
scanner.close();
	
	
	
	
	}
}
