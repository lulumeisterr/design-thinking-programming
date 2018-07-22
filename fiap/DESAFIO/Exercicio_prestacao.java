package br.com.fiap.DESAFIO;

import java.util.Scanner;

public class Exercicio_prestacao {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		double salbruto ,
			   vlpresta , 
			   X;
		
		//PROCESSAMENTO
		try{
		
			
		System.out.println("Solicite o valor do salario bruto");
		salbruto = entrada.nextDouble();
		
		System.out.println("Valor da prestação");
		vlpresta = entrada.nextDouble();
		
		X =(salbruto * 30)/100;
		
		if(salbruto >= X){
			System.out.println("Emprestimo reprovado");
		}else{
			System.out.println("Emprestimo aprovado");
		}
		
		}catch(java.util.InputMismatchException e){
			System.out.println("Você Digitou um caracter no lugar do numero");
		}
		entrada.close();
	}

}
