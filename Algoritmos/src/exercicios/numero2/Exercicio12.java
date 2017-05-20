package exercicios.numero2;

public class Exercicio12 {
	//Imprima somente números múltiplos de 15 que são pares, de 0 à 1000;
	public static void main(String[] args) {
		for(int aux = 0; aux <= 1000; aux++){
			if(aux % 15 == 0 & aux % 2 == 0){
				System.out.println(aux);
			}
		}
	}

}
