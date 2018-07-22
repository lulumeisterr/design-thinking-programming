package br.com.fiap.ExercicioParaPS_2_SEMESTRE;

import java.util.Scanner;

public class Exercicio_PS {

	public static void main(String[] args) {

		int menu = 0;

		int cdpeca [] = new int [5];
		String desc [] = new String [5];
		double qtd [] = new double [5];
		double valorUnit [] = new double [5];
		int compra[] = new int [5];

		int estoqMini = 3;
		int verificaMenu = 0;
		Scanner entrada = new Scanner(System.in);

		//Variavel maxima para manipular q qtd de cadastro

		int qtdC = 0, qtde_maxima=0;

		System.out.println("Deseja cadastrar Quantas vezes ?");
		qtdC = entrada.nextInt();

		do{

			System.out.println("--------Menu--------");

			System.out.println("1 - Cadastrar");
			System.out.println("2 - Vender");
			System.out.println("3 - Comprar ");
			System.out.println("4 - Listar ");
			System.out.println("5 - Sair");
			menu = entrada.nextInt();

			switch (menu) {

			case 1:
				if(qtde_maxima < qtdC){
					qtde_maxima = Cadastrar(cdpeca, desc, qtd, valorUnit, estoqMini,qtdC);
				}else{
			
					System.out.println("Quantidade maxima atingida!");
					System.out.println("Deseja Cadastrar Novamente ? - [ 1 ] Para sim | [0] Para  Não");
					verificaMenu = entrada.nextInt();
					
					if(verificaMenu == 1){
						
						System.out.println("1 - Cadastrar");
						qtde_maxima = 0;
						menu = entrada.nextInt();
						
					}else{
						break;
					}
					
				}
				break;

			case 2:
				vender(cdpeca, desc, qtd, estoqMini);
				break;

			case 3:
				Comprar(cdpeca, desc, compra, qtd);
				break;

			case 4:
				Listar(cdpeca, desc, qtd ,valorUnit , qtdC);
				break;

			case 5:
				System.out.println("Saiu");
				break;


			default:
				System.out.println("Opção não encontrada");
				break;
			}

		}while(menu < 5);

	}

	//-----------------------------------------------------------------------------------------------------------------//
	public static int Cadastrar(int cdpeca [] , String desc[] ,double qtd [] , double valorUnit [] , int estoqMini, int qtdC){
		int k=0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("============================");

		for (k = 0; k < qtdC; k++) {

			System.out.println("Digite o codigo da peça");
			cdpeca[k] = entrada.nextInt();

			System.out.println("Digite a descrição da peça");
			desc[k] = entrada.next();		

			System.out.println("Digite a quantidade de estoque");
			qtd[k] = entrada.nextDouble();

			System.out.println("Digite o valor unitario");
			valorUnit[k] = entrada.nextDouble();

			System.out.println("============================");

		}

		for(int i=0; i<qtdC; i++)
			System.out.println(cdpeca[i]+" "+desc[i]+" "+qtd[i]+" "+valorUnit[i]);

		return (k);

	}

	//------------------------------------------------------------------------------------------------------

	public static void vender(int vet [] , String desc[] , double qtd [] , int estoqMini){
		Scanner entrada = new Scanner(System.in);

		int vender = 0;
		int cd = 0;

		int v = 0;
		int w = 0;
		int q = 0;

		int i =0; //Controlando a pesquisa
		int x = 0;

		int pesq = 0;
		boolean achar = false;

		System.out.println("Digite o codigo da peça");
		pesq = entrada.nextInt();

		while(i <= 4 && achar == false){

			if(pesq == vet[i]){
				achar = true;
				q=i; // Está variavel esta manipulando junto com o indice , para achar o valor
			}else{
				i++;
			}
		}

		if(achar == true){
			System.out.println("Codigo : " + "[" + pesq + "]"  + " Localização na posição " + (i+1));

			System.out.println("Descrição da peça : " + desc[q]);

			System.out.println("Quantas peças você deseja vender ?");
			vender = entrada.nextInt();

			if(vender > qtd[q]){

				System.out.println(" Você não tem quantidade reservada suficiente para realizar esta venda ");
				System.out.println("Digite novamente");
				vender = entrada.nextInt();	
				vender++;

			}

			//Quantidade em estoque - quantidade vendida >= Estoque minimo

			x = (int) qtd[q] - vender;

			if(x < estoqMini){

				System.out.println("Impossivel realizar está operação , "
						+ "Seu estoque é : " + qtd[q] + " "
						+ "E seu estoque minimo é " + estoqMini);
			}

		}else
			if(achar == false){
				System.out.println("Codigo : " + "[" + pesq + "]"  + " Não localizado");
			}

	}

