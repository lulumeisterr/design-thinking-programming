package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio07_VETOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * Faça um algoritmo em JAVA que receba do usuário 10 números inteiros e os guarde em
		   um vetor. Percorrer o vetor e verificar se existe número igual a 20. Se encontrar, somar
		   quantos existem. (Pode ter números repeKdos).
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 0;
		int soma = 0;
		
		int v[] = new int[10];
		
		while(i < v.length){
		
		System.out.println("Digite um numero ");
		v[i] = entrada.nextInt();
		
		if(v[i] == 20){		
			System.out.println("Valor Encontrado : ");
			if(v[i] == 20){
				
			soma = soma += v[i];
			}
			
		}
		
		i++;
		
		}
		
		System.out.println("===========================");
		System.out.println("Soma dos Valores Encontrados : " + "Soma : " + soma );
		
	}

}
