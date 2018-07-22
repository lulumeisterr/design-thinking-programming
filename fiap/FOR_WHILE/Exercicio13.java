package br.com.fiap.FOR_WHILE;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada = new Scanner(System.in);

		/**
		 * Faça um programa que receba do usuário 15 números inteiros.
		   Mostrar na tela quantos números positivos foram digitados. 
		 */
		
		for (int i = 0; i < 16; i++) {

			System.out.println("Digite um numero");
			i = entrada.nextInt();

			if(i > 0){
				i = i;
				System.out.println("Numero Positivo :" + i);
			}else{
				System.out.println("Numero negativo :" + i);
			}

			System.out.println("Quantos numeros positivos foram digitados : " + i);
			
		}


	}

}
