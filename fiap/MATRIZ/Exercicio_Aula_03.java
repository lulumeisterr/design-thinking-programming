package br.com.fiap.MATRIZ;

public class Exercicio_Aula_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] Matriz = new int [5][5];
		int linha = 1;
		//Diagonal principal
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == j){
					Matriz[i][j] = 1;
				}else{
					Matriz[i][j] = 0;
				}
			}
			System.out.println("");
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(Matriz[i][j]);
			}
		}
	}

}
