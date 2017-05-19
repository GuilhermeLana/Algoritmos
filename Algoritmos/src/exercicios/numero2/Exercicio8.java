package exercicios.numero2;

import java.util.Scanner;

public class Exercicio8 {
	//Imprima apenas número múltiplos de 2, de 0 até o número digitado pelo usuário;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int limite;
		System.out.println("Digite até que numero você quer imprimir:");
		limite = scanner.nextInt();
		
		for(int aux = 0; aux <= limite; aux++){
			if(aux % 2 == 0){
				System.out.println(aux);
			}
		}
		scanner.close();
		
		
	}

}
