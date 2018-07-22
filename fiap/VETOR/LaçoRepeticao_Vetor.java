package br.com.fiap.VETOR;

import java.util.Scanner;

public class LaçoRepeticao_Vetor {

	public static void main(String[] args) {
		Scanner cont = new Scanner(System.in);

		int i = 0;
		
		int soma = 0;
		
		System.out.println("Digite a Quantidade de numeros");
		i = cont.nextInt();
		
		//============================================================//
		
		int v[] = new int [i];
		i = 0;
		
		//==========================================================//
		
		
		while(i < v.length){
			
			
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite um Numero");
			v[i] = entrada.nextInt();
			
			//Somando a todo o loop
			  soma += v[i];
			
			  i++;
		}
		
		//=======================================================//
			
		i  = 0;
		
		System.out.println("===========");
		
		
		//SAIDA
		while(i < v.length){
			
			//Exibindo Todos as slots do vetor
			System.out.println(i + " - " + v[i]);
			i++;
			
		}
		System.out.println("Resultado da soma é : " + soma);
	}

}
