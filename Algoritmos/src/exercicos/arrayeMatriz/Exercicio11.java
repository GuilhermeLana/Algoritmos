package exercicos.arrayeMatriz;

public class Exercicio11 {
	public static void main(String[] args) {
		/*Criar um array do tipo boolean de 6 posições. 
		 * Utilizando um for, popular o array aonde as posições forem pares 
		 * colocar o valor true, e nas posições ímpares o valor false*/
		boolean exe11[] = new boolean[6];
		for (int i = 0; i < exe11.length; i++) {
			if(i % 2 == 0){
				exe11[i] = true;
			} else {
				exe11[i] = false;
			}
			
		}
	}

}
