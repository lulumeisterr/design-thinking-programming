package br.com.fiap.NAC;

import java.util.Scanner;

public class NAC03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		String vetMes[] = {"JANEIRO" , "FEVEREIRO" , "MARÇO" , "ABRIL" , "MAIO" , "JUNHO" , "JULHO" , "AGOSTO" , "SETEMBRO" , "Outrubro" , "Novembro" , "DEZEMBRO",""};
		int num = 0 , i = 0 , j = 0;
		
		do {

			do {
				
			System.out.println("Digite um numero para saber o mes");
			num = entrada.nextInt();
			
			if(num <= 0){
				System.out.println("Esse numero não existe");
			}else
				if(num > 12){
					System.out.println("Apenas Meses de 1 ate 12 ");
				}
			
			} while (num > 12 || num <= 0);
			
			switch (num) {
			case 1:

				vetMes[1] = "JANEIRO";
				System.out.println("O Mes que corresponde ao número " + num  + " É " + vetMes[1]);

				break;

			case 2: 

				vetMes[2] = "FEVEREIRO";
				System.out.println("O Mes que corresponde ao número " + num + " É " + vetMes[2]);

				break;
			
			case 3:
				
				vetMes[3] = "MARÇO";
				System.out.println("O Mes que corresponde ao número : " + num + " É " + vetMes[3]);
				
				break;
				
			case 4:
				
				vetMes[4] = "ABRIL";
				System.out.println("O Mes que corresponde ao número : " + num + " É " + vetMes[4]);
				
				break;
				
			case 5:
				vetMes[5] = "MAIO";
				System.out.println("O Mes que corresponde ao número : " + num + " É " + vetMes[5]);
				
				break;
				
				
			case 6:
				vetMes[6] = "JUNHO";
				System.out.println("O Mes que corresponde ao número : " + num + " É " + vetMes[6]);
				
				break;
				
				
			case 7:
				vetMes[7] = "JULHO";
				System.out.println("O Mes que corresponde ao número : " + num + " É " + vetMes[7]);
				
				break;
				
				
			case 8:
				vetMes[8] = "AGOSTO";
				System.out.println("O Mes que corresponde ao número : " + num + " É " + vetMes[8]);
				
				break;
				
				
			case 9:
				vetMes[9] = "SETEMBRO";
				System.out.println("O Mes que corresponde ao número : " + num + " É " + vetMes[9]);
				
				break;
				
				
			case 10:
				vetMes[10] = "OUTUBRO";
				System.out.println("O Mes que corresponde ao número : " + num + " É " + vetMes[10]);
				
				break;
				
				
			case 11:
				vetMes[11] = "NOVEMBRO";
				System.out.println("O Mes que corresponde ao número : " + num + " É " + vetMes[11]);
				
				break;
				
				
			case 12:
				vetMes[12] = "DEZEMBRO";
				System.out.println("O Mes que corresponde ao número : " + num + " É " + vetMes[12]);
				
				break;
				
			}
			
		} while (i < 0);
	}


}


