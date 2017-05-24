package exercicios.numero3;

import java.util.Scanner;

public class Exercicio13 {
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
		
		int num4;
		System.out.println("Digite outro número inteiro:");
		num4 = scanner.nextInt();
		
		boolean ItemA;
		if(num1 <= (num2 + num3) & (num4 % 2 == 1 | num4 > 10)){
			ItemA = true;
			System.out.println("ItemA =" + ItemA);
		}
		else{
			ItemA = false;
			System.out.println("ItemA =" + ItemA);
		}
		
		boolean ItemB;
		int soma = num1 + num2 + num3 + num4;
		int soma2 = num1 + num2 + num3;
		if(soma % 10 == 0 | soma % 5 == 0 | num1 == 5 | soma2 > 100 & num1 > 0  ){
			ItemB = true;
			System.out.println("ItemB =" + ItemB);
		}
		else{
			ItemB = false;
			System.out.println("ItemB =" + ItemB);
		}
		
		boolean ItemC;
		if((ItemA == true & ItemB == true) | (ItemA == false & ItemB == false)){
			ItemC = true;
			System.out.println("ItemC =" + ItemC);
		}
		else{
			ItemC = false;
			System.out.println("ItemC =" + ItemC);
		}
		
		boolean ItemD;
		if(soma > 10){
			ItemD = false;
			System.out.println("ItemD =" + ItemD);
		}
		else{
			ItemD = true;
			System.out.println("ItemD =" + ItemD);
		}
		
		boolean ItemE;
		if(num1 > 10 | num3 > 0 | (num2 + num4) == 0){
			ItemE = false;
			System.out.println("ItemE =" + ItemE);
		}
		else{
			ItemE = true;
			System.out.println("ItemE =" + ItemE);
		}
	    scanner.close();
	}

}
