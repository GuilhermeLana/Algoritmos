package exercicos.arrayeMatriz;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
/*Crie um array com 10 posi��es e pe�a para o usu�rio digitar um n�mero 
 * e colocar este n�mero no array. Enquanto o array n�o tiver chego no final 
 * dever� sempre perguntar para o usu�rio um pr�ximo n�mero e inserir no array. 
 * Dever� ser utilizar while ou for.*/
		int array[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite um n�mero");
			array[i] = scanner.nextInt();
		}
		scanner.close();
	}

}
