package exercicos.arrayeMatriz;

public class Exercicio26 {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		matriz[0][0] = 3;
		matriz[0][1] = 3;
		matriz[0][2] = 3;
		matriz[1][0] = 2;
		matriz[1][1] = 2;
		matriz[1][2] = 2;
		matriz[2][0] = 1;
		matriz[2][1] = 1;
		matriz[2][2] = 1;
		int somacolunas[] = new int[3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				somacolunas[j] = somacolunas[j] + matriz[i][j];
			}			
	    }
		int y = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = somacolunas[j];
				if(j == matriz[j].length - 1){
					System.out.println("Soma da coluna " + y + ": " + somacolunas[j]);
					y++;
				}
			}			
		}
	}

}
