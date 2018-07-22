package br.com.fiap.METODOS;

import java.util.Scanner;

public class Exercicio_01_METODO {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		System.out.println("Soma");
		System.out.println("Subtracao");
		System.out.println("Multiplicacao");
		System.out.println("Divisao");
		
		char opcao = entrada.next().charAt(0);

		switch (opcao) {
		case 'A':

			somar();

			break;

		case 'B':

			Subtracao();

			break;

		case 'C':

			Multipli();

			break;

		case 'D':
			Divisao();
			

		default:
			break;
		}


	}

	public static void somar(){

		Scanner entrada2 = new Scanner(System.in);

		int num1 , num2 , soma;

		System.out.println("Digite o primeiro numero ");
		num1 = entrada2.nextInt();

		System.out.println("Digite o primeiro numero ");
		num2 = entrada2.nextInt();

		soma = num1 + num2;

	}


	public static void Multipli(){

		Scanner entrada2 = new Scanner(System.in);

		int num1 , num2 , mult;

		System.out.println("Digite o primeiro numero ");
		num1 = entrada2.nextInt();

		System.out.println("Digite o primeiro numero ");
		num2 = entrada2.nextInt();

		mult = (num1 * num2);

	}


	public static void Divisao(){


		Scanner entrada2 = new Scanner(System.in);

		int num1 , num2 , divisao;

		System.out.println("Digite o primeiro numero ");
		num1 = entrada2.nextInt();

		System.out.println("Digite o primeiro numero ");
		num2 = entrada2.nextInt();

		divisao = (num1 / num2);

	}

	public static void Subtracao(){

		Scanner entrada2 = new Scanner(System.in);

		int num1 , num2 , sub;

		System.out.println("Digite o primeiro numero ");
		num1 = entrada2.nextInt();

		System.out.println("Digite o primeiro numero ");
		num2 = entrada2.nextInt();


		sub = (num1 - num2);

	}


}
