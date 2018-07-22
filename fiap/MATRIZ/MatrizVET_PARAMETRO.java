package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class MatrizVET_PARAMETRO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 	 Crie	 um	 método	 que	 receba	 como	 parâmetro	
		 *  dois	 vetores	 de	 dez	
			elementos	inteiros	posiKvos.	
			Mostre	na	tela	o	vetor	união	dos	dois	primeiros.	
		 */
		int a = 0;
		int b = 0;
		
		Scanner entrada = new Scanner(System.in);
			
		int A[] = new int [3];
		int B[] = new int [3];
		int U[] = new int [6];
		
		//Scanner entrada = new Scanner(System.in);
		
		int guardaB = 0;
		int guardaA = 0;
		
		for (int i = 0; i < A.length; i++) {
			System.out.println(" Digite um " + (i+1) + " Numero");
			A[i] = entrada.nextInt();
			
		}
		System.out.println("-");
		for (int j = 0; j < B.length; j++) {
			System.out.println(" Digite um " + (j+1) + " Numero");
			B[j] = entrada.nextInt();
			
			
		}
		numeros(A,B,U);
		
		for (int j = 0; j < U.length; j++)
		  System.out.println("VETORE'S :" + U[j]);
		
	}
	
	
	public static void numeros(int A[],int B[],int U[]){

		
		for (int i = 0; i < 3; i++) {
			U[i] = A[i];
		//System.out.println("VETORE'S :" + U[i]);
	}
		int j=0;
		for (int i=3 ; i < 6; i++) {
			U[i] = B[j];	
			j++;
			//System.out.println("VETORE'S :" + U[i]);
		}
		//System.out.println("VETORE'S :" + guardaA + " , " +  guardaB);
		}
		
	}
	

