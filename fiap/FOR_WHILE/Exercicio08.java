package br.com.fiap.FOR_WHILE;

import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/**
	 * Faça um programa que receba 100 
	 * números digitados pelo usuário e
	   mostre na tela a soma dos números digitados. 
	 */
		
	int n1 = 100;
	
	
	int soma = 0;
	int incremento = 0;
	
		while(incremento < 5){
			
			Scanner entrada = new Scanner(System.in);
		
			
			System.out.println("digite um numero");
			n1 = entrada.nextInt();
			
			soma = soma + n1;
			incremento++;
			
		}
		System.out.println("Soma dos numeros Digitados : " + soma);
	}
}
