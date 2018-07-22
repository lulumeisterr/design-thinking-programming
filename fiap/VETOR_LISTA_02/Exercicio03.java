package br.com.fiap.VETOR_LISTA_02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada = new Scanner(System.in);

		int qtf;

		System.out.println("Digite a quantidade de Funcionario");
		qtf = entrada.nextInt();

		int nr_sequencial = 100;
		
		float salario[] = new float[qtf];
		int codigo[] = new int[qtf];

		for (int i = 0; i < salario.length; i++) {
			System.out.println("Digite o valor do salario do " + ( i + 1) + " Funcionario");
			salario[i] = entrada.nextFloat();
			codigo[i] = nr_sequencial++;
		}
		
		
		for (int i = 0; i < codigo.length; i--) {
			
			if(salario[i] >= 4200){
				System.out.println("Codigo do Salario mais de 4200 : " + nr_sequencial);
				break;
				
			}else
				if(salario[i] < 4200){
					System.out.println("sem codigo de salario alto");
					break;
			}
		
			
		}
	

		



	}
}


