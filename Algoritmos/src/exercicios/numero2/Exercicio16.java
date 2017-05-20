package exercicios.numero2;

public class Exercicio16 {
//Imprima apenas números que se divididos por 5 o resultado seja maior que 3, de 10 à 1000;
	public static void main(String[] args) {
		for(int aux = 10; aux <= 1000; aux++){
			if(aux / 5 > 3)
				System.out.println(aux);
		}
	}

}
