package br.com.fiap.ordenacao;

import java.util.Arrays;

public class SelectionSort {

	
	/*
	 * A  cada passo , eu vou procurar o menor valor do vetor
	 * e mudar ele para a primeira possicao do vetor
	 */
	public static void main(String[] args) {

		int orderna []  = {15,5,3,2,1,4,0};

		SelectionSort(orderna);
		System.out.println(Arrays.toString(orderna));
	}

	public static void SelectionSort(int vetor []) {

	int menor_valor, menor_indice;
		
		//Percorro desdo começo do vetor ate a anti pnultima pósicao
		for (int i = 0; i < vetor.length - 1; i++) {
			
			menor_valor = vetor[i];
			
			//Menor valor recebe o menor elemento
			menor_indice = i;
			
			//Ele vai verificar da proxima casa do vetor + 1
			//Ele vai veriricar se este for é menor que o menor_indice
			//Se for menor_indice passar a receber J
			
			for (int j = i + 1; j < vetor.length; j++){
				if (vetor[j] < menor_valor){
					
					menor_valor = vetor[j];
					menor_indice = j;
				}
			}
			
			vetor[menor_indice] = vetor[i];
			vetor[i] = menor_valor;
		}

	}



}
