package exercicos.arrayeMatriz;

public class Exercicio24 {
	public static void main(String[] args) {
	/*Criar um array de char com os seguintes valores, 
	 * ‘e’, ‘s’, ‘t’, ‘a’, ‘ ’, ‘a’, ‘c’, ‘a’, ‘b’, ‘a’, ‘n’, ‘d’, ‘o’, ‘ ’, ‘a’, ‘ ’, 
	 * ‘a’, ‘u’, ‘l’, ‘a’. Percorrer o array de char, e armazenar em uma String, 
	 * para formar o seguinte texto, “esta acabando a aula”. 
	 * Imprimir este texto no final com o valor da variável String.*/
		char array[] = new char[20];
		array[0] = 'e';
		array[1] = 's';
		array[2] = 't';
		array[3] = 'a';
		array[4] = ' ';
		array[5] = 'a';
		array[6] = 'c';
		array[7] = 'a';
		array[8] = 'b';
		array[9] = 'a';
		array[10] = 'n';
		array[11] = 'd';
		array[12] = 'o';
		array[13] = ' ';
		array[14] = 'a';
		array[15] = ' ';
		array[16] = 'a';
		array[17] = 'u';
		array[18] = 'l';
		array[19] = 'a';
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
	}

}
