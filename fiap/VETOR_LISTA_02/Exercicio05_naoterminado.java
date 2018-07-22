package br.com.fiap.VETOR_LISTA_02;

import java.util.Scanner;

public class Exercicio05_naoterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		float notaS[] = new float[3];
		String nome[] = new String[3];
		int i = 0 , qntd = 0;
		String X = "";
		float media =0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantidade de Pessoa");
		qntd = entrada.nextInt();
		
		while(i < nome.length){
			
			System.out.println("Digite o Nome do " + (i + 1) + " ° Aluno");
			nome[i] = entrada.next();
			i++;
		}
		
		
		i = 0;
		
		while(i < notaS.length){
			
			System.out.println("Digite a media Semestral do " + ( i + 1 ) + " Aluno ");
			notaS[i] = entrada.nextFloat();
			
			
			media = (notaS[i] + notaS[i]) / qntd;
			
			i++;
		}
		
		i = 0;
		
		
		while(i < notaS.length){
			
			if(notaS[i] > media){
				
			X = nome[i];
		
			System.out.println("Aluno com media Semestral Acima da Turma : " + X);
			
			break;
			
			}else{
				System.out.println("not");
			}
			
			i++;
			
		}
	}

}
