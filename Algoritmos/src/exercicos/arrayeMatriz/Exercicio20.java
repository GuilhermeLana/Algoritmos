package exercicos.arrayeMatriz;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
/*Crie um array int com 3 posi��es e pe�a para o usu�rio digitar um valor, 
 * e insira o valor na primeira posi��o do array, 
 * pe�a para o usu�rio digitar outro valor e insira o valor na segunda posi��o do array, 
 * pe�a para o usu�rio digitar outro valor e insira o valor terceira prosi��o do array.*/
		int array[] = new int[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite um n�mero");
			array[i] = scanner.nextInt();
		}
		scanner.close();
	}

}
