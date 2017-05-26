package exercicios.scanner;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int primeironumero;
		System.out.println("Digite um número:");
		primeironumero = scanner.nextInt();
		
		int segundonumero = primeironumero;
		primeironumero = 10;
		System.out.println("O primeiro número é:" + primeironumero
				+ "\nO segundo número é:" + segundonumero);
		scanner.close();
	}

}
