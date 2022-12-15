package aula;

import java.util.Scanner;

public class ParametrosSoma {

	public static int operacaoSoma(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		byte valor1 = sc.nextByte();
		System.out.println("Informe outro valor: ");
		byte valor2 = sc.nextByte();
		
		System.out.println(operacaoSoma(valor1, valor2));
		sc.close();
	}

}
