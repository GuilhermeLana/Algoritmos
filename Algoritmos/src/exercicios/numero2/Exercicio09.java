package exercicios.numero2;

import java.util.Scanner;

public class Exercicio09 {
	//Imprima apenas n�meros m�ltiplos de 3, do n�mero digitado pelo usu�rio;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int limite;
		System.out.println("Digite at� que numero voc� quer imprimir:");
		limite = scanner.nextInt();
		
		for(int aux = 1; aux <= limite; aux++){
			if(aux % 3 == 0){
				System.out.println(aux);
			}
		}
		scanner.close();
		
		
	}

}
