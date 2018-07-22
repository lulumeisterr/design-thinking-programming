package br.com.fiap.METODOS;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Exercicio_04_METODO {

	public static void main(String[] args) {

		int resultado  = 0 ,x  = 0 , n1 = 0 , n2 = 0 , T = 0 , T1 = 0 , T2 = 0 ,T3 = 0 , pegaValor = 0;

		Scanner entrada = new Scanner(System.in);
		String op = "" , s = "";

		System.out.println("Para Somar Selecione o [ 1 ]");
		System.out.println("Para Multiplicar Selecione o [ 2 ]");
		System.out.println("Para Subtrair Selecione o [ 3 ]");
		System.out.println("Para Dividir Selecione o [ 4 ]");
		System.out.println("Digite 5 para sair");
		System.out.println("===========================================================");



		System.out.println("Digite um numero");
		n1 = entrada.nextInt();

		System.out.println("======Digite a operação=====");
		op = entrada.next();

		System.out.println("Digite um numero");
		n2 = entrada.nextInt();


		switch (op) {

		case "+":
			System.out.println(Somar(n1, n2));
			break;
		case "*":
			System.out.println(Multiplicar(n1, n2));
			break;
		case "-":
			System.out.println(Subtrair(n1, n2));
			break;
		case "/":
			System.out.println(Dividir(n1, n2));
			break;

		default:
			System.out.println("Operador invalido");
			break;

		}

		do{

			System.out.println("========Deseja Continuar S/N=========");
			s = entrada.next();

			if(s.equalsIgnoreCase("s")){

				System.out.println();

				System.out.println("Selecione a Operação : " + "\n"
						+ "Soma  [+] " + "\n" + 
						"Mult  [*] " + "\n" + 
						"Sub   [-] " + "\n"
						+   "Div   [/]");
				pegaValor = entrada.nextInt();


				System.out.println("Digite um numero");
				resultado = entrada.nextInt();

				if(pegaValor == 1){
				
					int guardaS = 0;
					Somar(n1, n2); //Aq eu executo o soma
					guardaS = Somar(n1, n2);
					T1 = resultado + guardaS;
					System.out.println("Novo resultado " + T1);
					
				}

				if(pegaValor == 2){
					int guardaM = 0;
					Multiplicar(n1, n2);
					guardaM = Multiplicar(n1, n2);
					T2 = resultado * guardaM;
					System.out.println("Novo resultado " + T2);
				}

				if(pegaValor == 3){
					Subtrair(n1, n2);
					int guardaSub = 0;
					guardaSub = Subtrair(n1, n2);
					T3 = (resultado - guardaSub);
					System.out.println("Novo resultado " + T3);
				}

				if(pegaValor == 4){
					int guardaV = 0;
					Dividir(n1, n2);
					guardaV = Dividir(n1, n2);
					T = (resultado / guardaV);
					System.out.println(T);
				}

			}
		}while(s.equals("s"));
	}

	public static int Somar(int n1 , int n2){
		int resultado  = 0;
		resultado = (n1 + n2);
		return resultado;
	}

	public static int Multiplicar(int n1 , int n2){
		int resultado  = 0;
		resultado = (n1 * n2);
		return resultado;
	}

	public static int Subtrair(int n1 , int n2){
		int resultado  = 0;
		resultado = (n1 - n2);
		return resultado;
	}

	public static int Dividir(int n1 , int n2){
		int resultado  = 0;
		resultado = (n1 / n2);
		return resultado;
	}

}


