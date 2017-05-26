package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade:");
		idade = scanner.nextInt();
		int anoNasc;
		System.out.println("Digite seu ano de nascimento:");
		anoNasc = scanner.nextInt();
		int verifIdade = 2017 - anoNasc;
		if(idade == verifIdade){
			System.out.println("Você não mentiu para mim!");
		}
		else{
			System.out.println("Você mentiu para mim, você não é mais meu amigo!");
		}
		scanner.close();
	}

}