	//------------------------------------------------------------------------------------------------------
	public static void Comprar(int vet [] ,  String desc[] , int compra [] , double qtd []){

		Scanner entrada = new Scanner(System.in);

		int i = 0; // Indice para verificar o codigo
		int d = 0; // Indice para a descrição
		int c = 0; // Indice para verificar a compra
		int verifica = 0;
		int p = 0;
		int verificarPeca = 0;

		double guarda = 0;


		System.out.println("Digite o codigo da peça");
		verifica = entrada.nextInt();

		if(verifica == vet[i]){

			System.out.println("Descrição solicitada : " + desc[d]);

			System.out.println("Deseja comprar quantas peças ? ");
			compra[c] = entrada.nextInt();

			if(compra[c] > qtd[c]){
				//Se o codigo da compra for maior que a quantidade no estoque
				do{

					System.out.println("Não há recurso suficiente para realizar a compra");

					System.out.println("Digite o codigo da peça para verificar o estoque");
					verificarPeca = entrada.nextInt();

					for (int j = 0; j < 1; j++) {
						System.out.println("Seu estoque é : " + qtd[j]);
					}

					System.out.println("Digite a quantidade que deseja comprar novamentes ? ");
					compra[c] = entrada.nextInt();

					p++;

				}while(compra[c] > qtd[c]);

			}

			guarda = compra[c] + qtd[c];
			System.out.println("Soma da quantidade solicitada com o estoque : " + guarda);

		}else{

			do{

				for (int j = 0; j < 3; j++) {

					System.out.println("É Nessesario cadastrar um codigo para realizar a compra");
					System.out.println("Digite novamente");
					verifica = entrada.nextInt();

					System.out.println("Você pode digitar mais " + (j-2) + " vezes");
				}

			}while(verifica > 3);
		}


	}

	//------------------------------------------------------------------------------------------------------
	public static void Listar(int vet [] ,  String desc[] , double qtd [] , double valorUnit [] , int qtdC){

		Scanner entrada = new Scanner(System.in);

		String codigo = "";


		System.out.println(" [1] - Deseja ordenar por codigo ? Digite o codigo para realizar a consulta");
		System.out.println(" [2] - Deseja ordenar por nome ? Digite o nome para realizar a consulta");
		System.out.println(" [3] - Deseja ordenar por valorUnitario ?");
		codigo = entrada.next();

		if(codigo.equals("1")){

			OrderNarPorNumero(vet,desc, qtd , valorUnit , qtdC);

		}else
			if(codigo.equals("2")){

				OrderNarPorNome(vet, desc, qtd, valorUnit,qtdC);

			}else
				if(codigo.equals("3")){

					OrdernarValorUnitario(vet, desc, qtd, valorUnit,qtdC);

				}


	}


	public static void OrderNarPorNumero(int vet [], String desc[], double qtd [], double ValorUnit[] , int qtdC){


		int aux = 0;
		String auxD = "";
		double auxQtd = 0;
		double auxValorUnit = 0 ;

		boolean controle;

		for(int i = 0 ; i <qtdC; ++i){
			controle = true;
			for(int j = 0 ; j < qtdC-1; ++j){
				if(vet[j] < vet[j + 1]){

					//codigo

					aux =  vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;

					//descricao

					auxD =  desc[j];
					desc[j] = desc[j + 1];
					desc[j + 1] = auxD;

					//qtde_estoque

					auxQtd =  qtd[j];
					qtd[j] = qtd[j + 1];
					qtd[j + 1] = auxQtd;

					//valor_unit

					auxValorUnit =  ValorUnit[j];
					ValorUnit[j] = ValorUnit[j + 1];
					ValorUnit[j + 1] = auxValorUnit;

					controle = false;
				}
			}
			if(controle){
				break;
			}
		}
		for (int i = 0; i < qtdC; i++) {
			System.out.println("Codigo : " + vet[i] + " " + 
					"Descrição : " +  desc[i] + " " + 
					" Quantidade estoque : " + qtd[i] + "" + 
					" Valor unitario : " + ValorUnit[i]);
		}

	}
	public static void OrderNarPorNome(int vet [], String desc[], double qtd [], double ValorUnit[] , int qtdC){

		int aux = 0;
		String auxD = "";
		double auxQtd = 0;
		double auxValorUnit = 0 ;

		boolean controle;

		for(int i = 0 ; i <qtdC; i++){
			controle = true;
			for(int j = 0 ; j < qtdC-1; j++){
				if(desc[j].compareTo(desc[j + 1]) > 0){

					auxD =  desc[j];
					desc[j] = desc[j + 1];
					desc[j + 1] = auxD;

					controle = false;
				}
			}
			if(controle){
				break;
			}
		}
		for (int i = 0; i < qtdC  ; i++) {
			System.out.println(" Descrição : " +  desc[i]);
		}

	}

	public static void OrdernarValorUnitario(int vet [], String desc[], double qtd [], double ValorUnit[] , int qtdC){

		int aux = 0;
		String auxD = "";
		double auxQtd = 0;
		double auxValorUnit = 0 ;

		boolean controle;

		for(int i = 0 ; i <qtdC; ++i){
			controle = true;
			for(int j = 0 ; j < qtdC-1; ++j){
				if(ValorUnit[j] < ValorUnit[j + 1]){

					//valor_unit

					auxValorUnit =  ValorUnit[j];
					ValorUnit[j] = ValorUnit[j + 1];
					ValorUnit[j + 1] = auxValorUnit;

					//descricao

					auxD =  desc[j];
					desc[j] = desc[j + 1];
					desc[j + 1] = auxD;

					//qtde_estoque

					auxQtd =  qtd[j];
					qtd[j] = qtd[j + 1];
					qtd[j + 1] = auxQtd;

					//valor_unit

					auxValorUnit =  ValorUnit[j];
					ValorUnit[j] = ValorUnit[j + 1];
					ValorUnit[j + 1] = auxValorUnit;

					//codigo

					aux =  vet[j];
					ValorUnit[j] = vet[j + 1];
					ValorUnit[j + 1] = aux;

					controle = false;
				}
			}
			if(controle){
				break;
			}
		}
		for (int i = 0; i < qtdC  ; i++) {
			System.out.println(" Valor unitario : " + ValorUnit[i] + " " +
					"Descrição : " +  desc[i] + " " + 
					" Quantidade estoque : " + qtd[i] + "" + 
					"Codigo : " + vet[i] + " ");
		}
	}
}
