package exercicos.arrayeMatriz;

public class Exercicio18 {
	public static void main(String[] args) {
		/*Criar um array de 10 posições, e popular este array apenas com múltiplos de 10, 
		 * ou seja, na posição 0 deverá ter o valor 10, 
		 * na posição 1 o valor 20, e assim por diante.*/
		int array[] = new int[10];
		int i = 10;
		for (int j = 0; j < array.length; j++) {
			array[j] = i;
			System.out.println(array[j]);
			i = i + 10;
		}
	}

}
