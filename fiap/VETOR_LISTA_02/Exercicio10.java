package br.com.fiap.VETOR_LISTA_02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		String desc = "" , quest = "" , quest2 = "";
		int c = 0, a , v , e , s ,  i = 0, j = 0, k = 0 ,  qntd = 0 , pro = 0 ,  id , codigoProd = 0 , codigo1 = 0;
		boolean codVerdade , codFalso;

		int codigo[] = new int[5];
		String descricao[] = new String[5];
		int quantidade[] = new int[5];

		do {

			System.out.println("Digite o sua senha ");
			id = entrada.nextInt();

			if(id != 123){
				System.out.println("senha incorreta");
			}else{
				System.out.println("Senha Correta");

				break;
			}



		} while (id != 123);


		
		do{


			System.out.println("===================================================");

			System.out.println("Você deseja ...");

			System.out.println(" 1 - Cadastrar o produto");
			System.out.println(" 2 - Alterar produto ");
			System.out.println(" 3 - Visualizar o produto ");
			System.out.println(" 4 - Excluir o produto");
			System.out.println(" 5 - Sair ");
			pro = entrada.nextInt();



			switch (pro) {


			//Inserir
			
			case 1:
				//codigo[i]++;
				
				if(i>codigo.length)
					System.out.println("Numero maximo de produto já cadastrado");
				else
				{
				codigo[i] = c+1;
				System.out.println("Informe a descrição do  produto");
				desc = entrada.next();
				descricao[i] = desc; 
			
				System.out.println("Quantidade de Estoque");
				qntd = entrada.nextInt();
				quantidade[i] = qntd;
				
				System.out.println("Produto Cadastrado com sucesso");
				System.out.println("Seu codigo é : " + codigo[i]);
				i++;
				c++;
				}
				break;


				//Alterar


			case 2:
				
				//Validando Caso o usuario Digite 0 ou algum codigo que nao foi Cadastrado
				//while(codigo1 != codigo[i] || codigo1 <= 0 || codigo[i] <= 0){


					if(i==0)
						System.out.println("Nenhum produto cadastrado");	
					else{
					System.out.println("Informe o codigo do produto");
					c = entrada.nextInt();
					
					//Visualizando Todos Produtos Cadastrados
					for(int w=0; w<i;w++)
					{
					if(c == codigo[w]){
						//System.out.println("codigo invalido ou Produto Não Cadastrado");
					
						System.out.println("Informe a descrição do  produto");
						desc = entrada.next();
						descricao[w] = desc; 
					
						System.out.println("Quantidade de Estoque");
						qntd = entrada.nextInt();
						quantidade[w] = qntd;
						
						System.out.println("Produto Cadastrado com sucesso");	
					}
					else
						System.out.println("codigo invalido ou Produto Não Cadastrado");
					//if(codigo1 == 5){
					//	System.out.println("Programa finalizado");
					//	break;
					//}
						
					}
					}
					
				//}
				
				//Verificando se o codigo é existente e mostrando o CODIGO a ser usado
				/*
					if(c == codigo[i] || c <= codigo[i]){

					System.out.println("Codigo Existente :" + c);
					codVerdade = true;
					
					//Caso não seja D ou Q 
					while(!(quest.equals("D")) && (!(quest.equals("Q")))){
						System.out.println("Você deseja Alterar A Descrição [ D ] ou a Quantidade de Produto [ Q ] : ? ");
						quest = entrada.next().toUpperCase();

					}

					if(quest.equals("D")){

						System.out.println("Descrição Inserida : " + descricao[i]);

						if(descricao[0] == desc){
							System.out.println(true);

							System.out.println("Digite a Descrição novamente : ");
							desc = entrada.next();

							descricao[0] = desc;
							System.out.println("Descrição Alterada para:" + descricao[i]);

						}else{
							System.out.println("Descrição não encontrada ");

						}
					}else
						if(quest.equals("Q")){

							System.out.println("Quantidade inserida no cadastro : " + quantidade[i]);

							if(quantidade[i] == qntd){

								System.out.println(true);

								System.out.println("Digite a quantidade novamente : ");
								qntd = entrada.nextInt();

								quantidade[i] = qntd;

								System.out.println("Quantidade alterada para : " + quantidade[i]);

							}else{
								System.out.println("Quantidade não encontrada");
							}
						}

				}
*/
				break;

				//Visualizar
			case 3:
				
		
				for(int w=0; w<i;w++)
				{
			

					System.out.println("Codigo Existente :" + codigo[w]);
					

					System.out.println("========Busca========");

					System.out.println("Codigo Inserido : " + codigo[w]);
					System.out.println("Descrição do produto : " + descricao[w]);
					System.out.println("Quantidade estoque : " + quantidade[w]);

			
				
				}
			
				break;
			case 4:
				if(i==0)
					System.out.println("Nenhum produto cadastrado");	
				else{
				System.out.println("Informe o codigo do produto");
				c = entrada.nextInt();
				for(int w=0; w<i;w++)
				{
				if(c == codigo[w]){
					System.out.println("Código encontrado");
					for(int p=w; p<i;p++){
						codigo[w]=codigo[w+1];
						descricao[w]=descricao[w+1];
						quantidade[w]=quantidade[w+1];
					}
					System.out.println("Código excluido");
					i--;
	
				    }

				}
				break;
				}
				//System.out.println("Informe o codigo do produto que deseja Deletar : ");
				//codigo1 = entrada.nextInt();

				/*if(codigo1 != codigo[i] || codigo1 <= 0){

					System.out.println("codigo não encontrado");
					break;

				}else{

					System.out.println("Codigo Existente : " + codigo[i]);
					System.out.println(true);

				}


				//do{

				System.out.println("Você deseja resetar os dados (Y) - sim / (N) - Não ? : ");
				quest2 = entrada.next();


				if(quest2.toUpperCase().equals("Y")){

					codigo[i] =  codigo[0] = 0;
					System.out.println("Codigo NULL");


					descricao[i] = desc = "";
					System.out.println("DESC NULL");


					quantidade[i] = qntd = 0;
					System.out.println("QNT NULL");


					System.out.println("Todos os dados foram resetados para NULL");


					break;

				}else{
					System.out.println("Reset Cancelado");
				}
*/
				//break;

			case 5:

				if(pro == 5){
					System.out.println("Programa Terminado");
				}

				break;

			} 



		}while (pro < 5);
		//System.out.println("Programa Terminado");


		//System.out.println("ToTal de codigos Cadastrados : " + codigo.length);
	}

}


