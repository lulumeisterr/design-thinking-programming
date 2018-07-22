package br.com.fiap.recursivoParaPS;

public class Recursivo_3 {

	public static void main(String[] args) {
		
		int n1 = 10;
		
		recursivo(n1);
		
	}
	
	public static int recursivo(int n1){
	
		if(n1 == 1){
			return 1;
		}else 
			if(n1 % 2 == 1){
			System.out.println(n1);
			}
			return recursivo(n1-1);
		}
		
	}

