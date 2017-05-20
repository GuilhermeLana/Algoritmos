package exercicios.numero2;

import javax.swing.JOptionPane;

public class Exercicio20 {
//Perguntar para o usuário o início da lista e o final da lista que ele quer se seja impressa e imprimir esta lista.
	public static void main(String[] args) {
		int inicio = Integer.parseInt(JOptionPane.showInputDialog("Qual o número do início da lista"));
		int fim = Integer.parseInt(JOptionPane.showInputDialog("Qual o número do final da lista"));
		for(;inicio <= fim; inicio++){
			System.out.println(inicio);
		}
		
	}

}
