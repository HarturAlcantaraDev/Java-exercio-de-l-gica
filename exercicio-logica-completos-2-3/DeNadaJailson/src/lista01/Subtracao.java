package lista01;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int numero2 = sc.nextInt();
		int resultado = numero1-numero2;
		System.out.println("A subtração dos resultados correspondentes é: "+resultado);
		sc.close();
	}
}
