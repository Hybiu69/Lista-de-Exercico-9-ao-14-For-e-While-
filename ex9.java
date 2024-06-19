package le2;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		int entre=0,entre2=0,maiores=0,repeticao=0;
		int numero[]=new int [20];

		while (repeticao<20) {
			System.out.print("Digite um número: ");
			numero[repeticao]= ler.nextInt();

			if (numero[repeticao] >= 0 && numero[repeticao] <= 100) {
				entre++;
			}
			if (numero[repeticao] >=101 && numero[repeticao] <=200) {
				entre2++;
			}
			if (numero[repeticao]>200){
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
