package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class Exercicio_Aula_06 {

	public static void main(String[] args) {


		int codigoProduto[] = { 1 , 2 , 3 ,4 ,5 };
		String nameProd[] = {"MOUSE" , "TECLADO" , "FONE" , "MOUSEPAD" , "MOUSEBOUNG"};
		String nameLoja[] = {"PONTO FRIO" ,"AliExpress", "GA-STORE" , "Mercado Livre", "Amazom" , "Americanas"};
		double[][] precoProd = new double[5][6];

		Scanner entrada = new Scanner(System.in);

//		System.out.println("1 - MOUSE");
//		System.out.println("2 - Teclado");
//		System.out.println("3 - Fone");
//		System.out.println("4 - Mousepad");
//		System.out.println("5 - MouseBoung");

		System.out.println("");


		//Armazenando os Codigos
		for (int i = 0; i < codigoProduto.length; i++) {

			if(codigoProduto[i] == i+1){

				System.out.println("Produto : " + nameProd[i] + "\n" + "Loja : " + nameLoja[i]);
				System.out.println("");

			}
		}


		for (int i = 0; i < 5; i++) {
			System.out.println("Digite os valores do produto : ");

			for (int j = 0; j < 6; j++) {
				precoProd[i][j] = entrada.nextDouble();

				if(precoProd[i][j] <= 100){
							System.out.println("Nome da Loja : " + nameLoja[j] + "\n" + 
							"Nome do produto : " + nameProd[j] + "\n" + 
							"Preço do Produto : " + precoProd[i][j] );
				}
			}

		}
	}
}

