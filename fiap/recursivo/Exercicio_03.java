package br.com.fiap.recursivo;

public class Exercicio_03 {

	public static void main(String[] args) {

		int n1 = 1;
		recursivo(n1);
		System.out.println("=============================");
		noRecursivo(n1);
	}


	//No Recursivo
	public static void noRecursivo(int n1){

		for (int i = 0; i < 50; i++) {
			System.out.println(n1+i);
		}


	}

	//Recursivo
	public static int recursivo(int n1){

		if(n1 == 50){
			System.out.println(n1);
			return 50;
		}else{
			System.out.println(n1);
			return recursivo(n1+1);
		}

	}


}


