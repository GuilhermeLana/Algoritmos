package exercicios.numero2;

public class Exercicio03 {
	//Imprima no console uma lista de 20 a 100, e no lugar do n�mero 25 imprima �Ol�;
	public static void main(String[] args) {
		int aux = 19;
		while(aux < 100){
			aux++;
			if(aux == 25){
				System.out.println("Ol�");
			}
			else {
				System.out.println(aux);	
			}
		}
	}

}
