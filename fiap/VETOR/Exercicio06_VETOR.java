package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio06_VETOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Fa�a um algoritmo em JAVA que receba do usu�rio 7 n�meros reais e os guarde em um
		   vetor. Percorrer o vetor e verificar se existe n�mero igual a 18. Se exisKrem, escrever a
 		   posi��o em que est� armazenado. (Pode ter n�meros repeKdos)
 		 */
		
		
		double v[] = new double[7];
		
		int i = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while(i < v.length){
			
		System.out.println("Digite um numero");
		v[i] = entrada.nextDouble();
		
		if(v[i] == 18){
			System.out.println("Posi��o : " + i);
		}
		
		i++;
		}
		
		
	}

}
