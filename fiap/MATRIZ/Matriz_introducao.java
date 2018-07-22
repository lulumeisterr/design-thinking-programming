package br.com.fiap.MATRIZ;

public class Matriz_introducao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Linhas Uma linha funciona como um vetor
		//Colunas

		
		//Array de array
										//Linhas   //Colunas
		double[][] notaAlunos = new double[3][4];
		//Inicializando uma matriz Ex:
		// double[] notaAlunos = {{7, 8, 9, 10}
		
		
		notaAlunos[0][0] = 10;
		notaAlunos[0][1] = 7;
		notaAlunos[0][2] = 9;
		notaAlunos[0][3] = 9.5;
		
		notaAlunos[1][0] = 10;
		notaAlunos[1][1] = 7;
		notaAlunos[1][2] = 9;
		notaAlunos[1][3] = 9;
		
		notaAlunos[2][0] = 8;
		notaAlunos[2][1] = 9;
		notaAlunos[2][2] = 10;
		notaAlunos[2][3] = 7;
		
		//Exibindo na tela
		
		//For Alinhado
		for(int i = 0; i <notaAlunos.length; i++){
			
			for (int j = 0; j < notaAlunos[i].length; j++) {
				//Faltando as posição das colunas
				//Percorrendo a segunda parte do vetor
				
				System.out.println(notaAlunos[i][j] + " ");
			}
			
			//Fazendo uma quebra de linha
			
			System.out.println();
		}
		
		//Mudança de Valores
		notaAlunos[1][3] = 8;
		
		System.out.println("Calculando a media");
		
		double soma;
		
		for (int i = 0; i < notaAlunos.length; i++) {
			//Quando der o loop novamente iremos iniciar a soma como 0
			soma = 0;
			for (int j = 0; j < notaAlunos[i].length; j++) {
				soma += notaAlunos[i][j];
			}
			
			System.out.println("Media do Aluno " + i + " é : " + (soma/4));
		}
	}

}
