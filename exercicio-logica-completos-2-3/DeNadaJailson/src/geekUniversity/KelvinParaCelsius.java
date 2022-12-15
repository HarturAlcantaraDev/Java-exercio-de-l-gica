package geekUniversity;

import java.util.Scanner;

public class KelvinParaCelsius {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em kelvin: ");
		float kelvin = sc.nextFloat();
		float celsius = kelvin-273.15f;
		System.out.println("Esta mesma temperatura em graus celsius é: "+celsius);
		sc.close();
	}

}
