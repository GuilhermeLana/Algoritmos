package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Digite um número:");
		num = scanner.nextInt();
		if(num % 2 == 1){
			System.out.println("O número é impar");
		}
		else{
			System.out.println("O número é par");
			scanner.close();
		}
	}

}
