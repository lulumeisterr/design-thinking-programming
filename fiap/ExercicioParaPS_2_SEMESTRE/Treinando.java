package br.com.fiap.ExercicioParaPS_2_SEMESTRE;

import java.util.Scanner;

public class Treinando {

	/*
	 * https://pt.stackoverflow.com/questions/97300/um-break-dentro-de-dois-for-funciona-na-verdade-como-um-continue
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int menu = 0;
		int cont = 0;

		String loginCadastro[][] = new String[5][2];
		String comparar[][] = new String[5][2];
		String Validar [][] = new String [5][2];

		System.out.println("====================================");
		System.out.println("----------BEM VINDO-------");
		System.out.println("====================================");

		do {

			System.out.println("=====================================");

			System.out.println("1 - Cadastre-se");
			System.out.println("2 - Login");
			System.out.println("3 - Comprar");
			System.out.println("4 - Listar");
			System.out.println("5 - Sair");

			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				Cadastrar(loginCadastro, comparar , cont);
				break;
			case 2:
				Logar(loginCadastro, comparar , cont , Validar);
				break;
			case 3:
				Comprar(comparar , cont , Validar);
				break;
			case 4:
				break;
			case 5:
				System.out.println("Saiu");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}

		} while (menu < 5);
	}

	public static String Cadastrar(String loginCadastro [][] ,String comparar [][] , int cont ){

		int q = 0 , p = 0;

		cont = 0;

		String verifica= "";
		String verificarParada = "";

		Scanner entrada = new Scanner(System.in);

		System.out.println("-----------------------");
		System.out.println("-----AREA DE CADASTRO--");
		System.out.println("-----------------------");

		first:
			for (int i = 0; i < 5; i++) {

				System.out.println("Digite seu Nome");
				loginCadastro[i][0] = entrada.next();

				System.out.println("Digite sua Senha");
				loginCadastro[i][1] = entrada.next();


				cont++; //Removendo o null

				System.out.println("Deseja Para ? [S] = Sim / [N] = Não");
				verificarParada = entrada.next();

				if(verificarParada.equalsIgnoreCase("s")){
					break first;
				}

			}

		System.out.println("Deseja Rever seus dados Cadastrados [Y] ou [N]");
		verifica = entrada.next();

		if(verifica.equalsIgnoreCase("y")){

			for (int k = 0; k < cont; k++) {
				System.out.println("    Login  "+loginCadastro[k][0] + "\n" + "senha : " + loginCadastro[k][1]);

			}
		}else
			if(verifica.equalsIgnoreCase("n")){
				System.out.println("Cadastrado");
			}

		comparar[q][0] = loginCadastro[q][0];
		comparar[q][1] = loginCadastro[q][1];

		return "Cadastrado";
	}


	@SuppressWarnings("unused")
	public static void Logar(String[][] loginCadastro , String comparar[][] , int cont , String Validar [][]){

		//Solucionar o login 
		//Não consigo lugar com 2 Pessoas diferente

		Scanner entrada = new Scanner(System.in);
		cont = 0;

		String nome = "";
		String senha = "";	

		System.out.println("-----------------------");
		System.out.println("------AREA DE LOGIN----");
		System.out.println("-----------------------");

		pausa:
			for (int j = 0; j < 5; j++) {

				System.out.println("Nome");
				nome = entrada.next();

				System.out.println("Senha");
				senha = entrada.next();

				cont++;

				Validar[j][0] = nome;
				Validar[j][1] = senha;

				if (Validar[j][0].equals(comparar[j][0]) && Validar[j][1].equals(comparar[j][1])){

					System.out.println("----------Logado-----------");
					for (int i = 0; i < cont; i++) {
						System.out.println("Usuario : " + loginCadastro[i][0]);
					}

				}else{
					System.out.println("Usuario ou/ Senha Invalidos !!!");
				}

				break pausa;
			}
	}



	public static void Comprar(String comparar[][] , int cont , String Validar [][]){

		cont = 0;

		
	}
}










