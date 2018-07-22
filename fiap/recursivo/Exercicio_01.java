package br.com.fiap.recursivo;

public class Exercicio_01 {

	public static void main(String[] args) {
	
	recursivo(1);	

	}
	
	public static int recursivo(int num){
		
		//Parada
		
		if(num == 0){
			
			return 1;
			
		}else{
			System.out.println(num);
			return (num + recursivo(num-1));
		}
		
	}

}
