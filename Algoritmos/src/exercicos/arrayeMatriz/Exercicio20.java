package exercicos.arrayeMatriz;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
/*Crie um array int com 3 posições e peça para o usuário digitar um valor, 
 * e insira o valor na primeira posição do array, 
 * peça para o usuário digitar outro valor e insira o valor na segunda posição do array, 
 * peça para o usuário digitar outro valor e insira o valor terceira prosição do array.*/
		int array[] = new int[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite um número");
			array[i] = scanner.nextInt();
		}
		scanner.close();
	}

}
