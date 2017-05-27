package exercicios.condicionaiseInteradoes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] listaDeNumeros = new int[4];
		for (int i = 1; i < listaDeNumeros.length; i++){
			System.out.print("Digite o " + i + "° número:");
			listaDeNumeros[i] = scanner.nextInt();			
		}
		Arrays.sort(listaDeNumeros);
		System.out.print(listaDeNumeros[3] + " " + listaDeNumeros[2] + " " + listaDeNumeros[1]);		
		scanner.close();
	}
}
