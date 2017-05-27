package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		/*Escreva um algoritmo que o usu�rio entre com o sal�rio da pessoa e 
		 * imprima o sal�rio l�quido, segundo as informa��es abaixo, 
		 * utilizando apenas um System.out.println:
		a.	Menor ou igual a R$ 600,00 � isento
		b.	Maior que R$ 600 e menor ou igual a R$ 1.200,00 o desconto � de 20%
		c.	Maior que R$ 1.200,00 e menor ou igual a R$ 2000,00 o desconto � 25%
		d.	Maior que R$ 2000,00 o desconto � 30% */
		Scanner scanner = new Scanner(System.in);
		double salario;
		System.out.println("Digite o sal�rio:");
		salario = scanner.nextDouble();
		if (salario > 600 & salario <= 1200){
			salario = salario - (salario * 0.2);
		} else if (salario > 1200 & salario <= 2000){
			salario = salario - (salario * 0.25);
		  }
		else if (salario > 2000){
			salario = salario - (salario * 0.3);	
		}
		System.out.println("O sal�rio l�quido � de R$ " + salario);
		scanner.close();
	}

}
