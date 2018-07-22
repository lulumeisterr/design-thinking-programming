package br.com.fiap.recursivo;

import java.util.Scanner;

public class Exercicio_06_fibonaci {

	public static void main(String[] args) {

		/*
		 * Sequ�ncia de Fibonacci consiste numa sucess�o infinita de n�meros 
		 * que obedecem um padr�o em que cada elemento
		 * subsequente � a soma dos dois anteriores. Assim, ap�s 
		 *  0 e 1, v�m 1,2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc.
		 */

		//Somando os elementos anteriores para o proximo elemento

		/*
		 * a) Fa�a um m�todo recursivo que receba n > 0 e calcule Fn.
		   b) Fa�a uma vers�o n�o recursiva.
	       c) Responda: O m�todo recursivo � t�o eficiente quanto o n�o recursivo? Porque?
		 */

		for (int i = 0; i != 10; i++) {
			System.out.println(recursivo(i));
		}
		
		System.out.println("============================");
		
		NoRecursivo(9);


	}

	//B
	public static void NoRecursivo(int n1){
		
			//0 e 1, v�m 1 , 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc.
		
		int a = 1;
		int b = 0;
		
		int aux;
	
		for (int i = 0; i <= n1; i++) {
			System.out.println(a);
			
		
			/* No primeiro la�o o [AUX] Vale 1 E O [A] vale 1; E O [B] Guarda o valor Somado de 1+0 = 1 A + B
			 * Na segunda passada o [AUX] e o [A] Continua valendo 1 mas o B Esta valendo 1 que sera somado 1 + 1;
			 * ------------------A + B = 2-------------------------------------
			 * O [B] Passa a guardar o valor Somado que sera 1 DA PRIMEIRA PASSADA
			 * ----------------------------------------------------------------
			 * Na terceira passada o [A] passa a valer 2 e o , B Continua valendo 1;
			 * ------------------ A + B = 3-------------------------------------
			 * O [B] Passa a guardar o valor da soma que sera 2 , DA SEGUNDA PASSADA;
			 * ------------------------------------------------------------------
			 * Na Quarta passada o AUX esta VALENDO 3 e o B passa VALER 2;
			 * --------------------A + B = 5--------------------------------------
			 * Na Quinta passada o AUX esta Valendo 5 e o B esta VALENDO 3;
			 */
			
			aux = a; 
			
			a = a + b; 
			
			//Guardando o valor
			b = aux;
		}
		
		System.out.println(b);
	}



	//A
	public static int recursivo(int n1){

		if(n1 == 0 || n1 == 1){

			return 1;
		}

		//CALCULO DO FIBONACI
		return recursivo(n1-1) + recursivo(n1-2);

	}
	
	
	
	/*
	 * 	- C) - O Metodo recursivo � mais simples e facil de entender 
		       tornando mais simples sua compreens�o. Para pequenas aplica��es e explica��es do metodo
	 */

}	



