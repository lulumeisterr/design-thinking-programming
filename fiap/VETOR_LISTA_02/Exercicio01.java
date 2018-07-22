package br.com.fiap.VETOR_LISTA_02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int tamanho;
	

		System.out.println("Digite o tamanho do vetor");
		tamanho = entrada.nextInt();

		int arrayV[] = new int[tamanho];

		for (int i = 0; i < arrayV.length; i+=3) {

			//if(i % 3 == 0){
			 
			 System.out.println(arrayV.length);
			 //}

			
			i++;
		}


	}

}
