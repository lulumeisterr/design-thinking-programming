package br.com.fiap.NAC;

import java.util.Scanner;

public class NAC01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		//NOME : LUCAS RODRIGUES DO NASCIMENTO		

		Scanner entrada = new Scanner(System.in);  

		int i = 0 , aux = 11;
		boolean controle;



		int vetor1[] = new int[5];
		int vetor2[] = new int[5];

		do {

			while( i < vetor1.length){
				System.out.println("Solicite o " + (i + 1)+ " Numero :");
				vetor1[i] = entrada.nextInt();

				i++;
			}

			i = 0;
			if(vetor1[i] <= 0){
				System.out.println("Este numero não é maior que zero , Tente novamente");
			}else{
				System.out.println("Numero valido");
			}

		} while (vetor1[i] <= 0);

		i = 0;

		System.out.println("Copia do 1 Vetor Resultado");

	
		for (int j = 0; j < vetor2.length; j++) {
			
			vetor2[j] = vetor1[aux];
			
			aux--;
		}

		for (int j = 0; j < (vetor2.length -1); j--) {
			
			System.out.println(vetor2[j]);
			
		}
		

	}

}


