package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio05_VETOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada = new Scanner(System.in);

		int cont = 0 , i = 0;
		
		
		System.out.println("Quantas vezes vc deseja realizar ?");
		cont = entrada.nextInt();
		
		int v[] = new int [cont];
		cont = 0;
		
		while(i < v.length){

			Scanner porcento = new Scanner(System.in);

			System.out.println("Digite um numero : ");
			v[i] = porcento.nextInt();

			if(v[i] % 2 == 0){
				System.out.println("Par");
			}else{
				System.out.println("IMPAR !!");
			}
			
			i++;
		}	

	}


}


