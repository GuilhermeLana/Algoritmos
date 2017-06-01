package exercicos.arrayeMatriz;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
/*Crie um array de 5 posições com os valores 1, 3, 5, 7, 9. 
 * Peça para o usuário digitar um valor. 
 * Se o valor digitado pelo usuário estiver no array, imprima “Achei o valor”, 
 * caso contrário, não achei o valor. (o System.out.println deve estar fora do for).*/
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[5];
		array[0] = 1;
		array[1] = 3;
		array[2] = 5;
		array[3] = 7;
		array[4] = 9;
		int j;
		System.out.println("Digite um número:");
		j = scanner.nextInt();
		boolean verif = false;
		for (int i = 0; i < array.length; i++) {
			if(j == array[i]){
				verif = true;
			}
		}
		if(verif == true){
			System.out.println("Achei o valor!");
		} else {
			System.out.println("Não achei o valor!");
		}
		scanner.close();
	}

}
