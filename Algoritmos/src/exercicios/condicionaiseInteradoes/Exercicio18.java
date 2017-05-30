package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome1;
		System.out.println("Digite seu nome:");
		nome1 = scanner.next();
		int diaNiver1;
		System.out.println("Digite o dia de seu Aniversário:");
		diaNiver1 = scanner.nextInt();
		int mesNiver1;
		System.out.println("Digite o mês de seu Aniversário:");
		mesNiver1 = scanner.nextInt();
		int anoNiver1;
		System.out.println("Digite o ano de seu Aniversário:");
		anoNiver1 = scanner.nextInt();
		String nome2;
		System.out.println("Digite seu nome:");
		nome2 = scanner.next();
		int diaNiver2;
		System.out.println("Digite o dia de seu Aniversário:");
		diaNiver2 = scanner.nextInt();
		int mesNiver2;
		System.out.println("Digite o mês de seu Aniversário:");
		mesNiver2 = scanner.nextInt();
		int anoNiver2;
		System.out.println("Digite o ano de seu Aniversário:");
		anoNiver2 = scanner.nextInt();
		
		String resul[] = new String[2];
		
		if(anoNiver1 < anoNiver2){
			resul[0] = nome1;
			resul[1] = nome2;
		} else if (anoNiver2 < anoNiver1){
			resul[0] = nome2;
			resul[1] = nome1;
		} else if (mesNiver1 < mesNiver2) {
			resul[0] = nome1;
			resul[1] = nome2;
		} else if (mesNiver2 < mesNiver1) {
			resul[0] = nome2;
			resul[1] = nome1;
		} else if (diaNiver1 < diaNiver2) {
			resul[0] = nome1;
			resul[1] = nome2;
		} else {
			resul[0] = nome2;
			resul[1] = nome1;
		}
		System.out.println(resul[0] + "\n" + resul[1]);
		scanner.close();
	}

}
