package exercicios.numero2;

import java.util.Scanner;

public class Exercicio5 {
	//Pergunte para o usu�rio at� que n�mero ele quer imprimir, 
	//e imprima do 0 at� o n�mero desejado pelo usu�rio;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int limite;
		System.out.println("Digite at� que numero voc� quer imprimir:");
		limite = scanner.nextInt();
		
		for (int aux = 0; aux <= limite; aux++){
			System.out.println(aux);
		}
		scanner.close();
  
	}
	

}
