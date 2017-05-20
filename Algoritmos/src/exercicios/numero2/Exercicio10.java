package exercicios.numero2;

public class Exercicio10 {
	//Imprima duas listas, uma de 0 a 10 e outra de 10 a 0;
	public static void main(String[] args) {
		int aux1 = -1;
		int aux2 = 11;
		while(aux1 < 10 & aux2 > 0){
			aux1++;
			aux2--;
			System.out.println(aux1 + "   " + aux2);
		}
	}

}
