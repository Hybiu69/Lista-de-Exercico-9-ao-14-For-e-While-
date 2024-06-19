package le2;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		Scanner ler= new Scanner (System.in);

		double numero;

		for(int i=1;i>0;i++) {
			System.out.println("Digite um número");
			numero= ler.nextDouble();
			if (numero<0) {
				System.exit(1);
			}	
		}

		ler.close();	
	}

}