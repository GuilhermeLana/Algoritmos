package exercicios.numero2;

import java.util.Scanner;

public class Exercicio8 {
	//Imprima apenas n�mero m�ltiplos de 2, de 0 at� o n�mero digitado pelo usu�rio;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int limite;
		System.out.println("Digite at� que numero voc� quer imprimir:");
		limite = scanner.nextInt();
		
		for(int aux = 0; aux <= limite; aux++){
			if(aux % 2 == 0){
				System.out.println(aux);
			}
		}
		scanner.close();
		
		
	}

}
