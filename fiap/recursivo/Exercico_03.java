package br.com.fiap.recursivo;

public class Exercico_03 {

	public static void main(String[] args) {
		
		/*
		 * 3) Escreva um método (recursivo) em JAVA que
			  mostre na tela os números de 1 a 50.
		 */
		
		recursivo(1);
		int n1 = 1;
		recursivo(n1);
	}
	
	public static int recursivo(int n1){
		
		if(n1 == 50){
			System.out.println(n1);
			return 50;
		}else{
			System.out.println(n1);
			return recursivo(n1+1);
		}
		
	}

	
	public static void recursivo2(int n1){
		
		if(n1 == 50){
			System.out.println(n1);
		}else{
			System.out.println(n1+1);
		}
	}

}
