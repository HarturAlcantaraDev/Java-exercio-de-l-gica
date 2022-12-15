package lista03;

import java.util.Scanner;

public class L03C_QuadradoDiferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Informe um valor: ");
		int valor2 = sc.nextInt();
		int diferenca = valor1-valor2;
		int quadrado = diferenca*diferenca;
		System.out.println("O quadrado da diferença dos valores informados é de: "+quadrado);
		sc.close();

	}

}
