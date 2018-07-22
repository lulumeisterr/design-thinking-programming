package br.com.fiap.FOR_WHILE;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		float media = 0 , mediaM = 0 , media1 = 0 , media2 = 0, media3 = 0, media4 = 0 , media5 = 0;

		for (int i = 0;i  <= 5; i++) {


			System.out.println("Digite a primeira nota: ");
			media = entrada.nextInt();
			
			//Pegando a maior nota
			if(media1 > media2){
				System.out.println(media1);
			}else{
				mediaM = media2;
			}
			
	
			//Mostrando a menor Nota
			if(media1 > media2){
				System.out.println(media1);
				media = media1;
			}else
				if(media1 > media3){
					System.out.println(media1);
					media = media1;
				}else
					if(media1 > media4){
						System.out.println(media1);
						media = media1;
					}else
						if(media1 > media5){
							System.out.println(media1);
							media = media1;
						}
			if(media2 > media1){
				System.out.println(media2);
				media = media2;
			}else
				if(media2> media3){
					System.out.println(media2);
					media = media2;
				}else
					if(media2 > media4){
						System.out.println(media2);
						media = media2;
					}else
						if(media2 > media5){
							System.out.println(media2);
							media = media2;
						}
			if(media3 > media1){
				System.out.println(media3);
				media = media3;
			}else
				if(media3 > media2){
					System.out.println(media3);
					media = media3;
				}else
					if(media3 > media4){
						System.out.println(media3);
						media = media3;
					}else 
						if(media3 > media5){
							System.out.println(media3);
							media = media3;
						}
			if(media4> media1){
				System.out.println(media4);
				media = media4;
			}else
				if(media4 > media2){
					System.out.println(media4);
					media = media4;
				}else
					if(media4 > media3){
						System.out.println(media4);
						media = media4;
					}else 
						if(media4> media5){
							System.out.println(media4);
							media = media4;
						}
			if(media5 > media1){
				System.out.println(media5);
				media = media5;
			}else
				if(media5 > media2){
					System.out.println(media5);
					media = media5;
				}else
					if(media5 > media3){
					System.out.println(media5);
					media = media5;
					}else 
						if(media5 > media4){
							System.out.println(media5);
							media = media5;
						}
			

		}
		System.out.println("Menor nota :" + media);
		System.out.println("Maior Nota :" + media);
	}
}
