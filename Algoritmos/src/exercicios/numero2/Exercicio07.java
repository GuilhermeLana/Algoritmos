package exercicios.numero2;

public class Exercicio07 {
	//Imprima apenas números pares de 0 à 100;
	public static void main(String[] args) {
		for(int aux = 0; aux <= 100; aux++){
			if(aux % 2 == 0){
				System.out.println(aux);
			}
		}
	}

}
