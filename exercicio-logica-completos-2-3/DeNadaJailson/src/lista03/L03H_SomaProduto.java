package lista03;

import java.util.Scanner;

public class L03H_SomaProduto {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();
		System.out.println("Digite o quarto valor: ");
		int valor4 = sc.nextInt();
		
		int produto = valor1*valor3;
		int soma = valor2+valor4;
		
		System.out.println("O produto do primeiro com o terceiro valor é de: "+produto);
		System.out.println("A soma do segundo com o terceiro valor é de: "+soma);
		sc.close();
	}
	
}
