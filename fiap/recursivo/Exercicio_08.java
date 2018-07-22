package br.com.fiap.recursivo;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {

		/*
		 * 1) Escreva um método (recursivo) em JAVA que
	  mostre na tela a soma de um intervalo fornecido.
	  O Usuário fornecerá 2 números inteiros.	
		 */

		int n1 = 0;
		int n2 = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite 1numero");
		n1 = entrada.nextInt();

		System.out.println("digite 1 numero");
		n2 = entrada.nextInt();

		intervalo(n1, n2);
	}



	public static void intervalo(int n1 , int n2){

			for (int i = n1; i < 1; i++) {
				System.out.println(i);
			}
			
			for (int j = n2; j < 1; j++) {
				System.out.println(j);
			}


		}
	}






