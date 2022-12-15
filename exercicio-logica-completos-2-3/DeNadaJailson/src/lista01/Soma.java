package lista01;

import java.util.Scanner;

public class Soma {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int resultado;
		
		System.out.println("Digite um valor: ");
		numero1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		numero2 = sc.nextInt();
		resultado = numero1+numero2;
		System.out.println("A soma correspondente: "+resultado);
		sc.close();
	}
}
