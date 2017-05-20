package exercicios.numero2;

public class Exercicio11 {
//Imprima apenas números múltiplos de 97 de 0 à 1000;
	public static void main(String[] args) {
		for(int aux = 0; aux <= 1000; aux++){
			if(aux % 97 == 0){
				System.out.println(aux);
			}
		}
	}
}
