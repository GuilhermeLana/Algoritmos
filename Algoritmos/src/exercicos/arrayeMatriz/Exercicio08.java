package exercicos.arrayeMatriz;

public class Exercicio08 {
	public static void main(String[] args) {
		//Criar um array do tipo int, com os seguintes valores 1, 2, 3, 4, 5.
		int numeros[] = new int[5];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		//a.	Imprimir todos os valores do array até chegar a metade do array.
		System.out.println("Item A");
		for (int i = 0; i < numeros.length / 2; i++) {
			System.out.println(numeros[i]);
		}
		
		//b.	Alterar o valor do início do array para 10.
		numeros[0] = 10;
		
		//c.	Alterar o valor da última posição do array para 10. 
		numeros[4] = 10;
		
		//d.	Imprimir todos os valores do array.
		System.out.println("\nItem D");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
