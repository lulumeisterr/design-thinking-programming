package br.com.fiap.VETOR;

import java.util.Scanner;

public class EXERCICIO10_OUTRA_FORMA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int vetor[] = new int[10];
		
		int qtd , k , aux;
	
		
		for (int i = 0; i < vetor.length; i++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Entre com 10 numeros inteiros");
			vetor[i] = entrada.nextInt();
		}
		
		
		qtd= 10;
		k = 9;
		
		for (int i = 0; i <qtd ; i++) {
		
			for (int j = 0; j < k; j++) {
				if(vetor[j] < vetor[j + 1]){
					aux = vetor[j + 1];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
				
				k--;
			}
			
		}
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println(vetor[i]);
		}
		
	}

}
