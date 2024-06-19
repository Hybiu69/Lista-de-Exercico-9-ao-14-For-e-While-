package le2;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int entre=0,repeticao=0;
		int numero[]=new int [20];

		while (repeticao<20) {
			System.out.print("Digite um número: ");
			numero[repeticao]= ler.nextInt();

			if (numero[repeticao] >= 0 && numero[repeticao] <= 100) {
				entre++;
			}
			repeticao++;
		}

		System.out.println("Você digitou "+entre+" números entre 0 e 100");

		ler.close();

	}

}
