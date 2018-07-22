package br.com.fiap.MATRIZ;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculandoMedia_porLinha_EX {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);

		double pegarLinhas = 0;
		double pegarNotas = 0;

		DecimalFormat notaFormato = new DecimalFormat("#,##0.00");

		double[][] notas = new double[10][3];

		for (int i = 1; i < 10; i++) {

			System.out.println("Aluno : " + i);
			pegarLinhas = 0;

			for (int j = 0; j < 3; j++) {

				System.out.println("Informe a nota da " + ( j + 1 )  +" prova");
				notas[i][j] = entrada.nextFloat();

				pegarLinhas = pegarLinhas + notas[i][j] / 3;
			}
			
			System.out.println("Nota calculada : " + notaFormato.format(pegarLinhas));
			System.out.println("");

		}

	}

}


