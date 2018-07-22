package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class Exercicio_Aula_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Matriz[][] = new int[7][7];
		int somar = 0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.println("Digite um numero");
				Matriz[i][j] = entrada.nextInt();
				
				if(i + j > 6){
					somar = somar + Matriz[i][j];
				}
			}
			System.out.println(somar);
		}
		
	}

}
