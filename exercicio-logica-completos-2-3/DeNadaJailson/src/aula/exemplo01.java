package aula;

import java.util.Scanner;

public class exemplo01 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int valor = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int valor2 = sc.nextInt();
		int soma = valor+valor2;
		System.out.println("A soma corerspondente é: "+soma);
		sc.close();
	}
	
}
