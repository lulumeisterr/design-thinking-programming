package br.com.fiap.VETOR_LISTA_02;

public class ElementoNaoDuplicado {

	public static void main(String[] args) {
		
		int vet [] = {1 , 1 , 3 , 3 , 5 , 5 ,9};
		System.out.println(Elemento(vet));
	}

	
	//Achar o unico elemento que nao se repete
	
	public static int Elemento(int[] vet) {
	
		int result = 0;
		
		for (int i = 0; i < vet.length; i++) {
		
			result = result ^ vet[i];
		}
		
		return result;
		
		
	}
	
	
	
}
