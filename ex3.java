package le2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int entre=0;
		int numero[]=new int [20];
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Digite um número: ");
			 numero[i]= ler.nextInt();

			if (numero[i] >= 0 && numero[i] <= 100) {
				entre++;
			}
		}

		System.out.println("Você digitou "+entre+" números entre 0 e 100");

		ler.close();

	}
}