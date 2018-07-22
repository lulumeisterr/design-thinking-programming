package br.com.fiap.ordenacao;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
	
		//Joga o maior para direita
		//e ordena pelo menor
		
	//int orderna []  = {10,5,3,2,1,4};
	
	String nome [] = {"Amanda" , "LUCAS" , "YUDI" , "JABER" , "WES"};
	int codigo [] = {1 , 2 , 3 , 4 , 5 };
	String dayweek [] = {"Segunda" , "Terça" , "Quarta" , "Quinta" , "Sexta"};
	
	//insertionSort(orderna);
	//System.out.println(Arrays.toString(orderna));
	
	insertionAll(codigo, nome, dayweek);

	}
	
	
	
	public static void insertionAll(int[] codigo , String [] nome , String[] dayweek){
		
		int auXCodigo = 0;
		String auXNome = "";
		String auXdayWeek = "";
	
		int j = 0;
		int e = 0;
		int f = 0;
		
		
		for (int i = 1; i < dayweek.length; i++) {
			
			auXCodigo = codigo[i];
			auXNome = nome[i];
			auXdayWeek = dayweek[i];
			
			j = i - 1;
		
			while((j >= 0) && codigo[i] > auXCodigo){
				
				codigo[j+1] = codigo[j];
				nome[e + 1] = nome[e];
				dayweek[f+1] = dayweek[f];
				
				j = j - 1;
				
			}
			
			codigo[j + 1] = auXCodigo;
			nome[j+1] = auXNome;
			dayweek[j+1] = auXdayWeek;
			
		}
		
		
		for (int i = 0; i < dayweek.length; i++) {
			System.out.println("Codigo : " + codigo[i] + "\n" + 
							   "Nome : " + nome[i] + "\n" + 
							   "Dia da semana : " + dayweek[i]);
		}
		
	}
	
	

	public static void insertionSort(int[] orderna) {
		
		/**
		 * Método de ordenação, na qual são procurados
		   sucessivos elementos que se encontram fora de
		   ordem, retira o elemento da lista e depois insere
	       o elemento de forma ordenada. Este tipo de
	       ordenação em pequenas listas é rápido, sendo
	       extremamente lento para grandes listas.
	       
		 * @param orderna
		 * @author Lucas
		 * 
		 */
		
	
		int x = 0;
		int j = 0;

		for (int i = 1; i < orderna.length; i++) {
			x = orderna[i];
			//2 valendo 2
			//Comparar o x com os demais valores
			
			j = i - 1;
			while((j >= 0) && (orderna[j] > x)){
					orderna[j+1] = orderna[j];
					j = j -1;
				//empurrando o 8 para direita
			}
			
			orderna[j + 1] = x;
		}
		
	}
	
	
	public static int [] geradorVetor(int n){
		int n1 []  = new int [n];
		Random gerador = new Random();

		for (int i = 0; i < n1.length; i++) {
			n1[i] = gerador.nextInt(100);
		}
		return n1;
	}

}
