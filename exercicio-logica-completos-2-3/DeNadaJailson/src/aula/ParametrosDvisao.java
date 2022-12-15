package aula;

import java.util.Scanner;

public class ParametrosDvisao {

	public static float operacaoDivisao(byte x, byte y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		byte valor = sc.nextByte();
		System.out.println("Informe outro valor: ");
		byte valor2 = sc.nextByte();
		
		System.out.println(operacaoDivisao(valor, valor2));
		sc.close();
	}

}
