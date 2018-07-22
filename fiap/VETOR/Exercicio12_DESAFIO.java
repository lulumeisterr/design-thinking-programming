package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio12_DESAFIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int tabuada = 3;

		for (int i = 0; i <= 10; i++) {
			
			System.out.println("Tabuada do  : " + tabuada );
			System.out.println(i + " x " + tabuada + " = ");
			System.out.println(i * tabuada);
			
		}

	}

}
