package exercicos.arrayeMatriz;

import java.util.Arrays;

public class Exercicio07 {
	public static void main(String[] args) {
		//Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”
		String letras[] = new String[6];
		letras[0] = "A";
		letras[1] = "B";
		letras[2] = "C";
		letras[3] = "D";
		letras[4] = "E";
		letras[5] = "F";
		
		//a.	Imprimir todos os valores do array 
		System.out.println("Item A");
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		//Imprimir todos os valores do array de forma contrário, ou seja, “F”, “E”, “D”, “C”, “B”, “A”
		System.out.println("\nItem B");
		Arrays.sort(letras);
		for (int i = letras.length - 1; i >= 0; i--) {
			System.out.println(letras[i]);
		}
		
		//c.	Imprimir todos os valores do array menos que tenha o valor “C”
		System.out.println("\nItem C");
		for (int i = 0; i < letras.length; i++) {
			if(letras[i] != "C"){
				System.out.println(letras[i]);
			}
		}
	}

}
