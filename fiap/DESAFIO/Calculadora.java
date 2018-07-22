package br.com.fiap.DESAFIO;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int n1 , n2;
		String op;
		int conta = 0;
		
		System.out.println("Digite um numero");
		n1 = entrada.nextInt();
		
		System.out.println("Digite um operador");
		op = entrada.next();
		
		while((op != "/") &&  (op != "+")  && (op != "-") && (op != "*")){
			System.out.println("Digite o operador Corretamente");
			op = entrada.next();
			
		}
		
		System.out.println("Digite um numero");
		n2 = entrada.nextInt();
		
		
		switch (op) {
		case "/":
			break;
			
		case "+":
			conta = (n1 + n2);
			break;
			
		case "*":
			conta = (n1 * n2);
			break;
			
		case "-":
			conta = (n1 - n2);

		}
System.out.println("Resultado da conta :" + conta);
	}

}
