package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valorProduto;
		System.out.println("Digite o valor do produto:");
		valorProduto = scanner.nextDouble();
		if(valorProduto < 20){
			valorProduto = valorProduto * 0.5 + valorProduto;
		} else {
			valorProduto = valorProduto * 0.3 + valorProduto;
		}
		System.out.println("O valor de venda do produto é de R$ " + valorProduto);
		scanner.close();
	}

}
