package br.com.fiap.MATRIZ;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] preco = new int [3][4];
		String[] nomeLoja = {"Loja - A","Loja - B","Loja - C","Loja - D","Loja - E"};
		String[] nomeProd = {"MOUSE","MOUSEPAD","TECLADO MEMBRANA","TECLADO MECANICO","MONITOR 144","GABINETE","MOUSEBOUNG","FONE","TAPA-SOM","CADEIRA-DX","K","L"};

		int 	prodLojaBarato = 0 , 
				prodLojaCaro = 0 , 

				NomeLoja1Caro = 0 , 
				NomeLoja2Barato = 0;


		double produtoMaisCaro = 0;
		double produtoMaisBarato = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Informe o preço na loja : " + nomeLoja[j]);
				preco[i][j] = entrada.nextInt();

				if(i == 0 && j == 0){

					produtoMaisCaro = preco[i][j];
					prodLojaCaro = i;
					NomeLoja1Caro = j;


					produtoMaisBarato = preco[i][j];
					prodLojaBarato = i;
					NomeLoja2Barato = j;
				}else{

					if(preco[i][j] > produtoMaisCaro){

						produtoMaisBarato = preco[i][j];
						prodLojaBarato = i;
						NomeLoja2Barato = j;

					}else

						if(preco[i][j] < produtoMaisBarato){

							produtoMaisBarato = preco[i][j];
							prodLojaBarato = i;
							NomeLoja2Barato = j;


						}
				}

			}
		}

		System.out.println("===================================");
		System.out.println("");
		System.out.println("===================================");


		//Produto mais barato


		System.out.println(" Produto mais barato : " + nomeProd[prodLojaBarato]);
		System.out.println(" Loja do produto : " + nomeLoja[NomeLoja2Barato]);
		System.out.println(" Produto mais Barato : " +  produtoMaisBarato);


		//Produto mais CARO

		System.out.println(" Produto mais caro: " + nomeProd[prodLojaCaro]);
		System.out.println(" Loja do produto : " + nomeLoja[NomeLoja1Caro]);
		System.out.println(" Produto mais caro : " +  produtoMaisCaro);

	}

}
