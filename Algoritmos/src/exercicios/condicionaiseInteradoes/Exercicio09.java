package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		/*Mariazinha quer sair com amigas no domingo a tarde no shopping. 
		 * Só que ela não sabe que roupa ela vai usar ainda, 
		 * por que ela não viu o jornal do clima na tv. 
		 * Desta na hora de sair ela vai olhar para fora da janela 
		 * e ver o tempo para verificar qual roupa ela usará. 
		 * Contudo a Mariazinha já nos disse o que ela usará em cada clima e temperatura.
		 *  Desta forma, escreva um algoritmo que verifique as condições do tempo 
		 *  (clima e temperatura) e imprima no console qual a roupa que a 
		 *  Mariazinha escolheu para usar.
		 */
		Scanner scanner = new Scanner(System.in);
		String clima;
		System.out.println("Digite o clima:");
		clima = scanner.next();
		int temperatura;
		System.out.println("Digite a temperatura:");
		temperatura = scanner.nextInt();
		switch (clima){
		case "sol":
			System.out.print("Mariazinha vai usar blusa e ");
			if(temperatura > 30){
				System.out.println("saia.");
			}
			if(temperatura <= 30 & temperatura >= 23){
				System.out.println("shorts.");
			}
			if(temperatura < 23){
					System.out.println("jeans.");
			}
			break;
		case "nublado":
			if(temperatura > 25){
				System.out.println("Mariazinha vai usar vestido.");
			}
			if(temperatura <= 25){
				System.out.println("Mariazinha vai usar calça de moletom e sobretudo.");
			}
			break;
		case "chovendo":
			System.out.print("Mariazinha vai usar bota, calça jeans e ");
			if(temperatura <= 10){
				System.out.println("blusa e um casaco de lã.");
			}
			if(temperatura > 10 & temperatura < 25){
				System.out.println("camiseta.");
			}
			if(temperatura >= 25){
				System.out.println("blusa regata.");
			}
			break;
		default: System.out.println("Mariazinha vai ficar em casa.");
			break;
		}
		scanner.close();
	}

}
