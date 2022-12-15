package aula;

import java.util.Scanner;

public class ParametrosSubtracao {

	public static int operacaoSubtracao(byte x, byte y) {
		return x - y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		byte valor = sc.nextByte();
		System.out.println("Informe outro valor: ");
		byte valor2 = sc.nextByte();
		System.out.println(operacaoSubtracao(valor, valor2));
		sc.close();
	}

}
