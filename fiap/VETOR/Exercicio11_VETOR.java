package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio11_VETOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		double mediaBi = 0;

		double arrayNota[] = new double [ 5 ];


		while(i < arrayNota.length){

			Scanner entrada = new Scanner(System.in);

			System.out.println("Digite a " + (i + 1) + " ° Nota");
			arrayNota[i] = entrada.nextDouble();
			i++;

			}
		
				
			for (int j = 0; j < arrayNota.length; j++) {
				
				for (int j2 = 0; j2 < arrayNota.length; j2++) {
					
				}
			}
			
			

			i = 0;

			while( i < arrayNota.length){

				System.out.println(" Notas : -> " + arrayNota[i]);
				i++;
			}

			i = 0;

			while( i < arrayNota.length){

				System.out.println(" 5 Melhores Notas : -> " + arrayNota[i]);
				i++;
			}
		}

	}

