package le2;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);

		double numero;
		int repeticao=1;

		while(repeticao>0) {
			System.out.println("Digite um número");
			numero= ler.nextDouble();
			if (numero<0) {
				System.exit(1);
			}
			repeticao++;
		}

		ler.close();	

	}

}