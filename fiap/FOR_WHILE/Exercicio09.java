package br.com.fiap.FOR_WHILE;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("Digite o numero");
			i = entrada.nextInt();
			
			if(i % 2 == 0){
			}else{
				System.out.println("IMPAR !!");
			}
			
			
		}
		
	}

}
