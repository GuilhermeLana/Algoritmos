package exercicios.scanner;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		System.out.println("Digite seu nome:");
		nome = scanner.nextLine();
		
		String telefone;
		System.out.println("Digite seu telefone:");
		telefone = scanner.nextLine();
		
		String cidade;
		System.out.println("Digite a cidade de nascimento");
		cidade = scanner.nextLine();
		
		int ano;
		System.out.println("Digite seu ano de nascimento:");
		ano = scanner.nextInt();
		
		int idade = 2017 - ano;
		System.out.println("Meu nome é " + nome + ", nasci no ano de " + ano + " tenho " 
		        + idade + " anos. Se você quiser entrar em contato comigo,"
				+ " pode ligar para o telefone " + telefone 
				+ ", Há esqueci de te dizer aonde eu nasci, "
				+ "foi na cidade de " + cidade + ".");
	
	
        scanner.close();
	}

}
