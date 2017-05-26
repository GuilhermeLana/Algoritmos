package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um número:");
		num1 = scanner.nextInt();
		int num2;
		System.out.println("Digite um número:");
		num2 = scanner.nextInt();
		if(num1 % 7 == 0 & num2 % 7 == 0){
			System.out.println("os dois números são múltiplos de 7");
		}
		else{
			System.out.println("os dois números não são múltiplos de 7");
		}
		scanner.close();
	}

}
