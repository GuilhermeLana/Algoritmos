package exercicios.numero3;

import java.util.Scanner;

public class Exercicio05 {
/*Escreva no console para digitar um n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, 
 * leia o n�mero inteiro digitado. 
 * Imprima no console true se o resultado do primeiro n�mero menos o segundo n�mero 
 * � maior que 0 e false caso for menor igual a 0.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um n�mero inteiro:");
		num1 = scanner.nextInt();
		
		int num2;
		System.out.println("Digite outro n�mero inteiro:");
		num2 = scanner.nextInt();
		
		boolean resul;
		if(num1 - num2 > 0){
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
