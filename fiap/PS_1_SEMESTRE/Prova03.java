package br.com.fiap.PS_1_SEMESTRE;

import java.util.Scanner;

public class Prova03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero[] = new int[5];
		int par = 0;
		int save = 0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Solicite um numero");
			numero[i] = entrada.nextInt();
			
			
			if(numero[i] % 2 == 0){
				
				System.out.println("Par");
				par++;
				
			}else{
				System.out.println("Impar");
				save = numero[i] + save;
				//System.out.println("Contando : " + save);
			}
			
			
		}
		
		System.out.println("Soma dos numeros impar's : " + save);
		System.out.println("Quantidade de numeros par : " + par);
		
	}

}
