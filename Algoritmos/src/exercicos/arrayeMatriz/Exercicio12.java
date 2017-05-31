package exercicos.arrayeMatriz;

public class Exercicio12 {
	public static void main(String[] args) {
		/*Criar um array do tipo boolean com 3 posições, 
		 * com os valores true, false, true. Utilizando for, 
		 * verifique se comparado todos os valores boleanos do array 
		 * com o operador ou (|) é verdadeiro, caso sim imprima “1”, caso contrário “2”.*/
		boolean exe12[] = new boolean[3];
		exe12[0] = true;
		exe12[1] = false;
		exe12[2] = true;
		for (int i = 0; i < exe12.length; i++) {
			if (exe12[i] == true) {
				System.out.println("1");
			} else {
				System.out.println("2");
			}
		}
	}

}
