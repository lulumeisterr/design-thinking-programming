package br.com.fiap.METODOS;

import java.util.Scanner;

public class Exercicio_07_METODO {

	public static void main(String[] args) {
		
		/*
		 * 3)	Faça	um	método	que	receba	dois	valores	antigo	e	atual	de	um	produto.	O	
			método	 deve	 retornar	 o	 percentual	 de	 acréscimo	 entre	 esses	 valores.	
			Mostrar	o	resultado	no	main().	
		 */
		double antigo = 0;
		double novo = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor Antigo de um produto");
		antigo = entrada.nextDouble();
		
		AntiAtual(antigo, novo);
		
		System.out.println("Digite o valor NOVO de um produto");
		novo = entrada.nextDouble();
		
		

	}
	
	
	
	public static double AntiAtual(double ant , double novo){
		
		double r = 0;
		double antigo = 0;
		double novo1 = 0;
		
		r = (antigo * novo1) * 1.10;
		
		return r;
		
	}
	

}
