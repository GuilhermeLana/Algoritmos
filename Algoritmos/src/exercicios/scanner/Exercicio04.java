package exercicios.scanner;

import java.util.Scanner;

public class Exercicio04 {
/*Escreva no console para digitar um número inteiro, 
 * leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, 
 * leia o número inteiro digitado. 
 * Imprima no console true se o primeiro número é maior que o segundo número digitado.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um número inteiro:");
		num1 = scanner.nextInt();
		
		int num2;
		System.out.println("Digite outro número inteiro:");
		num2 = scanner.nextInt();
		
		boolean resul;
		if(num1 > num2){
			resul = true;
			System.out.println(resul);
		}
		else{
			resul = false;
			System.out.println(resul);
		}
		scanner.close();
	}

}
