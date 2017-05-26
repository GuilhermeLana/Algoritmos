package exercicios.scanner;

import java.util.Scanner;

public class Exercicio07 {
/*Escreva no console para digitar um número inteiro, 
 * leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, 
 * leia o número inteiro digitado. 
 * Imprima no console true se o resultado da divisão dos dois número é par, 
 * e false caso o resultado da divisão seja ímpar.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um número inteiro:");
		num1 = scanner.nextInt();
		
		int num2;
		System.out.println("Digite outro número inteiro:");
		num2 = scanner.nextInt();
		
		double div = num1 / num2;
		boolean resul;
		if(div % 2 == 0){
			resul = true;
			System.out.println(resul);
		}
		else{
			resul = false;
			System.out.println(resul);
		
		scanner.close();
	    } 

   }
}
