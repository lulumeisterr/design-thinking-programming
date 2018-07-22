package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class ExemploProff {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);

		int i, j;
		float mat[][], vet[];
		mat = new float[3][5];
		vet = new float[3];
		System.out.println("Digite 15 números: ");
		for(i=0; i<3; i++){
			vet[i] = 0;
			for(j=0; j<5; j++){
				mat[i][j]=entrada.nextFloat();
			}
		}
		soma_linhas(mat,vet);
		for(i=0;i<3;i++){
			System.out.println("Soma da linha "+i+" = "+vet[i]);
		}
	}

	public static void soma_linhas(float m[][], float v[]){

		int i,j;
		for(i=0; i<3; i++){
			for(j=0; j<5; j++){
				v[i] = v[i] + m[i][j];
			}
		}
	}


}
