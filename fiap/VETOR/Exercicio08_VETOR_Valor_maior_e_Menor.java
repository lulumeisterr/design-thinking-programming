package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio08_VETOR_Valor_maior_e_Menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fa�a um algoritmo em JAVA que carregue 
		 * um vetor de 5 posi��es e determine e exiba o
		   MAIOR valor encontrado.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int v[] = new int[3];
		
		int i = 0;
		int valorMenor;
		int valorMaior;
		
		valorMaior = v[i];
		valorMenor = v[i];
		
		while(i < v.length){
		System.out.println("Digite um numero");
		v[i] = entrada.nextInt();
	
			if(i == 0){
				
				valorMaior = v[i];
				valorMenor = v[i];
			}
		
			if(v[i] > valorMaior){
				valorMaior = v[i];
			}else 
				if(v[i] < valorMenor){
					valorMenor= v[i];
			}
				
				i++;
			}
		
	
		i = 0;
		
		while(i < v.length){
			
			System.out.println("Posi��es : " + i +  " - Valores Digitados : " + v[i]);
			
			i++;
			
		}
	
		System.out.println("");
		
		//Erro em exibir o valor Menor
		//Erro em pegar a posicao do valor maior
		

		System.out.println("Maior Valor : " + valorMaior + " - " + "Posi��o : " + v.length);
		System.out.println("Valor menor : " + valorMenor + " - " + "Posi��o : " + v.length);
		
	
		
	}

}
