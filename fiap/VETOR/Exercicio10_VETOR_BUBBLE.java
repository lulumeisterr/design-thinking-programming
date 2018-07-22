package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio10_VETOR_BUBBLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array[] = { 1 , 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 , 10};
		int aux;
		boolean controle;
		
		for(int i = 0 ; i < array.length; ++i){
		
			controle = true;
			//Para sair da condição
		
						//Para não acessar o membro que 
						//não esteja fora do limite do vetor
			
			for(int j = 0 ; j < (array.length - 1); ++j){
			
				//Um membro é maior que o proximo ?
				//< DE
				//> CRE
				
				if(array[j] > array[j + 1]){
					
					aux =  array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					
					//
					controle = false;
				}
			}
			
			if(controle){
				break;
			}
		}

		for (int i = 0; i < 10 ; i++) {
			System.out.println(array[i] + " ");
		}
		
	}

}
