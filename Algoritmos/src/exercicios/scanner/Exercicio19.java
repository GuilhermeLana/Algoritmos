package exercicios.scanner;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int primeironumero;
		System.out.println("Digite um n�mero:");
		primeironumero = scanner.nextInt();
		
		int segundonumero = primeironumero;
		primeironumero = 10;
		System.out.println("O primeiro n�mero �:" + primeironumero
				+ "\nO segundo n�mero �:" + segundonumero);
		scanner.close();
	}

}
