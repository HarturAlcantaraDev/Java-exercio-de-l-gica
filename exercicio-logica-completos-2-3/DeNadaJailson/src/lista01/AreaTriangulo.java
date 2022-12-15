package lista01;

import java.util.Scanner;

public class AreaTriangulo {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do triângulo: ");
		int base = sc.nextInt();
		System.out.println("Digite a largura do triângulo: ");
		int altura = sc.nextInt();
		int areaT = (base*altura)/2;
		System.out.println("A área do triângulo é: "+areaT);
		sc.close();
	}
}
