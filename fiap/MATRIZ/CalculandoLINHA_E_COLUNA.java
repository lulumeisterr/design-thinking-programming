package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class CalculandoLINHA_E_COLUNA {

	public static void main(String[] args) {

		int[][] Matriz = new int [4][4];
		int somarLinha = 0 , somarColuna = 0 , totalGeral_Linha = 0 , totalGeral_Coluna = 0;
		Scanner entrada = new Scanner(System.in);

		for (int linha = 0; linha < Matriz.length; linha++) {
			for (int coluna = 0; coluna < Matriz.length; coluna++) {
				System.out.println("Digite o valor : " + "Linha [" + linha + "] " + " Coluna [" + coluna +"] ");
				Matriz[linha][coluna] = entrada.nextInt();
			}

		}

		for (int i = 0; i < Matriz.length; i++) {

			somarLinha = 0;
			somarColuna = 0;

			for (int j = 0; j < Matriz.length; j++) {

				somarLinha = somarLinha + Matriz[i][j];
				somarColuna = somarColuna + Matriz[i][j];
				
			}
			
			System.out.println("Soma das Linhas : " + somarLinha);
			System.out.println("");
			System.out.println("Soma das Colunas : " + somarColuna);
			System.out.println("");
			
			totalGeral_Linha = totalGeral_Linha + somarLinha;
			totalGeral_Coluna = totalGeral_Coluna + somarColuna;
			
		}
		
		System.out.println("Total geral de todas linhas : " + totalGeral_Linha);
		System.out.println("Total geral de todas Colunas : " + totalGeral_Coluna);
	}

}
