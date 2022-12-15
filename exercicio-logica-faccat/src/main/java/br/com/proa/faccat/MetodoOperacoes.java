package br.com.proa.faccat;

import java.util.Scanner;

public class MetodoOperacoes {

	public static void main(String[] args) {

		// System.out.println(soma());
		// System.out.println(divisao());
		// System.out.println(multiplicacao());
		// System.out.println(subtracao());
		soma();

	}

	public static int soma() {

		int n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite um numero: ");
		n2 = sc.nextInt();
		System.out.println("Resultado = ");
		sc.close();

		return n1 + n2;

	}

	public static int divisao() {

		int n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite um numero: ");
		n2 = sc.nextInt();
		System.out.println("Resultado = ");
		sc.close();

		return n1 / n2;

	}

	public static int multiplicacao() {

		int n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite um numero: ");
		n2 = sc.nextInt();
		System.out.println("Resultado = ");
		sc.close();

		return n1 * n2;

	}

	public static int subtracao() {

		int n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite um numero: ");
		n2 = sc.nextInt();
		System.out.println("Resultado = ");
		sc.close();

		return n1 - n2;

	}

}
