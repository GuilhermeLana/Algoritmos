package exercicios.numero3;

import java.util.Scanner;

public class Exercicio01 {
/*Escreva no console para digitar um número inteiro, 
 * leia o número inteiro digitado e imprima o número no console.
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Digite um número inteiro:");
		num = scanner.nextInt();
		System.out.println(num);
		scanner.close();
	}
}
