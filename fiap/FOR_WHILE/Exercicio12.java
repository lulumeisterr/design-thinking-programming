package br.com.fiap.FOR_WHILE;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fa�a um programa que receba um n�mero digitado pelo usu�rio e
		   ent�o imprima os m�ltiplos de 3 no intervalo entre 1 e o n�mero digitado
           pelo usu�rio.
		 */

		Scanner entrada = new Scanner(System.in);

		int 	num = 0, 
				menor = 0, 
				maior = 0;

		System.out.println("Entre com um n�mero inteiro:");
		Scanner scn = new Scanner(System.in);
		num = scn.nextInt();

		for(int i=1; i<=num; i++){

			if(i%3==0){

				System.out.println(num);

			}

			i++;

		}

	} 


}


