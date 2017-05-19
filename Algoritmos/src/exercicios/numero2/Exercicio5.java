package exercicios.numero2;

import java.util.Scanner;

public class Exercicio5 {
	//Pergunte para o usuário até que número ele quer imprimir, 
	//e imprima do 0 até o número desejado pelo usuário;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int limite;
		System.out.println("Digite até que numero você quer imprimir:");
		limite = scanner.nextInt();
		
		for (int aux = 0; aux <= limite; aux++){
			System.out.println(aux);
		}
		scanner.close();
  
	}
	

}
