package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio06_VETOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Faça um algoritmo em JAVA que receba do usuário 7 números reais e os guarde em um
		   vetor. Percorrer o vetor e verificar se existe número igual a 18. Se exisKrem, escrever a
 		   posição em que está armazenado. (Pode ter números repeKdos)
 		 */
		
		
		double v[] = new double[7];
		
		int i = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while(i < v.length){
			
		System.out.println("Digite um numero");
		v[i] = entrada.nextDouble();
		
		if(v[i] == 18){
			System.out.println("Posição : " + i);
		}
		
		i++;
		}
		
		
	}

}
