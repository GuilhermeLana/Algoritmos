package exercicios.scanner;

import java.util.Scanner;

public class Exercicio07 {
/*Escreva no console para digitar um n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Imprima no console true se o resultado da divis�o dos dois n�mero � par, 
 * e false caso o resultado da divis�o seja �mpar.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um n�mero inteiro:");
		num1 = scanner.nextInt();
		
		int num2;
		System.out.println("Digite outro n�mero inteiro:");
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
