package br.com.fiap.DESAFIO;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		double nota1 = 0, 
			   nota2 = 0, 
			   X = 0;
		
		//Processamento
		try{
			
		System.out.println("Digite a primeira nota");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a primeira nota");
		nota2 = entrada.nextDouble();
		
		X = (nota1 + nota2)/2;
		
		if(X >= 6){
			System.out.println("Sua Nota está boa");
		}else{
			System.out.println("Exame");
		}
		
		}catch(java.util.InputMismatchException e){
			System.out.println("Erro , Você só pode digitar Numeros ! ");
		}
		//SAIDA
		System.out.println("Sua nota é :" + X);
		
		

	}

}
