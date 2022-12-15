package lista02;

import java.util.Scanner;

public class LataOleo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do raio: ");
		int raio = sc.nextInt();
		System.out.println("Informe o valor da altura: ");
		int altura = sc.nextInt();
		float pi = 3.14f;
		float volume = pi * (raio*raio) * altura;
		System.out.println("O volume desta lata de óleo é de: "+volume);
		sc.close();
	}
	
}
