package exercicos.arrayeMatriz;

public class Exercicio13 {
	public static void main(String[] args) {
		/*Criar um array de 10 posições, e popular o array com os valores 1, 2, 3, 4, 5 
		 * a partir da posição 4 utilizando for. Para colocar os valores 1, 2, 3, 4, 5 
		 * utilizando uma variável.*/
		int numeros[] = new int[10];
		int y = 1;
		for (int i = 3; i < numeros.length - 2; i++) {
		   numeros[i] = y;
		   y++;	
		   System.out.println(numeros[i]);
		}
	}

}
