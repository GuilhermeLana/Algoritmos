package exercicios.numero2;

import javax.swing.JOptionPane;

public class Exercicio21 {
	public static void main(String[] args) {
		int _qntLinhas = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de linhas da pirâmide"));
		String saida = "";
		for (int i = 1; i <= _qntLinhas; i++){
			for(int x = 0; x < i; x++){
				saida += "1";				
			}
			saida += "\n";
		}
		System.out.println(saida);
	}
}


