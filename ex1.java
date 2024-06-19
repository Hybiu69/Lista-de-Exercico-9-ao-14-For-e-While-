package le2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int numeros[] = new int [20], maiores=0;
		
		for(int i =0; i<20;i++) {
			
			System.out.println("Insira os números");
			numeros[i]=ler.nextInt();
			
			if (numeros[i]>8) {
				maiores++;
			}
		}
		System.out.println("Você digitou "+maiores+" números maiores que 8");
		
		

		ler.close();
	}

}