package exercicos.arrayeMatriz;

public class Exercicio13 {
	public static void main(String[] args) {
		/*Criar um array de 10 posi��es, e popular o array com os valores 1, 2, 3, 4, 5 
		 * a partir da posi��o 4 utilizando for. Para colocar os valores 1, 2, 3, 4, 5 
		 * utilizando uma vari�vel.*/
		int numeros[] = new int[10];
		int y = 1;
		for (int i = 3; i < numeros.length; i++) {
		   if( y > 0 && y < 6){
			   numeros[i] = y;	
			   y++;
		   }
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
