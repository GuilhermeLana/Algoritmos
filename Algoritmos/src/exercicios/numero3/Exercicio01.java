package exercicios.numero3;

import java.util.Scanner;

public class Exercicio01 {
/*Escreva no console para digitar um n�mero inteiro, 
 * leia o n�mero inteiro digitado e imprima o n�mero no console.
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Digite um n�mero inteiro:");
		num = scanner.nextInt();
		System.out.println(num);
		scanner.close();
	}
}
