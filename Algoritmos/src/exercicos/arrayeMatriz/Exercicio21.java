package exercicos.arrayeMatriz;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
/*Crie um array com 10 posições e peça para o usuário digitar um número 
 * e colocar este número no array. Enquanto o array não tiver chego no final 
 * deverá sempre perguntar para o usuário um próximo número e inserir no array. 
 * Deverá ser utilizar while ou for.*/
		int array[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite um número");
			array[i] = scanner.nextInt();
		}
		scanner.close();
	}

}
