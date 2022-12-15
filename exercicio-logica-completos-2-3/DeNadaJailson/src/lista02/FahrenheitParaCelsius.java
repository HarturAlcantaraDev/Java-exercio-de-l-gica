package lista02;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit :");
		float farenheit = sc.nextFloat();
		float celsius = (farenheit-32)*5/9;
		System.out.println("Esta mesma temperatura em graus celsius é de: "+celsius);
		sc.close();
	}
	
}
