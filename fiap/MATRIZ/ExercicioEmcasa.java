package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class ExercicioEmcasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] arrayNumeros = new int[3][3];
		
		Scanner entrada = new Scanner(System.in);
		
		for (int indLinha = 0; indLinha < arrayNumeros.length; indLinha++) {
		
			for (int indColuna = 0; indColuna < arrayNumeros.length; indColuna++) {
				System.out.println("Informe o elemento da matriz - Linha : " + indLinha + " - Coluna : " + indColuna + ":");
				arrayNumeros[indLinha][indColuna] = entrada.nextInt();
			}
			System.out.println("");
		}
		
		
	}

}
