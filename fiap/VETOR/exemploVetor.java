package br.com.fiap.VETOR;

public class exemploVetor {

	public static void main(String[] args) {
		
		int recebe;
		
		int NomeVetor[] = new int [3];  // Slots <-
		                                // Sempre começa por 0 
										// [ 0 , 1 , 2 ]
		
		//Atribuindo valores 
		
		NomeVetor[0] = 1;
		NomeVetor[1] = 2;
		NomeVetor[2] = 3;

		recebe = NomeVetor[0] + NomeVetor[1] + NomeVetor[2];
		
		System.out.println("Resultado :" + recebe);
		

	}

}
