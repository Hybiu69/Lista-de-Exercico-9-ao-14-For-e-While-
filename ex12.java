package le2;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		String nome []= new String[10];
		int idade []=new int[10];
		int repeticao1=0,repeticao2=0;
		
		while(repeticao1<10) {
			System.out.println("Qual o nome? ");
			nome[repeticao1]=ler.next();
			
			System.out.println("Qual a idade? ");
			idade[repeticao1]=ler.nextInt();
			repeticao1++;
		}
		
		int menorIdade = idade[0];
	    String nomemaisnova = nome[0];

	    while (repeticao2<10) {
	      if (idade[repeticao2] < menorIdade) {
	        menorIdade = idade[repeticao2];
	        nomemaisnova = nome[repeticao2];
	        repeticao2++;
	      }
	    }
	    System.out.println("O nome da pessoa com a menor idade é "+nomemaisnova);
	   	
		ler.close();


	}

}
