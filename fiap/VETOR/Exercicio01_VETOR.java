package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio01_VETOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		
		int cont = 0 , cont2 = 0 , cont3 = 0;
		
		System.out.println("Digite a quantidade de vezes ");
		cont = entrada.nextInt();
		
		int i[] = new int [cont];
		cont = 0;
		
		int vetor2[] = new int[cont];
		
		while(cont2 < i.length){
			
			Scanner v = new Scanner(System.in);
			
			System.out.println("Digite o " + (cont2 + 1) + " º numero");
			i[cont3] = v.nextInt();
		
			vetor2[cont3] = i[cont3];
			cont2++;
		}

		cont2 = 0;
		
		while(cont2 < i.length){
			System.out.println(cont2 + " - " + i[cont2]);
			cont2++;

		}
	}
}


