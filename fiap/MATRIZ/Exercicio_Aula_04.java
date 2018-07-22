package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class Exercicio_Aula_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 4) Faça um programa em JAVA que preencha uma matriz 10 x 7 com
	números inteiros digitados pelo usuário, calcule e mostre quais
	elementos da matriz se repetem e quantas vezes cada um se repete.
		 */
		Scanner entrada = new Scanner(System.in);
		
		int vet1[] = new int [3];
		boolean rep = false;
		int vezes = 0;

		for (int i = 0; i < vet1.length; i++) {
			
			System.out.println("Digite " + (i+1) + " Numero");
			vet1[i] = entrada.nextInt();
		}
		
		//Pegando Valor repetido
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if(vet1[i] == vet1[j]){
					rep = true;
				}
				
			}

		}
		
		//Exibindo
		for (int i = 0; i < vet1.length; i++) {
			System.out.println(vet1[i]);
		}
		
			
	}
}

