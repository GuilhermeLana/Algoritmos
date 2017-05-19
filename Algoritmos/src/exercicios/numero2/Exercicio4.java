package exercicios.numero2;

public class Exercicio4 {
	//Imprima no console uma lista de 0 a 20 e de 30 a 40, utilizando apenas um for;
	public static void main(String[] args) {
		for(int aux = 0; aux <= 40; aux++){
			if(aux <= 20 | aux >= 30){
				System.out.println(aux);
			}
		}
	}

}
