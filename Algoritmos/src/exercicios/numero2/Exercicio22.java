package exercicios.numero2;

import javax.swing.JOptionPane;

public class Exercicio22 {
	public static void main(String[] args) {
		int _qntLinhas = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de linhas da pirâmide"));
		String saida = "";
		int numero = 0;
		for(int i = 0; i <= _qntLinhas; i++){
			for(int x = 0; x < i; x++){
				if(numero < 10){
					saida += "0" + numero;	
				}
				else{
					saida += numero;
				}				
			}
			saida += "\n";
			numero++;
		}
		System.out.println(saida);
	}

}
