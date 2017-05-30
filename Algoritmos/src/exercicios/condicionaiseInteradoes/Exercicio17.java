package exercicios.condicionaiseInteradoes;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome1;
		System.out.println("Digite seu nome:");
		nome1 = scanner.next();
		int idade1;
		System.out.println("Digite sua idade:");
		idade1 = scanner.nextInt();
		String nome2;
		System.out.println("Digite o nome de outra pessoa:");
		nome2 = scanner.next();
		int idade2;
		System.out.println("Digite a idade de outra pessoa:");
		idade2 = scanner.nextInt();
		String nome3;
		System.out.println("Digite o nome de outra pessoa:");
		nome3 = scanner.next();
		int idade3;
		System.out.println("Digite a idade de outra pessoa:");
		idade3 = scanner.nextInt();

	    String[] resul = new String[3];
	    
	    if(idade1 > idade2 & idade1 > idade2){
	    	resul[0] = nome1 + " " + idade1;
	    	if(idade2 > idade3){
	    		resul[1] = nome2 + " " + idade2;
	    		resul[2] = nome3 + " " + idade3;
	    	} else {
	    		resul[1] = nome3 + " " + idade3;
	    		resul[2] = nome2 + " " + idade2;
	    	}
	    } else if(idade2 > idade3){
	    	resul[0] = nome2 + " " + idade2;
	    	if (idade1 > idade3){
	    		resul[1] = nome1 + " " + idade1;
	    		resul[2] = nome3 + " " + idade3;
	    	} else {
	    		resul[1] = nome3 + " " + idade3;
	    		resul[2] = nome1 + " " + idade1;
	    	}
	    } else {
	    	resul[0] = nome3 + " " + idade3;
	    	if(idade1 > idade2){
	    		resul[1] = nome1 + " " + idade1;
	    		resul[2] = nome2 + " " + idade2;
	    	} else {
	    		resul[1] = nome2 + " " + idade2;
	    		resul[2] = nome1 + " " + idade1;
	    	}
	    }

	    System.out.println(resul[0] + "\n" + resul[1] + "\n" + resul[2]);
		scanner.close();
	}

}
