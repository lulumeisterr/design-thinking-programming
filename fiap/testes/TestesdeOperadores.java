package br.com.fiap.testes;

public class TestesdeOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int y = 0;
		
		x = 8;
		y = 18;
		
		
		//P�s fixado incremento
		//++ soma +1
		//& ele verifica todas as condi��es para saber o resultado executada
		//&& / || ele quando encontra o caso verdadeiro ele para de fazer compara��o , ele ja sai do loop
		
		if(x == 8 && y++ == 19){
			System.out.println("Primeiro");
		}else{
			System.out.println("Segundo");
		}
		
	}

}
