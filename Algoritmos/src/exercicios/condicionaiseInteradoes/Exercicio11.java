package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um n�mero:");
		num1 = scanner.nextInt();
		int num2;
		System.out.println("Digite outro n�mero:");
		num2 = scanner.nextInt();
		int num3;
		System.out.println("Digite outro n�mero:");
		num3 = scanner.nextInt();
		int maior;
		if(num1 > num2 & num1 > num3){
			maior = num1;
		} else if(num2 > num3){
				maior = num2;
			} else {
				maior = num3;
			}
		System.out.println("O maior n�mero � " + maior);
		scanner.close();
		
	}

}
