package exercicios.numero3;

import java.util.Scanner;

public class cardapio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pizzas[] = new double[15];
		System.out.println("Digite o valor da pizza de calabresa:");
		pizzas[0] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de 4 queijos:");
		pizzas[1] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de frango:");
		pizzas[2] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de lombinho:");
		pizzas[3] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de coração:");
		pizzas[4] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de carne:");
		pizzas[5] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de strogonoff de frango:");
		pizzas[6] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de strogonoff de carne:");
		pizzas[7] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de 5 queijos:");
		pizzas[8] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de banana split:");
		pizzas[9] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de sonho de valsa:");
		pizzas[10] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de prestígio:");
		pizzas[11] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de chocolate preto:");
		pizzas[12] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de chocolate branco:");
		pizzas[13] = scanner.nextDouble();
		System.out.println("Digite o valor da pizza de coco:");
		pizzas[14] = scanner.nextDouble();
		
		String cardapio[] = new String[15];
		cardapio[0] = "1 - Pizza de calabresa = R$";
		cardapio[1] = "2 - Pizza de 4 queijos = R$";
		cardapio[2] = "3 - Pizza de frango = R$";
		cardapio[3] = "4 - Pizza de lombinho = R$";
		cardapio[4] = "5 - Pizza de coração = R$";
		cardapio[5] = "6 - Pizza de carne = R$";
		cardapio[6] = "7 - Pizza de strogonoff de frango = R$";
		cardapio[7] = "8 - Pizza de strogonoff de carne = R$";
		cardapio[8] = "9 - Pizza de 5 queijos = R$";
		cardapio[9] = "10 - Pizza de banana split = R$";
		cardapio[10] = "11 - Pizza de sonho de valsa = R$";
		cardapio[11] = "12 - Pizza de prestígio = R$";
		cardapio[12] = "13 - Pizza de chocolate preto = R$";
		cardapio[13] = "14 - Pizza de chocolate branco = R$";
		cardapio[14] = "15 - Pizza de coco = R$";
		
        for (int i = 0; i < cardapio.length; i++) {
        	System.out.println(cardapio[i] + pizzas[i]);
		}
        int pedido;
        System.out.println("Digite o número da pizza escolhida:");	
		pedido = scanner.nextInt();
        
        switch (pedido){
        case 1: System.out.println("O valor do pedido é de R$" + pizzas[0]);
        break;
        case 2: System.out.println("O valor do pedido é de R$" + pizzas[1]);
        break;
        case 3: System.out.println("O valor do pedido é de R$" + pizzas[2]);
        break;
        case 4: System.out.println("O valor do pedido é de R$" + pizzas[3]);
        break;
        case 5: System.out.println("O valor do pedido é de R$" + pizzas[4]);
        break;
        case 6: System.out.println("O valor do pedido é de R$" + pizzas[5]);
        break;
        case 7: System.out.println("O valor do pedido é de R$" + pizzas[6]);
        break;
        case 8: System.out.println("O valor do pedido é de R$" + pizzas[7]);
        break;
        case 9: System.out.println("O valor do pedido é de R$" + pizzas[8]);
        break;
        case 10: System.out.println("O valor do pedido é de R$" + pizzas[9]);
        break;
        case 11: System.out.println("O valor do pedido é de R$" + pizzas[10]);
        break;
        case 12: System.out.println("O valor do pedido é de R$" + pizzas[11]);
        break;
        case 13: System.out.println("O valor do pedido é de R$" + pizzas[12]);
        break;
        case 14: System.out.println("O valor do pedido é de R$" + pizzas[13]);
        break;
        case 15: System.out.println("O valor do pedido é de R$" + pizzas[14]);
        break;
        default: System.out.println("Digite um número valido!");
        break;
        }
        scanner.close();
	}

}
