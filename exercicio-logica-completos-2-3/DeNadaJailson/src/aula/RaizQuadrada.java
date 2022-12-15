package aula;

import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Solicite um valor: ");
		int valor = sc.nextInt();
		
		double Rquadrada;

		Rquadrada = Math.sqrt(valor);
		System.out.println("A raiz quadrada deste número é: "+Rquadrada);
		sc.close();
	}
	
}
