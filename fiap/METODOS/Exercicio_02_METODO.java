package br.com.fiap.METODOS;

import java.util.Scanner;

public class Exercicio_02_METODO {


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = entrada.nextInt();
		
		System.out.println("Digite a operação");
		System.out.println("Para Somar Selecione o [ + ]");
		System.out.println("Para Multiplicar Selecione o [ * ]");
		System.out.println("Para Subtrair Selecione o [ - ]");
		System.out.println("Para Dividir Selecione o [ / ]");
		char operacao = entrada.next().charAt(0);
		
		
		System.out.println("Digite outro numero");
		int numero2 = entrada.nextInt();
		
		Calcular_Soma(numero, numero2 , operacao);
		
	}
	
	
	public static void Calcular_Soma(int numero , int numero2 , char operacao){
		
		System.out.println("");
		
		switch (operacao) {
		case '+':
			System.out.println(numero + numero2);
			break;

		case '-':
			System.out.println(numero - numero2);
			break;
			
		case '*':
			System.out.println(numero * numero2);
			break;
			
		case '/':
			System.out.println(numero / numero2);
			break;
			
			
		default:
			System.out.println("Operador nao encontrado");
			break;
		}
		
		
	}
	
	
	
	
}