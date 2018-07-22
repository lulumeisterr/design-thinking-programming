package br.com.fiap.MATRIZ.METODO.REFAZENDO;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz_Loja_Metodo {


	//Mostrar o menor Valor
	//Ver quantas vezes os valores se repetem
	//Quantas vezes cada 1 se repete

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nomeProd = {"Mouse" , "Fone" , "Teclado" , "Mouse" , "Mousepad" , "Gabinete"};
		String [] nameLoja = {"Razer" , "GAMES-ACADEMY" , "GamerHouse" , "TioDeco" , "PontoFrio" , "Americanas"};
		double Matriz [][] = new double [5][6];
		int codP [] = { 1 , 2, 3 ,4 ,5};
		int pegaCodigo = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Selecione o produto");
		System.out.println(" 1 Mouse");
		System.out.println(" 2 Fone");
		System.out.println(" 3 Teclado");
		System.out.println(" 4 Mousepad");
		pegaCodigo = entrada.nextInt();

		switch (pegaCodigo) {
		case 1:
			Mouse();
			break;
		case 2:
			fone();
			break;
		case 3:
			Teclado();
			break;
		case 4:
			Mousepad();
			break;
		case 5:

			break;
		default:
			System.out.println("Não encontrado");
			break;
		}

	}

	public static void Mouse(){

		Scanner entrada = new Scanner(System.in);
		int Ordena [] = new int [12];
		double Matriz [][] = new double [5][6];
		String [] nomeProd = {"Mouse" , "Fone" , "Teclado" , "Mouse" , "Mousepad" , "Gabinete"};
		String [] nameLoja = {"Razer" , "GAMES-ACADEMY" , "GamerHouse" , "TioDeco" , "PontoFrio" , "Americanas"};
		System.out.println("Digite um Valor para filtrar o produto mais em conta");
		int V = 0;

		Matriz[0][1] = 400;
		Matriz[0][2] = 125;
		Matriz[0][3] = 110;
		Matriz[0][4] = 320;
		Matriz[0][5] = 150;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				Matriz[i][j] = entrada.nextInt();
				Arrays.sort(Matriz[i]);
				System.out.println("Produto : " + nomeProd[i] + " Na Loja : " + nameLoja[i] + " Por : " + Matriz[i][j]);
			}
		}

		//Ordenando os valores
		int qtd , k;
		double aux;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if(Matriz[i][j] < Matriz[i][j+1]){
					aux = Matriz[i][j + 1];
				}
			}
		}

	}

	public static void fone(){

	}

	public static void Teclado(){

	}

	public static void Mousepad(){

	}



}