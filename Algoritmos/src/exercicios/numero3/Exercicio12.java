package exercicios.numero3;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		System.out.println("Digite um número inteiro:");
		num1 = scanner.nextInt();
		
		int num2;
		System.out.println("Digite outro número inteiro:");
		num2 = scanner.nextInt();
		
		int num3;
		System.out.println("Digite outro número inteiro:");
		num3 = scanner.nextInt();
		
		double ItemA = (num1 * num3) + Math.pow(num2, 3);
		System.out.println("ItemA =" + ItemA);
		
		boolean ItemB;
		if(ItemA > 0){
			ItemB = true;
			System.out.println("ItemB =" + ItemB);
		}
		else{
			ItemB = false;
			System.out.println("ItemB =" + ItemB);
		}
		
		boolean ItemC;
		if(ItemA > 1){
			ItemC = true;
			System.out.println("ItemC =" + ItemC);
		}
		else{
			ItemC = false;
			System.out.println("ItemC =" + ItemC);
		}
		
		boolean ItemD;
		if(ItemA < 10 | ItemA > 100){
			ItemD = true;
			System.out.println("ItemD =" + ItemD);
		}
		else{
			ItemD = false;
			System.out.println("ItemD =" + ItemD);
		}
		
		boolean ItemE;
		if(ItemA % 10 == 0){
			ItemE = true;
			System.out.println("ItemE =" + ItemE);
		}
		else{
			ItemE = false;
			System.out.println("ItemE =" + ItemE);
		}
		
		boolean ItemF;
		if(ItemA % 2 == 0 & ItemA % 3 == 0){
			ItemF = true;
			System.out.println("ItemF =" + ItemF);
		}
		else{
			ItemF = false;
			System.out.println("ItemF =" + ItemF);
		}
		scanner.close();
	}

}
