package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class Exercicio_Aula_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[][] M = new int [4][4];
		int maiorValor = 0;
		int[][] R = new int [4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Entre com 1 Numero");
				M[i][j] = entrada.nextInt();


				System.out.println("Linha : " +  "[ " + i + " ]  Coluna - "  + "[ "  + j + " ] " + " N° Digitado : " + M[i][j]);
				if(i==0 && j==0)
					maiorValor=M[i][j];
				else
				{
					if(M[i][j] > maiorValor){
						maiorValor = M[i][j];

					}

				}
			}

			System.out.println("");

		}
		// * 
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				R[i][j] = maiorValor * M[i][j];
				
			}
		}
		
		//Imprimindo

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Resultado : " + R[i][j]);
			}
		}
	}

}
