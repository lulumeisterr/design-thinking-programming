package br.com.fiap.testes;

public class Testes {

	public static void main(String[] args) {
		
		int d,e;
        char c;
	String a;
	int b = 7458;
	a = String.valueOf(b);
	System.out.println("posicao - "+ a.length());  
	c = a.charAt(0);
	System.out.println("posicao "+c);
	 int i = Character.getNumericValue(c);
		System.out.println("resultado " + i);
	        System.out.println("resultado " + (i+i));
		
	}

}
