package br.com.fiap.DESAFIO;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String destino = "";
		double idaVolta = 0;
		
		
		System.out.println("Digite o destino");
		System.out.println("NORTE");
		System.out.println("Nordeste");
		System.out.println("Centro Oeste");
		destino = entrada.next();
		
		
		if(destino.equalsIgnoreCase("Norte")){
			idaVolta = 100 + 80;
			System.out.println("Ida e volta RS$ :" + "\n" +  idaVolta);
		}
		
		if(destino.equalsIgnoreCase("Nordeste")){
			idaVolta = 205 + 170;
			System.out.println("Ida e volta R$ :" + "\n" + idaVolta);
		}
		
		if(destino.equalsIgnoreCase("Centro-Oeste")){
			idaVolta = 548 + 459;
			System.out.println("Ida e volta RS$ :"  + "\n" + idaVolta);
		}
		

	}

}
