package br.com.fiap.ordenacao;

public class BubbleSort {

	public static void main(String[] args) {


		//https://www.youtube.com/watch?v=cUF_3sz0fR8

		/*
		 * O selection sort consiste em pegar sempre o menor valor 
		 * (ou o maior, dependendo do seu problema) 
		 * e passar para a primeira posição. Depois, 
		 * pegamos o segundo menor e colocamos 
		 * na segunda posição e assim vai até ordenar os elementos.
		 */


		String nome [] = {"Amanda" , "LUCAS" , "YUDI" , "JABER" , "WES"};
		//int codigo [] = {1 , 2 , 3 , 4 , 5 };
		//int codigo []  = {10,5,3,2,1,4};
		//String dayweek [] = {"Segunda" , "Terça" , "Quarta" , "Quinta" , "Sexta"};
		String x = "LUCAS";
		//porCodigo(nome, codigo, dayweek);
		//System.out.println(ordena(nome));
		//ordernarPorCodigo(codigo);
		
		System.out.println(buscaBinaria(nome , "JABER"));


	}

	public static String buscaBinaria(String[] nome, String x) {

		int meio;
		int inicio = 0;
		int fim = 0;

		//Inicio contem indice inicial do vetor
		//fim O tamanho do vetor -1;

		inicio = 0;
		fim = nome.length-1;

		while(inicio <= fim){

			meio =  (inicio + fim) / 2;
			if(nome[meio] == x){
				System.out.println("Nome Encontrado : " + x );
				return "Na posição : " + meio;
			}else 
				if(nome[meio].length() < x.length()){
					inicio = meio + 1;
				}else
					if(nome[meio].length() > x.length()){
						inicio = meio - 1;
					}
		}

		return "Não encontrado";
	}

	public static void ordernarPorCodigo(int codigo []){

		boolean controle = false;
		int aux = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if(codigo[j] > codigo[j+1]){
					aux = codigo[j];
					codigo[j] = codigo[j+1];
					codigo[j+1] = aux;
				}
			}

			if(controle){
				break;
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(codigo[i]);
		}
	}


	public static void  porCodigo(String nome [] , int codigo [] , String dayweek []){

		boolean controle;
		String auxNome = "";
		int auxCodigo = 0;
		String auxDayweek = "";


		for (int i = 0; i < 5; i++) {
			controle = true;
			for (int j = 0; j < 4; j++) {

				if(codigo[j] > codigo[j +1]){
					auxCodigo = codigo[j];
					codigo[j] = codigo[j+1];
					codigo[j+1] = auxCodigo;

					auxNome = nome[j];
					nome[j] = nome[j+1];
					nome[j+1] = auxNome;

					auxDayweek = dayweek[j];
					dayweek[i] = dayweek[j+1];
					dayweek[j+1] = auxDayweek;

					controle = false;


				}

				if(controle){
					break;
				}
			}
		}

		for (int i = 0; i < dayweek.length; i++) {
			System.out.println("Codigo : " + codigo[i] + "\n" + 
					"Nome : " + nome[i] + "\n" + 
					"Dia da semana : " + dayweek[i]);
		}
	}

	public static String ordena(String nome []){


		boolean controle;
		String aux = "";

		for (int i = 0; i < nome.length; i++) {
			controle = true;

			for (int j = 0; j < nome.length-1; j++) {
				if(nome[j].compareTo(nome[j+1]) > 0){
					aux = nome[j];
					nome[j] = nome[j+1];
					nome[j+1] = aux;

					controle = false;
				}
			}

			if(controle){
				break;
			}

		}

		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}
		return "===========Ordenado==============";
	}

}
