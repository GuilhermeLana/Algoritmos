package exercicios.numero2;

public class Exercicio19 {
//Imprimir o resultado do número elevado ao quadrado, de uma lista com 100 posições.
	public static void main(String[] args) {
		int aux = -1;
		double resul;
		while(aux < 100){
			aux++;
			resul = Math.pow(aux, 2);
			System.out.println(resul);
		}
	}

}
