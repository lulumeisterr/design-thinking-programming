package br.com.fiap.NAC2_SEMESTRE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NAC_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char sexo [] = new char [5];
		char corOlhos[] = new char [5];
		char corBelo [] = new char[5];
		int idade [] = new int [5];

		int menu = 0;
		int cont  = 0;

		int olhoCastanho = 0;
		int olhoAzul = 0;

		int cabeloLoiro = 0;
		int cabeloPreto = 0;
		int cabeloCastanho = 0;

		int Contsexo = 0;
		int qtdMaxima = 0;

		int contIdade = 0;

		System.out.println("Quantas veze deseja realizar o cadastro");
		cont = entrada.nextInt();

		do{

			System.out.println("===========Menu=============");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Media de idade");
			System.out.println("3 - Maior idade entre habitantes");
			System.out.println("4 - quantidade de indivíduos do sexo feminino com idade entre 18 e 30 anos (");
			System.out.println("5 - OrdernarInsertion por cor dos olhos");
			System.out.println("6 - OrdernarBubble por cor dos olhos");
			System.out.println("7 - OrdernarSelection por cor dos olhos");
			System.out.println("8 - Busca Sequencial");
			System.out.println("9 - Busca Binaria");
			System.out.println("10 - Saiu");
			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				if(qtdMaxima < cont){
					qtdMaxima = Cadastro(olhoAzul , sexo, corOlhos , corBelo , idade , cont , olhoCastanho , cabeloPreto , cabeloLoiro , cabeloCastanho , Contsexo);

				}else{
					System.out.println("Quantidade maxima atingida");
				}
				break;


			case 2:
				MediaIdade(corOlhos, corBelo, idade , cont);
				break;

			case 3:
				maiorIdade(idade , cont);
				break;

			case 4:
				qntdF(Contsexo , sexo ,idade, cont, corBelo, corOlhos, cabeloLoiro, olhoAzul , contIdade);
				break;

			case 5:
				ordenarInsertionSort(corOlhos, cont , sexo  , corBelo,idade);
				break;

			case 6:
				System.out.println(ordenarBubble(corOlhos, cont , sexo  , corBelo,idade));
				break;

			case 7:
				System.out.println(ordernarSelection(corOlhos, cont , sexo  , corBelo,idade));
				break;

			case 8:
				Sequencial(idade, cont);
				break;

			case 9:
				buscaBinariaPorIdade(idade, cont);
				break;

			case 10:
				OrdenarIdade(idade, cont);
				break;

			case 11:
				System.out.println("Sair");
				break;

			default:
				System.out.println("Opção não encontrada");
				break;
			}


		}while(menu < 11);


	}

	public static void OrdenarIdade(int[] idade , int cont){

		int aux = 0;
		boolean controle = false;
		for (int i = 0; i < cont; i++) {
			controle = true;
			for (int j = 0; j < cont-1; j++) {

				if(idade[j] > idade[j+1]){
					aux = idade[j];
					idade[j] = idade[j+1];
					idade[j+1] = aux;
				}
				if(controle){
					break;
				}
			}

		}

		for (int j = 0; j < cont; j++) {
			System.out.println("idade ordenada na posicao : " + (j+1) + " Idade : " + idade[j]);
		}
	}



	public static int buscaBinariaPorIdade(int[] idade , int cont){

		Scanner entrada = new Scanner(System.in);
		OrdenarIdade(idade, cont);

		int pesq = 0;
		int inicio;
		int fim;
		int meio = 0;
		boolean acha = false;
		
			System.out.println("Idade para a pesquisa");
			pesq = entrada.nextInt();

			inicio = 0;
			fim = idade.length-1;
			
			while(inicio <= fim){
				meio = (inicio + fim) / 2;
				if(idade[meio] == pesq){
					acha = true;
					return meio;
				}else 
					if(idade[meio] < pesq){
						inicio = meio + 1;
					}else
						if(idade[meio] > pesq){
							fim = meio - 1;
						}
			}
			
//			if(acha ==  true){
//				System.out.println(idade[meio]);
//				}else{
//					System.out.println("Não encontrado");
//				}
			
			return -1;
	}

	public static void Sequencial(int[] idade , int cont){

		Scanner entrada = new Scanner(System.in);

		int pesq = 0;
		int i;
		boolean acha;
		String resp = "";	

		do{

			System.out.println("Idade a ser pesquisada: ");
			pesq = entrada.nextInt();

			i = 0;
			acha = false;

			while(i <= idade.length-1 && acha == false){
				if(pesq == idade[i]){
					acha = true;
				}else{
					i++;
				}
			}

			if(acha == true){
				System.out.println(pesq + " Localizado na posição : "  + (i+1));
			}else{
				System.out.println(pesq + " Não localizado");
			}

			System.out.println("");
			System.out.println("Deseja Continuar ? [S]im / [N]ão + <Enter>.");

			try{
				BufferedReader br = new BufferedReader(new
						InputStreamReader(System.in));
				resp = br.readLine();
			}catch(Exception e){
				resp = "";
			}
			resp = resp.toUpperCase();

		}while(resp.compareTo("S") == 0);


	}

	public static String ordernarSelection(char corOlhos [] ,  int cont , char sexo[]  , char corBelo [] , int[] idade){

		int auxValorIdade = 0;
		int auxValorCorBelo = 0;
		int auxValorCorOlhos = 0;
		int auxValorSexo = 0;

		int j = 0;

		for (int i = 0; i < cont; i++) {

			auxValorIdade = idade[i];
			auxValorCorOlhos = corOlhos[i];
			auxValorSexo = sexo[i];
			auxValorCorBelo = corBelo[i];

			while((j >= 0) && corOlhos[j] > auxValorCorOlhos){

				corOlhos[j+1] = corOlhos[i];
				idade[j+1] = idade[j];
				corBelo[j+1] = corBelo[i];
				sexo[j+1] = sexo[i];

			}

			idade[j+1] = auxValorIdade;
			corOlhos[j+1] = (char) auxValorCorOlhos;
			corBelo[j+1] = (char) auxValorCorBelo;
			sexo[j+1] = (char) auxValorSexo;
		}
		for (int i = 0; i < cont; i++) {
			System.out.println((i+1) + " Pessoa cor dos olhos : " + corOlhos[i] + " : " + 
					" Idade : " + idade[i] + 
					" Cor do cabelo : " + corBelo[i] + 
					" Sexo : " + sexo[i] );
		}
		return "ordenado";
	}

	public static String ordenarBubble(char corOlhos [] ,  int cont , char sexo[]  , char corBelo [] , int[] idade){

		char auxCorOlhos = 0;
		int auxIdade = 0;
		char auxSexo = 0;
		char auxCabelo = 0;

		boolean controle;

		for (int i = 0; i < cont; i++) {
			controle = true;
			for (int j = 0; j < cont-1; j++) {

				if(corOlhos[j] > corOlhos[j+1]){

					auxCorOlhos = corOlhos[j];
					corOlhos[j] = corOlhos[j+1];
					corOlhos[j+1] = auxCorOlhos;


					auxCabelo = corBelo[j];
					corBelo[j] = corBelo[j+1];
					corBelo[j+1] =auxCabelo;


					auxSexo = sexo[j];
					sexo[j] = sexo[j+1];
					sexo[j+1] = auxSexo;


					auxIdade = idade[j];
					idade[j] = idade[j+1];
					idade[j+1] = auxIdade;

					controle = false;
				}
				if(controle){
					break;
				}
			}
		}

		for (int i = 0; i < cont; i++) {
			System.out.println((i+1) + " Pessoa cor dos olhos : " + corOlhos[i] + " : " + 
					" Idade : " + idade[i] + 
					" Cor do cabelo : " + corBelo[i] + 
					" Sexo : " + sexo[i] );
		}

		return "Listado";
	}


	public static void ordenarInsertionSort(char corOlhos [] ,  int cont , char sexo[]  , char corBelo [] , int[] idade){

		int AuxIdade = 0;
		char AuxCorBelo = 0;
		char AuxSexo = 0;
		char valor = 0;

		int j = 0;
		int e = 0;
		int f = 0;
		int  p = 0;

		for (int i = 1; i < cont; i++) {

			valor = corOlhos[i];// 
			AuxIdade = idade[i];
			AuxCorBelo = corBelo[i];
			AuxSexo = sexo[i];

			j = i - 1;

			while((j >= 0) && corOlhos[j] > valor){

				corOlhos[j+1] = corOlhos[j];
				corBelo[j+1] = corBelo[j];
				idade[j+1] = idade[j];
				sexo[j+1] = sexo[j];

				j = j - 1;

			}

			corOlhos[j+1] = valor;
			idade[j+1] = AuxIdade;
			corBelo[j+1] = AuxCorBelo;
			sexo[j+1] = AuxSexo;

		}

		for (int i = 0; i < cont; i++) {
			System.out.println((i+1) + " Pessoa cor dos olhos : " + corOlhos[i] + " : " + 
					" Idade : " + idade[i] + 
					" Cor do cabelo : " + corBelo[i] + 
					" Sexo : " + sexo[i] );
		}

	}


	public static int Cadastro(int olhoAzul , char sexo[] , char corOlhos [] , char corBelo [] , int[] idade , int cont , int olhoCastanho , int beloPreto , int cabLoiro , int cabeloCastanho , int contSexo) {
		int  i = 0;

		Scanner entrada = new Scanner(System.in);

		for (i = 0; i < cont; i++) {

			do{

				System.out.println("Digite o sexo");
				sexo[i] = entrada.next().toUpperCase().trim().charAt(0);
				if(sexo[i] == 'F'){
					contSexo++;
				}
			}while(!(sexo[i] == 'F' || sexo[i] == 'M'));


			do{

				System.out.println("Selecione a cor de seus olhos : A - Azul , C - Castanho" );
				corOlhos[i] = entrada.next().toUpperCase().trim().charAt(0);

				if(corOlhos[i] == 'C'){
					olhoCastanho++;
				}else
					if(corOlhos[i] == 'A'){
						olhoAzul++;
					}

			}while(!(corOlhos[i] == 'A' || corOlhos[i] == 'C'));


			do{

				System.out.println("Selecione a cor de seus cabelos : P - Preto , L - Loiro - C - Castanho");
				corBelo[i] = entrada.next().toUpperCase().trim().charAt(0);

				if(corBelo[i] == 'P'){
					beloPreto++;
				}else
					if(corBelo[i] == 'L'){
						cabLoiro++;
					}else
						if(corBelo[i] == 'C'){
							cabeloCastanho++;
						}

			}while(!(corBelo[i] == 'P' || corBelo[i] == 'L' || corBelo[i] == 'C'));

			System.out.println("Digite a sua idade");
			idade[i] = entrada.nextInt();

		}

		return i;
	}


	public static void MediaIdade(char corOlhos [] , char corBelo [] , int[] idade , int cont){

		int x = idade.length;
		double armazena = 0;
		for (int j = 0; j < cont; j++) {
			if(corBelo[j] == 'P' && corOlhos[j] == 'C'){
				armazena = armazena + x / cont;				
			}
		}

		System.out.println("Media de idade das pessoas com olhos castanhos e cabelos pretos : " + "\n" + armazena);

	}


	public static void maiorIdade(int[] idade , int cont){

		/*
		 * Faça um método em JAVA que determine e devolva ao programa principal a
		maior idade entre os habitantes.
		 */

		int maior = idade[0];

		for (int i = 0; i < cont; i++) {
			if(idade[i] > maior){
				maior = idade[i];
			}

		}	
		System.out.println("Maior idade entre os habitantes : " + maior);
	}


	public static void qntdF(int contSexo , char sexo[] , int[] idade , int cont , char corBelo [] , char corOlhos [] , int cabeloLoiro , int olhoAzul , int contIdade){

		/*
		 * quantidade
			de indivíduos do sexo feminino com idade entre 18 e 30 anos 
			(inclusive) e que tenham olhos azuis e cabelos louros.
		 */

		for (int i=0; i<cont; i++)
		{
			if((sexo[i] == 'F') && (idade[i] >= 18 || idade[i] >= 30) && (corBelo[i] == 'L')){
				contSexo++;
				cabeloLoiro++;
				olhoAzul++;
				contIdade++;

			}	
		}

		System.out.println("Quantidade de individuos do sexo feminino :" + contSexo);
		System.out.println("Quantidade de individuos do sexo femino de cabelo Loiro : " + cabeloLoiro );
		System.out.println("Quantidade de individuos do sexo femino de olhos azuis : " + olhoAzul);
		System.out.println("Quantidade de individuos do sexo femino entre 18 a 30 anos : " + contIdade);

	}



}
