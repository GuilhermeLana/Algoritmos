package exercicios.scanner;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Digite um número:");
		num = scanner.nextInt();
		
		int soma1 = num + 5;
		System.out.println("O resulto da primera soma é:" + soma1);
		int soma2 = soma1 + 5;
		System.out.println("O resulto da segunda soma é:" + soma2);
		
		scanner.close();	
	}
	
	

}
