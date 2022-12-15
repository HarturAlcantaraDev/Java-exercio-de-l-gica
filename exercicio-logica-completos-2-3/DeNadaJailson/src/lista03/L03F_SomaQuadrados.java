package lista03;

import java.util.Scanner;

public class L03F_SomaQuadrados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Informe o terceiro valor: ");
		int valor3 = sc.nextInt();
		
		int resultado = (valor1*valor1)+(valor2*valor2)+(valor3*valor3);
		
		System.out.println("A soma dos quadrados correspondentes é de: "+resultado);
		sc.close();
	}

}
