package exercicios.numero2;

import javax.swing.JOptionPane;

public class Exercicio23 {
	public static void main(String[] args) {
		int _qntLinhas = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de linhas da pirâmide"));
		String saida = "";
		int numero = _qntLinhas;
		for(int i = numero; i <= _qntLinhas; i++){
			for(int x = 0; x < i; x++){
				saida += numero;
			}
			saida += "\n";
			numero--;
		}
		System.out.println(saida);
	}


}
