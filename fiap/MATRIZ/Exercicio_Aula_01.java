package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class Exercicio_Aula_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [][] Matriz = new int [5][6];
	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				
				if(j%2==0){
					Matriz[i][j] = 0;
				}else{
					Matriz[i][j] = 1;
				}
			}
			System.out.println("");
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println(Matriz[i][j]);
			}
		}
		
		
	}
}


