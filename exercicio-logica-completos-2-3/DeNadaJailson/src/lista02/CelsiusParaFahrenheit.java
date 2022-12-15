package lista02;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus celsius: ");
		float celsius = sc.nextFloat();
		float fahrenheit = celsius/5*9+32;
		System.out.println("Esta mesma temperatura em graus fahreneheits é: "+fahrenheit);
		sc.close();
	}
	
}
