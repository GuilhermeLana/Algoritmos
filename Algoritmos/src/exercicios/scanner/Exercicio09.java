package exercicios.scanner;

import java.util.Scanner;

public class Exercicio09 {
/*Escreva no console para digitar um n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Imprima no console true se o primeiro n�mero � menor igual a zero 
 * ou o segundo n�mero � maior que 10. Caso contr�rio imprima false. */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um n�mero inteiro:");
		num1 = scanner.nextInt();
		
		int num2;
		System.out.println("Digite outro n�mero inteiro:");
		num2 = scanner.nextInt();
		
		boolean resul;
		if(num1 <= 0 | num2 > 10){
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
