package br.com.fiap.FOR_WHILE;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		
		/**
		 * Fa�a um programa que leia 15 
		 * n�meros e informe quantos n�meros maiores do que
 			30 foram digitados. 
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		
//		int n1 = 0;
//		
//		for (int i = 0; i < 5; i++) {
//		System.out.println("Digite um numero");
//		n1 = entrada.nextInt();
//		
//		if(n1 >= 30){
//			System.out.println("Numeros maiores que 30 : " + n1);
//		}
//	}
		
		//===============================================
		
		int i = 0;
		int numero = 0;
		int quantidade = 0;
		
		while(i < 15){
			Scanner correcao = new Scanner(System.in);
			
			System.out.println("Digite um numero");
			numero = correcao.nextInt();
			
			if(numero >= 30){

				quantidade++;
				i++; //ContinuarLoopp
			}
		System.out.println("Numeros maiores que 30 :" + quantidade );	
		}
		
	}
}
