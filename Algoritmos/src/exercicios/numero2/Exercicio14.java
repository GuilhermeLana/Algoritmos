package exercicios.numero2;

public class Exercicio14 {
        //Imprima somente n�meros que s�o m�ltiplos de 100, de -100 � 100;
	public static void main(String[] args) {
		for(int aux = -100; aux <= 100; aux++){
			if(aux % 100 == 0)
				System.out.println(aux);
		}
	}

}
