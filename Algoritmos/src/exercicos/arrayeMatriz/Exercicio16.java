package exercicos.arrayeMatriz;

public class Exercicio16 {
	public static void main(String[] args) {
		/*Criar um array com 10 posi��es. Inserir nas posi��es 2, 4, 5, 7 
		 * os respectivos valores �A�, �B�, �C�, �D�. Com for ou while, 
		 * inserir a letra �W� nas posi��es do array no qual n�o tem valor 
		 * (verificar a posi��o do array com null para validar se possui valor 
		 * ou n�o na posi��o do array, array[i] == null). Imprimir o array para 
		 * verificar se o algoritmo funcionou. Fazer o exerc�cio utilizando for ou while.*/
		String array[] = new String[10];
		array[0] = null;
		array[1] = null;
		array[2] = "A";
		array[3] = null;
		array[4] = "B";
		array[5] = "C";
		array[6] = null;
		array[7] = "D";
		array[8] = null;
		array[9] = null;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == null){
				array[i] = "W";
			}
			System.out.println(array[i]);
		}
	}

}
