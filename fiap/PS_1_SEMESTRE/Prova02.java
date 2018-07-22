package br.com.fiap.PS_1_SEMESTRE;

import java.util.Scanner;

public class Prova02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Não Esta pegando o nome
		//Saindo Varias Vezes o resultado 
		
		Scanner entrada = new Scanner(System.in);
		
		float soma = 0;
		int numero = 0;
		int w = 10;

		String nome[] = new String[10];
		float salario[] = new float [10];
		
		System.out.println("===================================================");
		System.out.println("Solicite {1} Para Cadastrar o Funcionario");
		System.out.println("Solicite {2} Para Verificar os dados Cadastrados");
		System.out.println("Solicite {3} Para Sair");
		System.out.println("===================================================");
		

			for (int e = 0; e < w; e++) {
				
				System.out.println(" =[ Digite aqui A identificacao das opções acima ]= ");
				numero = entrada.nextInt();

				switch (numero) {
				case 1:

					for (int i = 0; i < salario.length; i++) {
						
						System.out.println("Nome Para Cadastro");
						nome[i] = entrada.next();

						System.out.println("Salario do Funcionario");
						salario[i] = entrada.nextFloat();
					
						soma = soma + salario[i];
						
						break;
					}
					
					break;

				case 2:
					
					System.out.println("===========================");
					
					for (int i = 0; i < e; i++) {
						
					System.out.println("Nome Digitado : " + nome[i]);
					System.out.println("Salario Digitado : " + salario[i]);
						
					System.out.println("");
	
					
					}
					
					System.out.println("==========SOMA=========");
					System.out.println("Soma do Salario : " + soma);
					System.out.println("=======================");
					
					break;

				}
				if(numero != 1 && numero != 2 && numero != 3){
					System.out.println("STOP");
					break;
				}else
					if(numero == 3){
						System.out.println("Você Saiu");
						break;
					}
			
		}

	}

}
