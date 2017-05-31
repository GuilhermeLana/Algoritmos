package exercicos.arrayeMatriz;

public class Exercicio10 {
	public static void main(String[] args) {
		/*Criar um array do tipo int de 6 posições, 
		 * com os valores 1, 3, 5, 7, 9, 11. 
		 * Imprimir todas as posições menos a última posição 
		 * (verificar se é a última posições e não verificar se é o de valor 11).*/
		int numeros[] = new int[6];
		numeros[0] = 1;
		numeros[1] = 3;
		numeros[2] = 5;
		numeros[3] = 7;
		numeros[4] = 9;
		numeros[5] = 11;
		
		for (int i = 0; i < numeros.length; i++) {
			if(i != numeros.length - 1){
				System.out.println(numeros[i]);
			}
		}
	}
}
