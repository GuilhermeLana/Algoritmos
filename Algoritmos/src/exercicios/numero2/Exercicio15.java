package exercicios.numero2;

public class Exercicio15 {
//Imprima apenas n�meros do qual a divis�o por 3, retorne um n�mero inteiro, de -10 � 500;
	public static void main(String[] args) {
		for(int aux = -10; aux <= 500; aux++){
			if(aux % 3 == 0)
				System.out.println(aux);
		}
	}

}
