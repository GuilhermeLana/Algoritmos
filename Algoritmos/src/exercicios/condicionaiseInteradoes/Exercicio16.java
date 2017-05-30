package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome1;
		System.out.print("Digite seu nome:");
		nome1 = scanner.next();
		int idade1;
		System.out.print("Digite sua idade:");
		idade1 = scanner.nextInt();
		String nome2;
		System.out.print("Digite o nome de outra pessoa:");
		nome2 = scanner.next();
		int idade2;
		System.out.print("Digite a idade de outra pessoa:");
		idade2 = scanner.nextInt();
		int idadeVelha;
		int idadeNova;
		String nomeVelha;
		String nomeNova;
		
		if(idade1 > idade2) {
			idadeVelha = idade1;
			idadeNova = idade2;
			nomeVelha = nome1;
			nomeNova = nome2;
		} else {
			idadeVelha = idade2;
			idadeNova = idade1;
			nomeVelha = nome2;
			nomeNova = nome1;
		}
		System.out.println(nomeVelha + " " + idadeVelha + "\n" + nomeNova + " " + idadeNova);
		scanner.close();
	}

}
