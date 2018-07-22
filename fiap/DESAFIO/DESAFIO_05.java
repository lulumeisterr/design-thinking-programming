package br.com.fiap.DESAFIO;

import java.util.Scanner;

/* 

a = a + b, fazemos: a +=b
a = a - b, fazemos: a -=b
a = a * b, fazemos: a *=b i=*10
a = a / b, fazemos: a /=b
a = a % b, fazemos: a %=b

%d - Representa numeros inteiros
%f	representa números floats
%2f	representa números doubles
%b	representa valores booleanos
%c	representa valores char

printf - dados formatados
http://www.devmedia.com.br/system-out-objeto-de-saida-em-java/25240

length = Mostra o tamanho da String
valueOf -> transforma um número para String... 
parse -> transforma uma uma string para número. 
CharAT = Retorna o posicionamento da String
Character.getNumericValue : o valor numérico Unicode que representa um caractere especificado.
 */

public class DESAFIO_05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int conta = 0 , n1 = 0;
		int X = 0;
		
		System.out.println("Digite o numero da conta");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o numero a ser invertido");
		conta  = entrada.nextInt();

		
		//Retorna Inverso
		int indicador = 0;
		
		while (conta > 0) {
			indicador = indicador * 10; // i =* 10
			indicador = indicador + (conta % 10); // i =+ (conta %10);
			conta = conta / 10;			// c /= c

		}
		System.out.printf("O número invertido é: %d.\n", indicador);
		
		System.out.println("");
		
		//Calculando o Numero Conta + Inverso
		
		X = n1 + indicador;
		System.out.println("Resultado do numero da conta + a inverso :" + X);
		
		
		System.out.println("---------------------------------------");
		
		
		//Buscando Numero
		
		String a; //Retorna as casa decimais
		String a1;
		String a2;
		
		
		int b = X;
		
		char c;
		char p2;
		char p3;
		

		a = String.valueOf(b);
		a1 = String.valueOf(b);
		a2 = String.valueOf(b);
	
		
		System.out.println("Quantas Casas D ? : " + a.length());
		
		
		c = a.charAt(0);
		System.out.println("Posição do numero Somado 1: " + c);
		
		
		p2 = a1.charAt(1);
		System.out.println("Posição do numero Somado 2: " +p2);
		
		
		p3 = a2.charAt(2);
		System.out.println("Posição do numero Somado 3:" + p3);
		
		
		System.out.println("");
		
		
		int i = Character.getNumericValue((c + p2));
		System.out.println("Multiplicando a possição :" + (i*1));
		
		int j = Character.getNumericValue((p2));
		System.out.println("Multiplicando a  possição :" + (j*2));
		
		int l = Character.getNumericValue((p3));
		System.out.println("Multiplicando a  possição :" + (l*3));
			
		
	}
	
}

