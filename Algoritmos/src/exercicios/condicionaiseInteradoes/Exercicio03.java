package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um número:");
		num1 = scanner.nextInt();
		int num2;
		System.out.println("Digite um número:");
		num2 = scanner.nextInt();
		int resul = num1 * num2;
		if(resul % 5 == 0){
			System.out.println("O resultado é múltiplo de 5!");
		}
		else{
			System.out.println("O resultado não foi o esperado!");
		}
		System.out.println("O resultado da multiplicação é: " + resul);
		scanner.close();
	}

}
