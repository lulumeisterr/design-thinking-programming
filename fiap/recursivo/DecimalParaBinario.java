package br.com.fiap.recursivo;

public class DecimalParaBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		decimalParaBinario(8);
	}

	public static void decimalParaBinario(int n){
		if(n > 0){
			decimalParaBinario(n/2);
			System.out.print(n%2);
		}
	}
	
}
