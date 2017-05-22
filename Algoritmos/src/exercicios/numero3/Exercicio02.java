package exercicios.numero3;

import java.util.Scanner;

public class Exercicio02 {
/*Escreva no console para digitar um texto, 
 * leia o texto digitado e imprima o texto no console.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String texto;
		System.out.println("Digite um texto:");
		texto = scanner.nextLine();
		System.out.println(texto);
		scanner.close();
		
	}

}
