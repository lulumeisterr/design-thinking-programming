package br.com.fiap.recursivo;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {

		/*
		 * 7) Escreva um m�todo em JAVA que receba por
			  par�metro dois n�meros inteiros (x e y). Retornar
              para o main() o resultado da pot�ncia de xy.
		 */
		int x = 0;
		int y = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a base");
		x = entrada.nextInt();
		System.out.println("Digite o expoente");
		y = entrada.nextInt();
		
		//potencia(x, y);

		potencia(x, y);
	}

	
	
	public static int pot(int base , int exp){
		
		if(exp == 0){
			return 1;
		}else{
			return pot(base,base * exp);
		}
		
		
	}

	public static void potencia(int base , int exp){
		Scanner entrada = new Scanner(System.in);

		int aux = 0;
		for (int i = 1; i <= exp; i++) {
		aux = base * exp * base;
		
		}
		
		System.out.println(aux);

	}



}
