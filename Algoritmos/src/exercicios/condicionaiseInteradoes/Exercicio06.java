package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cidade;
		System.out.println("Digite a cidade onde você mora:");
		cidade = scanner.next();
		String bairro;
		System.out.println("Digite o bairro onde você mora:");
		bairro = scanner.next();
		if(cidade.equalsIgnoreCase("Blumenau") & bairro.equalsIgnoreCase("Velha")){
			System.out.println("Você se atrasará para o trabalho!");
		}
		if(cidade.equalsIgnoreCase("Blumenau") & bairro.equalsIgnoreCase("Fortaleza")){
			System.out.println("Você se atrasará muito mais para o trabalho!");
		}
		if(cidade.equalsIgnoreCase("Blumenau") & bairro.equalsIgnoreCase("Garcia")){
			System.out.println("Você tem que sair de madrugada para não pegar trânsito!");
		}
		if(cidade.equalsIgnoreCase("Gaspar") & bairro.equalsIgnoreCase("Belchior")){
			System.out.println("OK, você gosta de pegar trânsito!");
		}
		if(cidade.equalsIgnoreCase("Blumenau") & bairro.equalsIgnoreCase("Bela vista")){
			System.out.println("Pegue carona com quem vêem de Gaspar, economiza gasolina!");
		}
		String concorda;
		System.out.println("Você concorda com o que eu disse?");
		concorda = scanner.next();
		if(concorda.equalsIgnoreCase("Sim")){
			System.out.println("Show de bola");
		}
		else{
			System.out.println("Ok, problema é nosso!");
		}
		scanner.close();
	}

}
