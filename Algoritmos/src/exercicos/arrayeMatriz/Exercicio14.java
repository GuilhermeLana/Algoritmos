package exercicos.arrayeMatriz;

public class Exercicio14 {
	public static void main(String[] args) {
		/*Criar um array com os valores 10, 8, 6, 4, 2 
		 * utilizando esta sequencia de inserção. 
		 * Criar um outro array de mesmo tamanho. 
		 * Utilizando for, pegar todos os valores presentes no primeiro array
		 * e inserir no segundo array. Desta forma os dois arrays terão os mesmo
		 * valores nas mesmas posições. Imprimir o segundo array para verificar 
		 * se o algoritmo funcionou*/
		int array1[] = new int[5];
		array1[0] = 10;
		array1[1] = 8;
		array1[2] = 6;
		array1[3] = 4;
		array1[4] = 2;
		int array2[] = new int[5];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
			System.out.println(array2[i]);
		}
	}

}
