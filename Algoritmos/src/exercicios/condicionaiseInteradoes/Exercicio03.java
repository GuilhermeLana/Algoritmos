package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um n�mero:");
		num1 = scanner.nextInt();
		int num2;
		System.out.println("Digite um n�mero:");
		num2 = scanner.nextInt();
		int resul = num1 * num2;
		if(resul % 5 == 0){
			System.out.println("O resultado � m�ltiplo de 5!");
		}
		else{
			System.out.println("O resultado n�o foi o esperado!");
		}
		System.out.println("O resultado da multiplica��o �: " + resul);
		scanner.close();
	}

}
