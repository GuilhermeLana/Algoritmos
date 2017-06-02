package exercicos.arrayeMatriz;

public class Exercicio25 {
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
		int somalinhas[] = new int[3];
		int y = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				somalinhas[y] = somalinhas[y] + matriz[i][j];
				if(j == matriz[j].length - 1){
					y++;
				}
			}			
		}
		y = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = somalinhas[y];
				if(j == matriz[j].length - 1){
					System.out.println("Soma da linha " + y + ": " + somalinhas[y]);
					y++;
				}
			}			
		}
		
	}

}
