package br.com.fiap.VETOR_LISTA_02;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Exercicio02_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada = new Scanner(System.in);

		int vetor1[] = new int[5];
		int vetor2[] = new int[5];
		int vetor3[] = new int[5];
		char operador;

		System.out.println("1 Vetor");

		for (int i = 0; i < vetor1.length; i++) {

			System.out.println("Digite o " + (i + 1) + " ° Numero do primeiro vetor");
			vetor1[i] = entrada.nextInt();

		}


		System.out.println("2 Vetor");


		for (int i = 0; i < vetor2.length; i++) {

			System.out.println("Digite o " + (i + 1) + " ° Numero do segundo vetor");
			vetor2[i] = entrada.nextInt();

		}
		
		
		System.out.println("Digite o operador Aritmetico");
		operador = entrada.next().charAt(0);
		
		switch (operador) {
		case '+':
			
			for (int i = 0; i < vetor3.length; i++) {
				vetor3[i] = (vetor1[i] + vetor2[i]);
				System.out.println(vetor3[i]);
			}
			
			break;

		
		case '-':
			for (int i = 0; i < vetor3.length; i++) {
				
				vetor3[i] = (vetor1[i] - vetor2[i]);
				System.out.println(vetor3[i]);
			}
			
			break;
			
			
			
		case '*':
			for (int i = 0; i < vetor3.length; i++) {
				
				vetor3[i] = (vetor1[i] * vetor2[i]);
				System.out.println(vetor3[i]);
			}
			
			break;
			
			
		case '/':
			for (int i = 0; i < vetor3.length; i++) {
				
				vetor3[i] = (vetor1[i] / vetor2[i]);
				System.out.println(vetor3[i]);
			}
			
			default:
				System.out.println("Operador Não divisivel por 0");
		
				break;
		}
		
	}

		

}
