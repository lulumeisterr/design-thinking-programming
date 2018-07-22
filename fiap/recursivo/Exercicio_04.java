package br.com.fiap.recursivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {

		/*
		 * Escreva um método (recursivo) em JAVA que
		   mostre na tela números ímpares entre n e 1.
		   Obs.: n = número inteiro informado pelo usuário
		 */

		Scanner entrada = new Scanner(System.in);


		int user = 0;
		System.out.println("Digite um numero");
		user = entrada.nextInt();

		//		if(user % 2 == 1){
		//			System.out.println("Impar");
		//		}else{
		//			System.out.println("par");
		//		}

		System.out.println("====================");
		recursivo(user);
		System.out.println("====================");
		NoRecursivo(user);

	}


	//NoRecursivo

	public static void NoRecursivo(int n1){
		
		List<Integer> lista = new ArrayList<Integer>();
		
		//Preenchendo o List
		for (int i = 2; i <= n1; i++) {
			if((i%2) == 1){
			lista.add(i);
			}
		
		}
		
		//Exibindo
		System.out.println("EXIBINDO OS IMPAR");
			for (int i : lista) {
					Collections.reverse(lista);
					System.out.println("DECRESCENTE " +lista);
				}
		}
	
	

	//Recursivo Impar

	public static int recursivo(int n1) {

		if (n1 == 1){
			return 1;
		}
		else if(n1 % 2 == 1){
			System.out.println(n1);
		}
		return recursivo(n1-1);
	}

}



