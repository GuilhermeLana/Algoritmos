package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cidade;
		System.out.println("Digite a cidade onde voc� mora:");
		cidade = scanner.next();
		String bairro;
		System.out.println("Digite o bairro onde voc� mora:");
		bairro = scanner.next();
		if(cidade.equalsIgnoreCase("Blumenau") & bairro.equalsIgnoreCase("Velha")){
			System.out.println("Voc� se atrasar� para o trabalho!");
		}
		if(cidade.equalsIgnoreCase("Blumenau") & bairro.equalsIgnoreCase("Fortaleza")){
			System.out.println("Voc� se atrasar� muito mais para o trabalho!");
		}
		if(cidade.equalsIgnoreCase("Blumenau") & bairro.equalsIgnoreCase("Garcia")){
			System.out.println("Voc� tem que sair de madrugada para n�o pegar tr�nsito!");
		}
		if(cidade.equalsIgnoreCase("Gaspar") & bairro.equalsIgnoreCase("Belchior")){
			System.out.println("OK, voc� gosta de pegar tr�nsito!");
		}
		if(cidade.equalsIgnoreCase("Blumenau") & bairro.equalsIgnoreCase("Bela vista")){
			System.out.println("Pegue carona com quem v�em de Gaspar, economiza gasolina!");
		}
		String concorda;
		System.out.println("Voc� concorda com o que eu disse?");
		concorda = scanner.next();
		if(concorda.equalsIgnoreCase("Sim")){
			System.out.println("Show de bola");
		}
		else{
			System.out.println("Ok, problema � nosso!");
		}
		scanner.close();
	}

}
