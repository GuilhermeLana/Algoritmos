package exercicios.condicionaiseInteradoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1;
		System.out.println("Digite um número:");
		num1 = scanner.nextDouble();
		String operador;
		System.out.println("Digite um operador matemático:");
		operador = scanner.next();
		double num2;
		System.out.println("Digite outro número:");
		num2 = scanner.nextDouble();
		double resul;
		DecimalFormat df = new DecimalFormat("#0.00");
		if(operador.equals("+")){
			resul = num1 + num2;
			System.out.println("O valor da soma é: " + df.format(resul));
		}
		if(operador.equals("-")){
			resul = num1 - num2;
			System.out.println("O valor da subtração é: " + df.format(resul));
		}
		if(operador.equals("/")){
			resul = num1 / num2;
			System.out.println("O valor da divisão é: " + df.format(resul));
		}
		if(operador.equals("*")){
			resul = num1 * num2;
			System.out.println("O valor da multiplicação é: " + df.format(resul));
		}
		scanner.close();
	}

}
