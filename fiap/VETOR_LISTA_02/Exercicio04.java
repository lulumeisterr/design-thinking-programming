package br.com.fiap.VETOR_LISTA_02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		int n1 = 0 , i = 0;
		double n2 = 0;
		double n3 = 0;
	
		
		do {

			System.out.println("Digite um numero [ ONE ]");
			n1 = entrada.nextInt();

		} while (n1 <= 0);

	
		while(n2 == n3){
			
			System.out.println("Digite outro Numero : ");
			n2 = entrada.nextDouble();

			System.out.println("Digite outro Numero : ");
			n3 = entrada.nextDouble();	
			
			if(n2 == n3){
			System.out.println("NUMEROS DEVEM SER DIFERENTES");
			}
			
		}
	
			if(n2 % 2 == 0){
				
				System.out.println("Ordem impar Crescente : " + n3 + "\n" + n2);
				
			}else
				if(n3 % 2 == 0){
					
					System.out.println("Ordem par Decrescente : " + n3 + "\n" + n2);
					
				}
			
	}
		
}





