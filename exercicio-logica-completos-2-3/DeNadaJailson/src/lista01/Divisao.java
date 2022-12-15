package lista01;

import java.util.Scanner;

public class Divisao {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o dividendo: ");
		int numero1 = sc.nextInt();
		System.out.println("Informe o divisor: ");
		int numero2 = sc.nextInt();
		int resultado = numero1/numero2;
		System.out.println("A divisão dos valores correspondentes é: "+resultado);
		sc.close();
	}
}
