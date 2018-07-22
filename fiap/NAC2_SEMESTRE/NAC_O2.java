package br.com.fiap.NAC2_SEMESTRE;

import java.util.Scanner;

public class NAC_O2 {

	public static void main(String[] args) {


		/*
		 * Faça um programa em JAVA que preencha uma matriz 10x3 com as notas de
		   dez alunos em três provas. O programa deverá mostrar um relatório com o
	       número dos alunos (número da linha), nome do aluno e a prova em que cada
		   aluno obteve a menor nota. Ao final do relatório, deverá mostrar quantos alunos
		   tiveram menor nota em cada uma das provas: na prova 1, na prova 2 e na prova 3.
		   (2 pontos)
		 */

		int nota[][] = new int[2][3];
		String nome[] = new String[2];

		int contAluno = 0;

		int prova1 = 0; //10
		int prova2 = 0; //5
		int prova3 = 0; //3

		int menor  = 0;
		Scanner entrada = new Scanner(System.in);


		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o nome");
			nome[i] = entrada.next();
			contAluno++;
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite a " + (j+1) + " nota");
				nota[i][j] = entrada.nextInt();
			}
		}


		//Exibir Nota e nome dos alunos
		for (int i = 0; i < 2; i++) {
			System.out.println(nome[i]);
			for (int j = 0; j < 3; j++) {

				if(nota[i][j] < prova1){
					prova1 = nota[i][j];
					nota[i][j] = prova1;
				}else
					if(nota[i][j] < nota[i][j]){
						prova2 = nota[i][j];
						nota[i][j] = prova2;
					}else
						if(nota[i][j] < nota[i][j] && nota[i][j] < nota[i][j]){
							prova3 = nota[i][j];
							nota[i][j] = prova3;
						}

				System.out.println("Menor nota : " + nota[i][j]);
			}
		}


		//Total de aluno
		int total = nome.length;
		System.out.println("Total de aluno : " + total); 
	}

}


