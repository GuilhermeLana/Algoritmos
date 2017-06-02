package exercicos.arrayeMatriz;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
	/*Crie um array de 6 posições com os valores 1, 2, 3, 4, 5, 6. 
	 * Percorra o array procurando um valor par, se encontado deve ser 
	 * perguntado para o usuário um novo valor para substituir o valor presente no array*/
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[6];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0){
				System.out.println("Digite um número:");
				array[i] = scanner.nextInt();
			}
		}
		scanner.close();
	}

}
