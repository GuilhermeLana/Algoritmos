package exercicios.numero2;

import javax.swing.JOptionPane;

public class Exercicio20 {
//Perguntar para o usu�rio o in�cio da lista e o final da lista que ele quer se seja impressa e imprimir esta lista.
	public static void main(String[] args) {
		int inicio = Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero do in�cio da lista"));
		int fim = Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero do final da lista"));
		for(;inicio <= fim; inicio++){
			System.out.println(inicio);
		}
		
	}

}
