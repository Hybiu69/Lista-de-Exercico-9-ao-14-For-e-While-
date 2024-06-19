package le2;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String nome []= new String[10];
		int idade []=new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("Qual o nome? ");
			nome[i]=ler.next();
			
			System.out.println("Qual a idade? ");
			idade[i]=ler.nextInt();
		}
		
		int menorIdade = idade[0];
	    String nomemaisnova = nome[0];

	    for (int i = 1; i < 10; i++) {
	      if (idade[i] < menorIdade) {
	        menorIdade = idade[i];
	        nomemaisnova = nome[i];
	      }
	    }
	    System.out.println("O nome da pessoa com a menor idade é "+nomemaisnova);
	   	
		ler.close();
	}

}
