package le2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		int numeros[] = new int [20], maiores=0,repeticao=0;
		
		while(repeticao<20) {
			
			System.out.println("Insira os números");
			numeros[repeticao]=ler.nextInt();
			
			if (numeros[repeticao]>8) {
				maiores++;
			}
		repeticao++;	
		}
		System.out.println("Você digitou "+maiores+" números maiores que 8");
		ler.close();
	}

}
