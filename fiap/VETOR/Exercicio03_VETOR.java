package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio03_VETOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont , i = 0 , soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de Loop");
		cont = entrada.nextInt();
		
		
		int v[] = new int[cont];
		cont = 0;
		
		while(i < v.length - 0){
			
			Scanner enter = new Scanner(System.in);
			
			System.out.println("Digite um numero que ser� multiplicado por 2");
			v[i] = enter.nextInt();
			
			soma = v[i] *= 2;
			
			i++;
			System.out.println("Posi��o : " + i + " - Multipliacao : "  + soma);
		}
		
		while(i <v.length){
			
			System.out.println("Posi��o : " + i + v[i]);
			i++;
		}
	}

}
