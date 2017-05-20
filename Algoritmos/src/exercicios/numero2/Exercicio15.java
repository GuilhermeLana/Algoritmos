package exercicios.numero2;

public class Exercicio15 {
//Imprima apenas números do qual a divisão por 3, retorne um número inteiro, de -10 à 500;
	public static void main(String[] args) {
		for(int aux = -10; aux <= 500; aux++){
			if(aux % 3 == 0)
				System.out.println(aux);
		}
	}

}
