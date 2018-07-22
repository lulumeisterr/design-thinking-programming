package br.com.fiap.MATRIZ.METODO.REFAZENDO;

import java.util.Scanner;

public class RevisaoExemploMatriz {

	public static void main(String[] args) {

		byte x;
		Scanner s = new Scanner(System.in);
		System.out.print("Entre um valor inteiro (de 0 ate 25):");
		x = s.nextByte();
		System.out.println();
		fatorial(x);
		System.out.println();

	}
	
	public static void fatorial(byte n) {
		long fat = 1;
		if (n == 0)
			fat = 0;
		else
			for (int i = 1; i <= n; i++)
				fat *= i;
		System.out.println("Fatorial de " + n + "=" + fat);
	}

}
