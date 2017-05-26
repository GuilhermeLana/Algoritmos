package exercicios.condicionaiseInteradoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1;
		System.out.println("Digite um n�mero:");
		num1 = scanner.nextDouble();
		String operador;
		System.out.println("Digite um operador matem�tico:");
		operador = scanner.next();
		double num2;
		System.out.println("Digite outro n�mero:");
		num2 = scanner.nextDouble();
		double resul;
		DecimalFormat df = new DecimalFormat("#0.00");
		if(operador.equals("+")){
			resul = num1 + num2;
			System.out.println("O valor da soma �: " + df.format(resul));
		}
		if(operador.equals("-")){
			resul = num1 - num2;
			System.out.println("O valor da subtra��o �: " + df.format(resul));
		}
		if(operador.equals("/")){
			resul = num1 / num2;
			System.out.println("O valor da divis�o �: " + df.format(resul));
		}
		if(operador.equals("*")){
			resul = num1 * num2;
			System.out.println("O valor da multiplica��o �: " + df.format(resul));
		}
		scanner.close();
	}

}
