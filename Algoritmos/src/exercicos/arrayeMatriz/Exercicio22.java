package exercicos.arrayeMatriz;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
/*Crie um array de 5 posi��es com os valores 1, 3, 5, 7, 9. 
 * Pe�a para o usu�rio digitar um valor. 
 * Se o valor digitado pelo usu�rio estiver no array, imprima �Achei o valor�, 
 * caso contr�rio, n�o achei o valor. (o System.out.println deve estar fora do for).*/
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[5];
		array[0] = 1;
		array[1] = 3;
		array[2] = 5;
		array[3] = 7;
		array[4] = 9;
		int j;
		System.out.println("Digite um n�mero:");
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
			System.out.println("N�o achei o valor!");
		}
		scanner.close();
	}

}
