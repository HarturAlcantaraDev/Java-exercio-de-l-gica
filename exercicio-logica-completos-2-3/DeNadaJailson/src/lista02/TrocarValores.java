package lista02;

import java.util.Scanner;

public class TrocarValores {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int valor2 = sc.nextInt();
		int auxiliar = valor1;
		valor1= valor2;
		valor2=auxiliar;
		System.out.println("Abracadabra, agora o primeiro valor é: "+valor1);
		System.out.println("Abracadabra, agora o segundo valor é: "+valor2);
		sc.close();
	}
	
}
