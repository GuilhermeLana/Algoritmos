package exercicios.numero3;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Digite um n�mero:");
		num = scanner.nextInt();
		
		int sub1 = num - 5;
		System.out.println("O resulto da primera subtra��o �:" + sub1);
		int sub2 = num - 3;
		System.out.println("O resulto da segunda subtra��o �:" + sub2);
		
		scanner.close();
	}

}
