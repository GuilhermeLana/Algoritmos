package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dia;
		System.out.println("Digite o dia do m�s:");
		dia = scanner.nextInt();
		int mes;
		System.out.println("Digite o n�mero do m�s:");
		mes = scanner.nextInt();
		boolean validarData = false;
		switch (mes){
		case 1:
			if (dia <= 31){
				validarData = true;
			}
			break;
		case 2:
			if (dia <= 29){
				validarData = true;
			}
			break;
		case 3:
			if (dia <= 31){
				validarData = true;
			}
			break;
		case 4:
			if (dia <= 30){
				validarData = true;
			}
			break;
		case 5:
			if (dia <= 31){
				validarData = true;
			}
			break;
		case 6:
			if (dia <= 30){
				validarData = true;
			}
			break;
		case 7:
			if (dia <= 31){
				validarData = true;
			}
			break;
		case 8:
			if (dia <= 31){
				validarData = true;
			}
			break;
		case 9:
			if (dia <= 30){
				validarData = true;
			}
			break;
		case 10:
			if (dia <= 31){
				validarData = true;
			}
			break;
		case 11:
			if (dia <= 30){
				validarData = true;
			}
			break;
		case 12:
			if (dia <= 31){
				validarData = true;
			}
			break;
			default: System.out.println("Entre com um n�mero de m�s valido!");
		}
		if(validarData == true){
			System.out.println("A data est� correta!");
		} else {
			System.out.println("Esta data n�o existe!");
		}
		scanner.close();
	}

}
