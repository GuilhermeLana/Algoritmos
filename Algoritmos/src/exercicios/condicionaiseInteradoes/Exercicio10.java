package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1;
		System.out.println("Digite um número:");
		num1 = scanner.nextDouble();
		double num2;
		System.out.println("Digite outro número:");
		num2 = scanner.nextDouble();
		double soma = num1 + num2;
		if(soma > 30){
			System.out.println(soma + " é maior que 30.");
		}
		else{
			if(soma > 20){
				System.out.println(soma +  " é maior que 20.");
			}
			else{
				if(soma > 10 | soma > 20){
					System.out.println(soma +  " maior que 10 ou " + soma + " maior que 20.");
			    }
		    }
		
		}
		if(soma % 5 == 0 & soma % 10 == 0){
			System.out.println(soma +  " é multiplo de 5 e " + soma + " de 10.");
		}
		if((soma % 5 == 0 & soma % 10 == 0) | num1 == 5){
			System.out.println(soma +  " é multiplo de 5 e " + soma + " de 10 ou " +
					"o primeiro número digitado é 5");
		}
		scanner.close();
	}

}
