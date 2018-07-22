package br.com.fiap.FOR_WHILE;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	
	int base;
	int expo;
	int i = 0;

	
	while(i != -1){
	
		System.out.println("Digite a base [A]");
		i = entrada.nextInt();
		
		System.out.println("Digite o expoente[E]");
		expo = entrada.nextInt();	
		
		//Math.pow calcula potencia (INDICE * EXPOENTE)
		base = (int) Math.pow(i, expo);
		
		System.out.println("Resultado : " + base);
		
		System.out.println("\t");
	}
	
	}

}
