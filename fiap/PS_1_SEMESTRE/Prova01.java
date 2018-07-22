package br.com.fiap.PS_1_SEMESTRE;

import java.util.Scanner;

public class Prova01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 0;

		int idade[] = new int[3];
		String nome[] = new String[3];
		int guardar[] = new int [3];

		String guardaNomeMaior = "";
		String guardaNomeMenor = "";
		String guardaIdadeIgual = "";

		int GuardaIdadeMaior = 0;
		int GuardaIdadeMenor = 0;

		int Igual = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < nome.length; i++) {

			System.out.println("Digite o nome");
			nome[i] = entrada.next();

			System.out.println("Digite a Idade");
			idade[i] = entrada.nextInt();


			if(i == 0){

				GuardaIdadeMaior = idade[i];
				guardaNomeMaior = nome[i];

				GuardaIdadeMenor = idade[i];
				guardaNomeMenor = nome[i];

			}else
				if(idade[i] > GuardaIdadeMaior){
					GuardaIdadeMaior = idade[i];
					guardaNomeMaior = nome[i];
				}else
					if(idade[i] < GuardaIdadeMenor){
						GuardaIdadeMenor = idade[i];
						guardaNomeMenor = nome[i];
					}else{
						for (int k = 0; k < idade.length; k++) {
							if(idade[i] == idade[i]){
								Igual = idade[i];
								guardaIdadeIgual = nome[i];
							}
						}
						
					}
			}
		
			System.out.println("Fulano com maior idade : " + "Nome : " + guardaNomeMaior + " Idade : " + GuardaIdadeMaior);
			System.out.println("Fulano com menor idade : " + "Nome : " + guardaNomeMenor + " Idade : " + GuardaIdadeMenor);
			System.out.println("Fulano com Idade Igual : " + "Idade : " +"\n"  //ARRUMAR O LOOP
														   + Igual + "\n" +
														    " Nome : " + guardaIdadeIgual);
				
			
		

	}

}
