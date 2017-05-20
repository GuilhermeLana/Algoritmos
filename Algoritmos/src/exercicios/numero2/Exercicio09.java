package exercicios.numero2;

import java.util.Scanner;

public class Exercicio09 {
	//Imprima apenas números múltiplos de 3, do número digitado pelo usuário;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int limite;
		System.out.println("Digite até que numero você quer imprimir:");
		limite = scanner.nextInt();
		
		for(int aux = 1; aux <= limite; aux++){
			if(aux % 3 == 0){
				System.out.println(aux);
			}
		}
		scanner.close();
		
		
	}

}
