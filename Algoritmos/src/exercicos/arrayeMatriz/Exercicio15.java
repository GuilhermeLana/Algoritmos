package exercicos.arrayeMatriz;

public class Exercicio15 {
	public static void main(String[] args) {
		/*Criar um array com os valores 10, 8, 6, 4, 2 utilizando esta sequencia de inserção. 
		 * Criar um outro array de mesmo tamanho. Utilizando for, 
		 * pegar todos os valores presentes no primeiro array e 
		 * inserir no segundo array de forma decrescente (2, 4, 6, 8, 10). 
		 * Desta forma os dois arrays terão os mesmo valores só que nas posições inversas. 
		 * Imprimir o segundo array para verificar se o algoritmo funcionou.*/
		int array1[] = new int[5];
		array1[0] = 10;
		array1[1] = 8;
		array1[2] = 6;
		array1[3] = 4;
		array1[4] = 2;
		int array2[] = new int[5];
		int j = 0;
		for (int i = array1.length - 1; i >= 0; i--) {
			array2[j] = array1[i];
			System.out.println(array2[j]);
			j++;
		}
	}

}
