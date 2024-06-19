package le2;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		int entre=0,entre2=0,maiores=0;
		int numero[]=new int [20];

		for (int i = 0; i < 20; i++) {
			System.out.print("Digite um número: ");
			numero[i]= ler.nextInt();

			if (numero[i] >= 0 && numero[i] <= 100) {
				entre++;
			}
			if (numero[i] >=101 && numero[i] <=200) {
				entre2++;
			}
			if (numero[i]>200){
				maiores++;
			}
		}
		System.out.println("");
		System.out.println("Você digitou "+entre+" números entre 0 e 100");
		System.out.println("Você digitou "+entre2+" números entre 101 e 200");
		System.out.println("Você digitou "+maiores+" números maiores que 200");

		ler.close();
	}

}