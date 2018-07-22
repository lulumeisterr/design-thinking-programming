package br.com.fiap.recursivo;


/*
 * Quando eu quero guardar uma informação eu guardo em uma variavel
 * pois os sysout apenas mostra na tela
 */ 

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int n1 = 0;

		System.out.println("Digite um numero");
		n1 = entrada.nextInt();

		Norecursivo(n1);

		System.out.println(recursivo(n1));

	}

	public static int recursivo(int n1){
		if(n1==2) 
			return 2;
		else
			return (n1 + recursivo(n1 - 2));
		
	}
	
	public static void Norecursivo(int n1){
	int soma=0;	
	for (int i = 2; i<=n1; i++) {
			
			if(i%2==0){//par
				soma=soma+i;
			}
				
		}
	System.out.println(soma);
	
//		return n1;
		
	}
	
	




}
