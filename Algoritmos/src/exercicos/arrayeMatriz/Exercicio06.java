package exercicos.arrayeMatriz;

import java.util.Arrays;

public class Exercicio06 {
	public static void main(String[] args) {
		//Criar um array do tipo int, com valores de 0 à 5.
		int numeros[] = new int[6];
		numeros[0] = 0;
		numeros[1] = 1;
		numeros[2] = 2;
		numeros[3] = 3;
		numeros[4] = 4;
		numeros[5] = 5;
		
		//a.	Imprimir todos os valores do array
		System.out.println("Item A");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		//b.	Imprimir todos os valores do array de forma decrescente
		System.out.println("\nItem B");
		Arrays.sort(numeros);
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}

}
