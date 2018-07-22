package br.com.fiap.recursivoParaPS;

public class Recursivo_2 {

	public static void main(String[] args) {
		
		int n1 = 1;
		System.out.println(recursivo(n1));

	}

	public static int recursivo(int n1) {
		int guarda = 0;
		
		if(n1 == 50){
			return 50;
		}else{
			System.out.println(n1);
			return recursivo(n1 + 1);
		}
		
	}

}
