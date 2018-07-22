package br.com.fiap.FOR_WHILE;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada = new Scanner(System.in);
		
		double n1 = 0 , media;
		
		for (int i = 0; i < 20; i++) {
		System.out.println("Digite um numero");
		n1 = entrada.nextDouble();
		
		n1 = n1 / 3;
		System.out.println("Divisão do numero Digitado: " + n1);
		}
		
		
		
		
	}
		
}
