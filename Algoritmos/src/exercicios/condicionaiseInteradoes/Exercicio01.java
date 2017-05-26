package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Digite um número:");
		num = scanner.nextInt();
		if(num > 10){
			System.out.println("o valor digitado é maior que 10");
		}
		else{
			System.out.println("o valor digitado é menor que 10");
		}
		scanner.close();
	}

}
