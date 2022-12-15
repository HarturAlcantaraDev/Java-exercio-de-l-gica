package lista02;

import java.util.Scanner;

public class PrestacaoValor {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor a ser pago: ");
		float valor = sc.nextFloat();
		System.out.println("Informe a taxa de aumento por tempo não pago: ");
		int taxa = sc.nextInt();
		System.out.println("Informe quantos meses ficou sem pagar: ");
		int meses = sc.nextInt();
		float prestacao = valor+(valor*taxa/100) * meses;
		System.out.println("O novo valor a ser pago é de: "+prestacao);
		sc.close();
	}
	
}
