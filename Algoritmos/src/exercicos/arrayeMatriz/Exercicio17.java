package exercicos.arrayeMatriz;

public class Exercicio17 {
	public static void main(String[] args) {
		/*Criar um array com 10 posições, com valores de 1 a 10 sequenciais. 
		 * Criar um array de 5 posições. Popular o segundo array somente com os 
		 * valores ímpares do primeiro array utilizando for. 
		 * Imprimir o segundo array para verificar se o algoritmo funcionou.*/
		int array1[] = new int[10];
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;
		array1[5] = 6;
		array1[6] = 7;
		array1[7] = 8;
		array1[8] = 9;
		array1[9] = 10;
		int array2[] = new int[5];
		int j = 0;
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] % 2 != 0){
				array2[j] = array1[i];
				System.out.println(array2[j]);
				j++;
			}
		}
	}

}
