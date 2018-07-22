package br.com.fiap.FOR_WHILE;

import java.util.Scanner;

public class Exercicio11_Maior_E_MenorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int n1 = 0;
		int guardaValorMaior = n1;
		int guardaValorMenor =  n1;
		

		for (int i = 0; i <= 9; i++) {

			System.out.println("Digite um numero:");
			n1 = entrada.nextInt();
		
			if(i == 0){
				guardaValorMaior = n1;
				guardaValorMenor =  n1;
			}else{
				
				if(n1 > guardaValorMaior){
					guardaValorMaior = n1;
				}else{
					if(n1 < guardaValorMenor){
						guardaValorMenor = n1;
					}
				}
			}
		
		}
		System.out.println("maior numero : " + guardaValorMaior);
		System.out.println("menor numero : " + guardaValorMenor);
		

	}
}






