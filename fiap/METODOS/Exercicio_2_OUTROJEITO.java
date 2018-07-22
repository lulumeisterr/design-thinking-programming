package br.com.fiap.METODOS;

import java.util.Scanner;

public class Exercicio_2_OUTROJEITO {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int calculo = 0;
		String e = "Operador não encontrado";
		System.out.println("Para Somar Selecione o [ 1 ]");
		System.out.println("Para Multiplicar Selecione o [ 2 ]");
		System.out.println("Para Subtrair Selecione o [ 3 ]");
		System.out.println("Para Dividir Selecione o [ 4 ]");
		System.out.println("===========================================================");
		System.out.println("Digite a operação");
		
		calculo = entrada.nextInt();
		
		System.out.println("Digite um numero");
		int n1 = entrada.nextInt();
		
		System.out.println("Digite um numero");
		int n2 = entrada.nextInt();
		
		switch (calculo) {
		
		case 1:
			Somar(n1, n2);
			break;
		
		case 2:
			Multiplicar(n1, n2);
			break;
		case 3:
			Subtrair(n1, n2);
			break;
		case 4:
			Dividir(n1, n2);
			break;
		default:
			System.out.println(e);
			break;
		}	
	
		
	}
	
	public static void Somar(int n1 , int n2){
		System.out.println(n1 + n2);
	}

	public static void Multiplicar(int n1 , int n2){
		System.out.println(n1 * n2);
	}
	
	public static void Subtrair(int n1 , int n2){
		System.out.println(n1 - n2);
	}
	
	public static void Dividir(int n1 , int n2){
		System.out.println(n1 - n2);
	}
	
}
