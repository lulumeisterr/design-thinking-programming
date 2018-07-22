package br.com.fiap.PS_1_SEMESTRE;

import java.util.Scanner;

public class Prova04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		int numero[] = new int[5];
		int verifica =0;
		
		boolean controle;
		
		int k = 4; 
		int q = 5;
		
		int y = 4;
		int x = 5;
		
		int aux = 0;
		int e = 0;

		System.out.println("Solicite [1] Para Ordernar Para ordem Crescente , Menor para o Maior");
		System.out.println("Solicite [2] Para Ordernar Para ordem Decrescente , Maior para o menor");
		System.out.println("Solicite [3] Para Sair");
		
		System.out.println();
		
		System.out.println("Digite o numero Para Acessar as opções acima");
		verifica = entrada.nextInt();

		do {

			if(verifica == 1){
				for (int i = 0; i < numero.length; i++) {
					System.out.println("Digite um numero");
					numero[i] = entrada.nextInt();
				}



				for (int i = 0; i < numero.length; i++) {
					for (int j = 0; j < k; j++) {
						if(numero[j] > numero[j +1]){
							aux = numero[j];
							numero[j] = numero[j +1];
							numero[j + 1] = aux;
						}

						k--;
					}
				}

				for (int i = 0; i < numero.length; i++) {
					System.out.println(numero[i]);
				}

			}else{
				if(verifica == 2){

					for (int i = 0; i < numero.length; i++) {
						System.out.println("Digite um numero");
						numero[i] = entrada.nextInt();
					}


					for (int i = 0; i < numero.length; i++) {
						for (int j = 0; j < y; j++) {
							if(numero[j] < numero[j +1]){
								aux = numero[j];
								numero[j] = numero[j +1];
								numero[j + 1] = aux;
							}

							y--;
						}
					}

					for (int i = 0; i < numero.length; i++) {
						System.out.println(numero[i] + ", ");
					}

				}
			}


		} while (verifica < 0);


		if(verifica == 3){
			System.out.println("Saiu");

		}else{
			if(verifica != 2 || verifica != 3){
				System.out.println("Ordem Terminada");
			}
		}



	}
}


