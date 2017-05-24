package exercicios.numero3;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		System.out.println("Digite seu nome:");
		nome = scanner.nextLine();
		
		if(nome.length() > 50){
			System.out.println(false);
		}
		else{
			System.out.println(true);
		}
		scanner.close();
	}

}
