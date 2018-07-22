package br.com.fiap.METODOS;

import java.util.Scanner;

public class Exercicio_05_METODO {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Trazer Horas , quantos minutos equivale aquela hora e quantos segundos restantes
		
		int seg = 0;
		
		System.out.println("Digite os segundos");
		seg = entrada.nextInt();
		
		Calcular_seg(seg);
		
	}

	
	public static void Calcular_seg(int seg){
		Scanner entrada = new Scanner(System.in);
		
		int PegaS = 0;
		int M = 0;
		int R = 0;
		int TOTAL = 0;
		
		//Pegando HORA
		PegaS = seg / 3600;//1 hora = 3600 segundos
		
		//Pegando MINUTOS
		M = ((seg % 3600)/60);//resto / 60
		
		//Segundos Restante
		R = (seg % 60);
		
		System.out.println(PegaS + ":" + M + ":" + R);
		
	}
	
}
