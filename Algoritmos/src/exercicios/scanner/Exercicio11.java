package exercicios.scanner;

import java.util.Scanner;

public class Exercicio11 {
/*Escreva no console para digitar um número inteiro, 
 * leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, 
 * leia o número inteiro digitado. 
 * Imprima no console o resto do primeiro número digitado com o segundo número digitado, 
 * o multiplicando por 10.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um número inteiro:");
		num1 = scanner.nextInt();
		
		int num2;
		System.out.println("Digite outro número inteiro:");
		num2 = scanner.nextInt();
		
		int resul = (num1 % num2) * 10;
		System.out.println(resul);
		
		scanner.close();
	}

}
