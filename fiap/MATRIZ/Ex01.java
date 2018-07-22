package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] ArrayMatriz = new int[4][4];

		Scanner entrada = new Scanner(System.in);

		int somaLinha = 0;
		int guardaValor = 0;

		//Entrada de Valores
		
		for (int i = 0; i < ArrayMatriz.length; i++) {
			for (int j = 0; j < ArrayMatriz.length; j++) {
				System.out.println("Digite um numero - Linha : " + i + " Coluna : " + j);
				ArrayMatriz[i][j] = entrada.nextInt();
			}
			System.out.println("");
		}

		//SOMAR AS LINHAS
		
		for (int Linha = 0; Linha < ArrayMatriz.length; Linha++) {
			somaLinha = 0;
			for (int coluna = 0; coluna < ArrayMatriz.length; coluna++) {
				
				somaLinha = somaLinha + ArrayMatriz[Linha][coluna];
			
				//Calculando Todos os Valores
				 guardaValor =+ somaLinha;
			}
			
			System.out.println("Soma linha : " + Linha + ":" + somaLinha);
			
		}
			//Exibindo a soma de todas as linhas
			System.out.println("Todos os Valores : " + guardaValor);
	}
}

