package br.com.fiap.VETOR_LISTA_02;

import java.util.Scanner;

public class Exercicio8_naoterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arrayVet[] = new int[20];
		

		
		Scanner entrada = new Scanner(System.in);
		int cont = 0 , j;
		
		System.out.println("Digite um numero ");
		arrayVet[0] = entrada.nextInt();
		
			for (int i = 1; i <= arrayVet.length; i++) {
				
				//So entra nessa divisao se o numero digitado for divisivel por 1
				if(arrayVet[i] % i == 0){
					
					cont++;
				}
			
			}
			
			if(cont > 2){
				System.out.println("Numero Não é primo");
			}else{
				System.out.println("O Numero é primo");
			}
			
				
			
			
			
		}
		
		
	}
		
	


