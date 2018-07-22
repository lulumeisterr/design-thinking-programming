package br.com.fiap.recursivo;

public class MenorElementoVetorRecursao {

	public static void main(String[] args) {

		int vet [] = {1 , 3 , 10 , 11 , 5};
		int menor = buscarMenor(vet , 0 , vet.length-1);	
		System.out.println(menor);
	}
	
	
	
	private static int buscarMenor(int[] vet, int inicio, int fim) {	
		
		if( inicio == fim){
			return vet[inicio];		
		}else{	
			
			int n1 , n2;
			int meio;	
			
			meio = (inicio + fim)/2;	
			
			n1 = buscarMenor(vet, inicio, meio);
			
			n2 = buscarMenor(vet, meio+1, fim);		
			
			if(n1 < n2){
				return n1;
			}else{
				return  n2;
			}
		}
	}
}
