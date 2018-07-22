package br.com.fiap.VETOR_LISTA_02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio09_naoterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada = new Scanner(System.in);

		int qntd = 0;
		int k = 0 , removidos = 0;


		System.out.println("Quantidade de vezes que você deseja Relizar esta operação");
		qntd = entrada.nextInt();

		int arrayUser[] = new int[qntd];
		int ArrayCopia[] = new int[qntd];


		for (int j = 0; j < arrayUser.length; j++) {

			System.out.println("Solicite o " + ( j + 1) + " ° Numero ");
			arrayUser[j] = entrada.nextInt();


			for (int i = 0; i < ArrayCopia.length; i++) {

				ArrayCopia[i] = arrayUser[j];
						
				if(ArrayCopia[i] == arrayUser[j]){
					removidos++;
				}else{
					ArrayCopia[k++] = ArrayCopia[i];
				}
				
			}
		}

		for (int i = 0; i < arrayUser.length; i++) {
			
			System.out.println("N  : " + arrayUser[i]);
			System.out.println("removidos " + removidos);
			
		}



		System.out.println("");




	}



}











