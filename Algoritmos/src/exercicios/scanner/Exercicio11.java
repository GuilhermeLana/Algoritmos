package exercicios.scanner;

import java.util.Scanner;

public class Exercicio11 {
/*Escreva no console para digitar um n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Imprima no console o resto do primeiro n�mero digitado com o segundo n�mero digitado, 
 * o multiplicando por 10.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um n�mero inteiro:");
		num1 = scanner.nextInt();
		
		int num2;
		System.out.println("Digite outro n�mero inteiro:");
		num2 = scanner.nextInt();
		
		int resul = (num1 % num2) * 10;
		System.out.println(resul);
		
		scanner.close();
	}

}
