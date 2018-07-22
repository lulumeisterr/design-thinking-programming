package br.com.fiap.MATRIZ.METODO.REFAZENDO;

import java.sql.Array;
import java.util.Scanner;

// Ententendo Matriz P!
/*
 *  i = Linha , J = Coluna
 *  se I for igual a J = 0;
 */
public class MatrizSecun_Principal_treino {

	public static void main(String[] args) {

		int ArrayMatriz[][] = new int [5][5];
		int e = 0;
		//Matriz Diagonal Principal 0,1
		Scanner entrada = new Scanner(System.in);
		do{

			System.out.println("Digite 1 Para Matriz Diagonal Principal");
			System.out.println("--------------------------------------");
			System.out.println("Digite 2 Para Matriz Diagonal Secundaria");
			System.out.println("--------------------------------------");
			e = entrada.nextInt();
			
			switch (e) {
			case 1:
				M_Principal();
				break;

			case 2:
				M_Secundaria();
				
			default:
				System.out.println("saiu");
				break;
			}

			System.out.println("--------------------------------------");
			System.out.println("Digite 3 para Continuar ? ");
			System.out.println("Digite 4 Para sair");
			e = entrada.nextInt();

		}while(e == 3 || e >  4);

	}


	//Principal
	public static void M_Principal(){
		int maiorP = 0;
		int ArrayMatriz[][] = new int [5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if(i == j){
					ArrayMatriz[i][j] = 1;
					maiorP = ArrayMatriz[i][j];
				}else{
					ArrayMatriz[i][j] = 0;
				}
			}
		}
		//Exibindo Saida
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(ArrayMatriz[i][j]);
			}
		}
		System.out.println("Maior Valor da Princicpal : " + maiorP);
	}
	//==========================================================================================
	//Secundaria
	public static void M_Secundaria(){
		int ArrayMatriz[][] = new int [5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) {

				if( i + j == 4 ){
					ArrayMatriz[i][j] = 1;
				}else{
					ArrayMatriz[i][j] = 0;
				}
			}
		}
		//Exibindo Saida
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) {
				System.out.println(ArrayMatriz[i][j]);
			}
		}
	}
}


