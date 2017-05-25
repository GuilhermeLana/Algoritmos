package exercicios.numero3;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String texto;
		System.out.println("Digite um texto:");
		texto = scanner.next();
		String outroTexto = texto;
		texto = "Olá";
		System.out.println(texto + " " + outroTexto);
		scanner.close();
		
		
	}

}
