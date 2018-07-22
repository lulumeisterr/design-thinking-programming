package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio09_VETOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * Faça um algoritmo em JAVA que receba o nome e a idade de 100 estudantes. 
		 * Mostrar na
		   tela o nome e a idade somente dos maiores de 25 anos
		 */


		String nome[] = new String[5];
		int idade[] = new int[5];

		Scanner entrada = new Scanner(System.in);

		int j = 0;
		int idadeX = 0;


		for (int cont = 0; cont < 5 ; cont++) {

			System.out.println("Digite o seu nome [ " +cont+ " ] : ");
			nome[cont] = entrada.next();

			System.out.println("Digite sua idade : [ " +j+" ] ");
			idade[j] = entrada.nextInt();

			if(idade[j] > 25){
				idadeX = idade[j];
				System.out.println(" Nome : " + nome[cont] + "/" + 
							 		 "Idade : " + idadeX);

			}



		}


	}



}



