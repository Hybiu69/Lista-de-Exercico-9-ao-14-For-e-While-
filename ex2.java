package le2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner (System.in);
		
		int numeros[] = new int [20], pares=0;
		
		for(int i =0; i<20;i++) {
			
			System.out.println("Insira os números");
			numeros[i]=ler.nextInt();
			
			if (numeros[i]%2==0) {
				pares++;
			}
		}
		System.out.println("Você digitou "+pares+" números pares");
		
		ler.close();

	}

}