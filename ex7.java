package le2;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int numeros[] = new int [20], pares=0,repeticao=0;

		while(repeticao<20) {

			System.out.println("Insira os números");
			numeros[repeticao]=ler.nextInt();

			if (numeros[repeticao]%2==0) {
				pares++;
			}
			repeticao++;
		}
		System.out.println("Você digitou "+pares+" números pares");

		ler.close();


	}

}