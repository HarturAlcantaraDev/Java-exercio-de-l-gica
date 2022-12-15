package lista01;

import java.util.Scanner;

public class AreaTrapezio {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da base maior do trapézio: ");
		int bMaior = sc.nextInt();
		System.out.println("Informe o valor da base menor do trapézio: ");
		int bMenor = sc.nextInt();
		System.out.println("Informe a altura do trapézio: ");
		int altura = sc.nextInt();
		int resultado = (bMaior+bMenor) * altura / 2;
		System.out.println("A área do trapézio correspondente é: "+resultado);
		sc.close();
		
	}
}
