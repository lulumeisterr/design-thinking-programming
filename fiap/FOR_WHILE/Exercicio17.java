package br.com.fiap.FOR_WHILE;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int user;
		
		int digito = Integer.parseInt(JOptionPane.showInputDialog
				("Digite a quantidade de vezes que você deseja"));
		
		int indice = 0;
		int qntidade = 0 ;
		
		int media = 0;
		int week = 0;
		
		//Day
		
		int segunda = 0, terca  = 0, 
			quarta =0 , 
			quinta =0 , 
			sexta =0;
			
			
		
		while(indice<digito){
		
		System.out.println("Digite A idade ou  -1 para sair:");
		user = entrada.nextInt();
		
		if(user != -1){
			
			
			System.out.println("Digite o dia da semana");
			
			System.out.println("1 - Segunda");
			System.out.println("2 - Terca");
			System.out.println("3 - Quarta");
			System.out.println("4 - Quinta");
			System.out.println("5 - Sexta");
			week = entrada.nextInt();
			
			qntidade++;
			
			//a media de idade
			media = media + user;
			

		//Frequentadores no dia
			
		if(week == 1){
			segunda++;
		}else
			if(week == 2){
				terca++;
			}else 
				if(week == 3){
				quarta++;
			}else 
				if(week == 4){
				quinta++;
			}else 
				if(week == 5){
				sexta++;
			}
		}
		
		
		indice++;
	}

		System.out.println("Pessoas que frequentaram o clube: "
				+ "Segunda-feira" + "\n" + segunda + "Pessoas" + "\n" +
				  "Terça-Feira" + terca + "\n" + 
				  "Quarta-Feira" + quarta + "\n" + 
				  "Quinta-Feira " + quinta + "\n" +
				  "Sexta-Feira" + sexta);
		
		System.out.println("Media de idades:" + media/digito);
		
	}
}
