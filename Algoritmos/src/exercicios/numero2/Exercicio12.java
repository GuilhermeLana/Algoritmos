package exercicios.numero2;

public class Exercicio12 {
	//Imprima somente n�meros m�ltiplos de 15 que s�o pares, de 0 � 1000;
	public static void main(String[] args) {
		for(int aux = 0; aux <= 1000; aux++){
			if(aux % 15 == 0 & aux % 2 == 0){
				System.out.println(aux);
			}
		}
	}

}
