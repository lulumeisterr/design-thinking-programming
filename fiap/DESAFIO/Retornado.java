package br.com.fiap.DESAFIO;

import java.util.Scanner;

public class Retornado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int conta = 0 , n1 = 0;
		int X = 0;	

		System.out.println("Digite o numero a ser invertido");
		conta  = entrada.nextInt();	

		//Retorna Inverso
		int indicador = 0;	

		while (conta > 0) {
			indicador = indicador * 10; // i =* 10
			indicador = indicador + (conta % 10); // i =+ (conta %10);
			conta = conta / 10;
		}
		System.out.print(indicador);
	}
}

