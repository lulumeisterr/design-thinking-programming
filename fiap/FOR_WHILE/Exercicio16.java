package br.com.fiap.FOR_WHILE;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0;
		int op = 0;
		String nome;
		
		//vars2
		
		int otimo = 0;
		int bom =0;
		int pes = 0;
		int regular = 0;
		int nao = 0;
		int guardaIdade = 0;
		int guardaOp = 0;
		double TotalPessoa = 0;
		//Var
		int digito  = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes voce Deseja realizar esta pesquisa"));
		int indice = 0;
	
		Scanner entrada = new Scanner(System.in);

		while(indice<digito){
		
		System.out.println("Digite seu Nome");
		nome = entrada.next();

		System.out.println("Digite sua idade");
		idade = entrada.nextInt();

		System.out.println("Digite sua opnião sobre o Filme");
		System.out.println(" 1 - Otimo");
		System.out.println(" 2 - Bom");
		System.out.println(" 3 - Regular");
		System.out.println(" 4 - Pessimo");
		System.out.println(" 5 - Não sabem dizer");

		op = entrada.nextInt();
	
		indice++;

		if(op == 1){
			otimo++;	
		}else
			if(op == 2){
				bom++;
			}else 
				if(op == 3){
					regular++;
				}else 
					if(op == 4){
					pes++;
					guardaIdade = guardaIdade + idade;
					guardaIdade = guardaIdade/pes;
				}else 
					if(op == 5){
						nao++;
						TotalPessoa = 100*nao/100;
					}
		}
		
		System.out.println("Quantidade de pessoas que acharam o Filme Otimo :" + otimo);
		System.out.println("Media de Pessoas que responderam Pessimo : " + guardaIdade);
		System.out.println("Porcentagem das Pessoa que  Não sabe dizer :" + TotalPessoa);
	}
	
}


