package exercicos.arrayeMatriz;

public class Exercicio19 {
	public static void main(String[] args) {
/*Criar um array com os valores 1, 2, 3, 4, 5. 
 * Criar outro array com os valores 5, 4, 3, 2, 1. 
 * Utilizando for, imprimir em qual � as posi��es dos arrays que o valor � s�o iguais, 
 * conforme exemplo abaixo:
 * arrayA posi��o 0, arrayB posi��o 4 possuem o valor 1
 * arrayA posi��o 1, arrayB posi��o 3 possuem o valor 2*/
		int array1[] = new int[5];
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;
		int array2[] = new int[5];
		array2[0] = 5;
		array2[1] = 4;
		array2[2] = 3;
		array2[3] = 2;
		array2[4] = 1;
		for (int i = 0; i < array2.length; i++) {
			if(array1[i] == array2[i]){
				System.out.println("Array1 posi��o " + i + ", array2 posi��o " + i + " possuem o valor " + array1[i]);
			}
		}
	}

}
