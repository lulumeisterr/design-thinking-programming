package br.com.fiap.recursivoParaPS;

import java.util.Scanner;

public class Recursivo_01 {

	public static void main(String[] args) {

		//Recursividade metodo que chama ele mesmo

		Scanner entrada = new Scanner(System.in);

		int n1= 0;

		System.out.println("Digite um numero");
		n1 = entrada.nextInt();
	
		System.out.println(recursivo(n1));
	}

	
	public static int recursivo(int n1){
		
		if(n1 == 2){
			return 2;
		}else{
			return n1  + recursivo(n1 - 2);
		}
		
	}
	
	public static void Iterativo(int n1){
		
		int soma= 0;
		for (int i = 2; i <= n1; i++) {
			if(i%2==0){
				
				soma = soma+i;
			}
			System.out.println(soma);
		}
		
		
	}

}
