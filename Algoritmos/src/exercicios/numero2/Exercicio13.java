package exercicios.numero2;

public class Exercicio13 {
	//Imprima somente números divisíveis por 5, de 1000 à 0;
	public static void main(String[] args) {
		for(int aux = 1000; aux >= 0; aux--){
			if(aux % 5 == 0)
				System.out.println(aux);
		}
	}

}
