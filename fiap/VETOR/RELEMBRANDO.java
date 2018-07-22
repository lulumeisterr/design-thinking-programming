package br.com.fiap.VETOR;

import java.util.Scanner;

public class RELEMBRANDO {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int janela [] = new int [24],x;
		int corredor [] = new int [24];

		String menu = "";
		String Ja = "";
		
		for (int j = 0; j < janela.length; j++) {
			janela[j] = 0;			//Zera tudo antes, se colocar dentro do laço
			corredor[j] = 0;
		}
		
		do{
		System.out.println("\n- - - - EMPRESA XYZ - - - -");
		System.out.println("Selecione sua opção");
		System.out.println("1 - Vender passagem");
		System.out.println("2 - Mostrar mapa de ocupação");
		System.out.println("3 - Sair");
		menu = entrada.next();	
		
		switch (menu) {
		
		case "1":

			System.out.println("Venda de passagem");
			
				System.out.println("Você deseja janela ou corredor , [J] e [C]");
				Ja = entrada.next();
				
				if(Ja.equals("J")){
					System.out.println("Voce solicitou a Janela(Poltrona)");
					
						System.out.println("Solicite o numero da poltrona [ 1 a 24 ]");
						x = entrada.nextInt();//Variavel auxiliar para poltrona 
						
						if(janela[x-1] == 0){
							System.out.println("Poltrona Vazia");
							System.out.println("Venda Realizada!");
							janela[x] = 1;
						}												
						else{
							System.out.println("A poltrona já esta ocupada. Tente novamente");
							break;
						}
						
						break;
				}else
					if(Ja.equals("C")){
						System.out.println("Você Solicitou o corredor! ");													
							System.out.println("Qual o numero da poltrona [ 1 a 24 ]");
							x = entrada.nextInt();
							
							if(corredor[x-1] == 0){
								System.out.println("Poltrona Vazia");
								System.out.println("Venda realizada!");
								corredor[x] = 1;								
							}
							else{
								System.out.println("A poltrona já esta ocupada. Tente novamente");
								break;
							}
					}			
			break;

		case "2":
			System.out.println("Mostrar mapa de ocupação");
			System.out.println("\n- - - - - JANELAS - - - - -");
			for (int j = 1; j < janela.length; j++) {
				//System.out.println(j+1);
					if (janela[j] == 0) {
						System.out.println(j +" - Livre");
					}
					else {
						System.out.println(j +" - Ocupada");
					}
			}
			System.out.println("\n- - - - - CORREDOR - - - - -");
			for (int c = 1; c < corredor.length; c++) {
				//System.out.println(j+1);
					if (corredor[c] == 0) {
						System.out.println(c +" - Livre");
					}
					else {
						System.out.println(c +" - Ocupada");
					}
			}
			break;
			
		case "3":
			System.out.println("Obrigado por usar o programa");
			System.out.close();
			break;
					
		default:
			System.out.println("Opção inválida");
		}				
		}while(menu != "3");
	}
}