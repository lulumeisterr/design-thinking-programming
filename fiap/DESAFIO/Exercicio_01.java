package br.com.fiap.DESAFIO;

import java.util.Scanner;

public class Exercicio_01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Entrada 
		String nome;
		int dtnasc , ano , X;
		
		//Processamento 
		System.out.println("Escreva o seu nome");
		nome = entrada.next();
		
		System.out.println("Digite sua data de nascimento");
		dtnasc = entrada.nextInt();
		
		System.out.println("Digite o ano Atual");
		ano = entrada.nextInt();
		
		X = (ano - dtnasc);
		
		//SAIDA
		
		System.out.println("Sua idade é");
		
		System.out.println(X);
		
		
	}
	

}
