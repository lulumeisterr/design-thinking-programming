package br.com.fiap.NAC;

import java.util.Scanner;

public class NAC02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int senha = 0 , senhavalida =0;
		int i = 3;
		
		do {

			System.out.println("Digite uma senha para cadastrar");
			senha = entrada.nextInt();	

			for (int j = 0; j < 3; j++) {
				
				System.out.println("Digite uma senha novamente");
				senhavalida = entrada.nextInt();
				
				if(senha == senhavalida){
					System.out.println("entrou");
					break;
				}else{
					System.out.println(" Senha incorreta " + ( j + 1));
				}
				
			}
			
			if(senha != senhavalida){
				System.out.println("=========expirou suas tentativas========");
			}
	
		}while (senha < 3);

}
	}