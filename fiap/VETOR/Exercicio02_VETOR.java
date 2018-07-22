package br.com.fiap.VETOR;

import java.util.Scanner;

public class Exercicio02_VETOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Digita valores
		Scanner entrada = new Scanner(System.in);
		
		int cont,i=0;
	
		System.out.println("Digite a quantidade de numeros");
		cont = entrada.nextInt();
		
		float v[] = new float[cont];
		float v2[] = new float[cont];
		float v3[] = new float[cont];
	
		
		while(i < v.length){
			Scanner e = new Scanner(System.in);
			System.out.println("Digite um numero");
			v[i] = entrada.nextFloat();			
			i++;
			
		}
		
		i = 0;
		
		while(i < v.length){
			
		System.out.println("Posição : " + i + " - Valor Digitado : " + v[i]);
		i++;
		
		}
		//==================================//
	
		//2 VETOR
	
	
		i=0;
		while(i < v2.length){
			
		Scanner vetor2 = new Scanner(System.in);
		
		System.out.println("Digite os numeros do 2 Vetor : ");
		v2[i] = vetor2.nextInt();
	
		 i++;
		} 
		
		i = 0;
		
		while(i < v2.length){
	
			System.out.println("Posição : " + i + " -  Valor Digitado : " + v2[i]);
			i++;
		}		
		
		//3 VETORRRRRRR
		
		i = 0;
		
		while(i < v2.length){
			v3[i] = v[i] + v2[i];
			i++;
		}
	
		
        i = 0;
        
      //=========================================================
		
		while(i < v3.length){
	
			System.out.println("Posição : " + i + "\n" + " -  Resultado: " +  v3[i]);
			i++;
		}
	
	}
}

